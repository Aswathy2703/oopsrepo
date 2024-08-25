package hierarchical;

public class Class_C extends Class_A{
	public void cdisplay() {
		System.out.println("Class C");
	}

	public static void main(String[] args) {
		Class_C obj=new Class_C();
		obj.cdisplay();
		obj.adisplay();
		
		Class_B obje=new Class_B();
		obje.bdisplay();
		obje.adisplay();

	}

}
