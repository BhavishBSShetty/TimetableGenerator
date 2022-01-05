
public class Entry {
	public Faculty teacher;
	public Subject subject;
	
	public Entry(Subject sub, Faculty teac) {
		subject = sub;
		teacher = teac;
	}
		
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.subject+"-"+this.teacher;
	}
}
