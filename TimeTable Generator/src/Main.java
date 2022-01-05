
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
			
				List<String> teachers = new LinkedList<String>();
				List<String> subjects = new LinkedList<String>();
				
				
//				addTeachers(teachers);
//				addSubjects(subjects);
				
/*
 * 
 * 				
 * 				2nd yr - 3 subjects
 * 
 * 
 * 					A section
 * 				DSA - Chinamy - 101 - 4
 *				Unix - Rashmi - 102 - 3
 *				Python - Anusha - 103 - 2
 *
 * * 				B section
 * 				DSA - Rashmi - 102 - 4
 *				Unix - Anusha - 103 - 3
 *				Python - Chinmai - 101 - 2
 *
 * * 				C section
 * 				DSA - Anusha - 103 - 4
 *				Unix - Chinmai - 101 - 3
 *				Python - Rashmi - 102 - 2
 *
 *

 				
 
*/
				Faculty chinmay = new Faculty("Chinmay", 101);
				Faculty rashmi = new Faculty("Rashmi", 102);
				Faculty anusha = new Faculty("Anusha", 103);
				
				Subject dsa = new Subject("DSA", 4, 2, 1);
				Subject unix = new Subject("Unix", 3, 2, 1);
				Subject python = new Subject("Python", 2, 2, 1);
				
				chinmay.addSubject(dsa);
				chinmay.addSubject(unix);
				chinmay.addSubject(python);
				
				rashmi.addSubject(dsa);
				rashmi.addSubject(unix);
				rashmi.addSubject(python);
				
				anusha.addSubject(dsa);
				anusha.addSubject(unix);
				anusha.addSubject(python);
				
				Entity A_1 = new Entity(dsa, chinmay);
				Entity A_2 = new Entity(unix, rashmi);
				Entity A_3 = new Entity(python, anusha);
				PriorityQueue<Entity> A_sec = new PriorityQueue<Entity>();
				A_sec.add(A_1);
				A_sec.add(A_2);
				A_sec.add(A_3);
				
				
				Entity B_1 = new Entity(dsa, rashmi);
				Entity B_2 = new Entity(unix, anusha);
				Entity B_3 = new Entity(python,chinmay);
				PriorityQueue<Entity> B_sec = new PriorityQueue<Entity>();
				B_sec.add(B_1);
				B_sec.add(B_2);
				B_sec.add(B_3);
				
				
				Entity C_1 = new Entity(dsa, anusha);
				Entity C_2 = new Entity(unix, chinmay);
				Entity C_3 = new Entity(python, rashmi);
				PriorityQueue<Entity> C_sec = new PriorityQueue<Entity>();
				C_sec.add(C_1);
				C_sec.add(C_2);
				C_sec.add(C_3);
				
				
				List<PriorityQueue<Entity>> entries = new LinkedList<>();
				
				entries.add(A_sec);
				entries.add(B_sec);
				entries.add(C_sec);
			
				
				Entry tt[][][] = new Entry[3][6][7];
				
				for(int i=0; i<3; i++) {
					tt[i] = new Entry[6][7];
				}
				
				
				generate(entries, 0, 0, 0, tt);
				
				printTimeTable(tt);
				
				System.out.println("Done");
				
		}
		
		static void printTimeTable(Entry tt[][][]) {
			
			for(int i=0; i<tt.length; i++) {
				for(int j=0; j<6; j++) {
					for(int k=0; k<7; k++) {
						Entry temp = tt[i][j][k];
						if(temp != null)
							System.out.print(temp.subject.name+"-"+temp.teacher.name+" ");
						else
							System.out.print("------------");
					}
					System.out.println();
				}
				System.out.println("   ");
			}
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
			
			
//			System.out.println(day+" "+hour);
			if(currentclass > 2) return true;
		
			
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
			
//			System.out.println(cache);
			for(int i=0; i<totalEntries; i++) {
				Entity toBeAdded = cache.get(i);
				
				
				if(checkIfCanBeAdded(toBeAdded, tt, currentclass, day, hour)) {
					Entry newEntry = new Entry(toBeAdded.subject, toBeAdded.teacher);
					
					Entry temp = curTT[day][hour];
					
					curTT[day][hour] = newEntry;
					
//					System.out.println(newEntry+" "+day+" "+hour);
					
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
//						System.out.println(currentclass);
//						printSingleClass(tt[currentclass]);
						new_currentclass++;
						new_day = 0;
						new_hour = 0;
					}
					else {
						new_day = new_pair.first;
						new_hour = new_pair.second;
					}
					
//					System.out.println(curClass);
//					
//					System.out.println(toBeAdded+" added at "+day+" "+hour+" "+currentclass);
//					System.out.println("Next coords "+new_day+" "+new_hour+" "+new_currentclass+"\n");
					
					
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
					
					System.out.println(toBeAdded+" removed from "+day+" "+hour+" "+currentclass+"\n");
					curClass.clear();
					
					entries.set(currentclass, curClass);
					
				}
				
				//TODO: Check for other constraints.
				
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
