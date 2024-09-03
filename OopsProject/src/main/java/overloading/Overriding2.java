package overloading;

public class Overriding2 extends Overriding1 {
	public void display() {	
	System.out.println("hello");
	
}
	public static void main(String[] args) {
		Overriding2 object=new Overriding2();
		object.display();// get results of child class only
		//parent class property can be obtained using "super" keyword
		

	}

}
