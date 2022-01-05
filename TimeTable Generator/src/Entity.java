

public class Entity implements Comparable<Entity>{
	public Faculty teacher;
	public Subject subject;
	public int subjecthour;
	
	public Entity(Subject sub, Faculty teac) {
		subject = sub;
		teacher = teac;
		subjecthour = sub.totalHr;
	}
	
	public int compareTo(Entity e)
    {
        return e.subjecthour - this.subjecthour;
    }
	
	public String toString() {
		// TODO Auto-generated method stub
		return this.subject+"-"+this.teacher+" "+this.subjecthour;
	}
}
