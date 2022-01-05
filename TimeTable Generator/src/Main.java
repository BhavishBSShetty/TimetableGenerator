
import java.util.*;
import java.util.logging.Logger;

class Pair{
	int first, second;
	
	Pair(int fir, int sec){
		first = fir;
		second = sec;
	}
}

public class Main {

		public static void main(String[] args) {
				
				List<PriorityQueue<Entity>> entries = Helper.getDummyData();
			
				
				Entry tt[][][] = new Entry[12][6][7];
				
				for(int i=0; i<4; i++) {
					tt[i] = new Entry[6][7];
				}
				
				generate(entries, 0, 0, 0, tt);
				
				Helper.printTimeTable(tt);
				
				System.out.println("Done");
				
		}
		
		
		static boolean outOfBounds(int day,  int hour) {
			if((day < 0 || day > 5 || hour < 0 || hour > 6)) return true;
	
			if(day == 5 && (hour == 4 || hour == 5 || hour == 6)) return true;
			
			return false;
		}
		
		static Pair getNewCoords(int day, int hour) {
			day = (day + 1)%6;
	
			if(day == 0) {
				hour++;
			}
			
			return new Pair(day, hour);
		}
		
		static boolean checkWithAlreadyFilled(Entity ent, Entry tt[][], int day, int hour) {
			
			Entry newEntry = tt[day][hour];
			if(newEntry != null && ent.teacher == newEntry.teacher) return true;
			
			return false;
		}
		
		static boolean checkIfCanBeAdded(Entity ent, Entry tt[][][], int current, int day, int hour) {
			
			for(int i=0; i<current; i++) {
				if(checkWithAlreadyFilled(ent, tt[i], day, hour)) {
					return false;
				}
			}
			
			for(int col = 0; col<hour; col++) {
				Entry newEntry = tt[current][day][col];
				if(newEntry != null && ent.teacher == newEntry.teacher) return false;
			}
			
			if(hour == 0) {
				if(ent.teacher.firstHrCount == 0) {
					return false;
				}
			}
			
			return true;
		}
		
		static boolean generate(List<PriorityQueue<Entity>> entries, int currentclass, int day, int hour, Entry tt[][][]) {
			
			if(currentclass > 11) return true;
		
			
			if(outOfBounds(day, hour)) {
				return false;
			}
						
			Pair new_pair = getNewCoords(day, hour);
			
			PriorityQueue<Entity> curClass = entries.get(currentclass);
			
			if(tt[currentclass][day][hour] != null) {
	
				int new_day, new_hour;
				
				if(curClass.isEmpty()) {
					currentclass++;
					new_day = 0;
					new_hour = 0;
				}
				else {
					new_day = new_pair.first;
					new_hour = new_pair.second;
				}
				
				return generate(entries, currentclass, new_day, new_hour, tt);
			}			
			
						
			List<Entity> cache = new LinkedList<Entity>();
			
			Entry curTT[][] = tt[currentclass];
			
			int totalEntries = curClass.size();
			
			while(!curClass.isEmpty()) {
				cache.add(curClass.remove());
			}
			
			for(int i=0; i<totalEntries; i++) {
				Entity toBeAdded = cache.get(i);
				
				
				if(checkIfCanBeAdded(toBeAdded, tt, currentclass, day, hour)) {
					Entry newEntry = new Entry(toBeAdded.subject, toBeAdded.teacher);
					
					Entry temp = curTT[day][hour];
					
					curTT[day][hour] = newEntry;
										
					toBeAdded.subjecthour -= 1;
					
					if(hour == 0) {
						toBeAdded.teacher.firstHrCount -= 1;
					}
					
					if(toBeAdded.subjecthour == 0) {
						cache.remove(i);
					}
					
					curClass.addAll(cache);
					
					entries.set(currentclass, curClass);
					
					int new_day, new_hour, new_currentclass = currentclass;
					
					if(curClass.isEmpty()) {
						new_currentclass++;
						new_day = 0;
						new_hour = 0;
					}
					else {
						new_day = new_pair.first;
						new_hour = new_pair.second;
					}
										
					
					if(generate(entries, new_currentclass, new_day, new_hour, tt)) {
						return true;
					}
					
					curTT[day][hour] = temp;
					
					toBeAdded.subjecthour += 1;
					
					if(hour == 0) {
						toBeAdded.teacher.firstHrCount += 1;
					}
					
					if(toBeAdded.subjecthour == 1) {
						cache.add(i, toBeAdded);
					}
					
					curClass.clear();
					
					entries.set(currentclass, curClass);
					
				}
				
				
			}
			curClass.addAll(cache);
			
			entries.set(currentclass, curClass);
			
			int new_day, new_hour, new_currentclass = currentclass;
			
			if(curClass.isEmpty()) {
				new_currentclass++;
				new_day = 0;
				new_hour = 0;
			}
			else {
				new_day = new_pair.first;
				new_hour = new_pair.second;
			}
			
			return generate(entries, new_currentclass, new_day, new_hour, tt);
			
		}
}
