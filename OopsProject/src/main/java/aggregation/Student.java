package aggregation;

public class Student {
	String name;
	Details=details;
Student(String name, Details details){
	this.name=name;
	this.details=details;
	}
public void display() {
	System.out.println(name+"   ");
	System.out.println(Details.school+"   "+Details.id+"  ");
	
}
	public static void main(String[] args) {
		Details object=new Details("Choice", 02);
		Student obj=new Student("Agneya", object);
		
		obj.display();

	}}
	
