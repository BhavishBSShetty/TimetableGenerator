import java.util.*;


public class Faculty {
	public String name;
	public int id;
	public List<Subject> subjects;
	public int firstHrCount = 2;
	
	public Faculty(String name, int id) {
		this.name = name;
		this.id = id;
		subjects = new LinkedList<Subject>();
	}
	
	public void addSubject(Subject sub) {
		subjects.add(sub);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}
}
