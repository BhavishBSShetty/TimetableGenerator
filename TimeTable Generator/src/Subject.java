
public class Subject {
	public String name;
	public int totalHr;
	public int year;
	
	public Subject(String name, int totalHr, int year) {
		this.name = name;
		this.totalHr = totalHr;
		this.year = year;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}
}
