
public class Subject {
	public String name;
	public int totalHr;
	public int year;
	public int section;
	
	public Subject(String name, int totalHr, int year, int section) {
		this.name = name;
		this.totalHr = totalHr;
		this.year = year;
		this.section = section;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}
}
