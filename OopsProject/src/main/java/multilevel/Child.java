package multilevel;

public class Child extends Parent {
	public void childname() {
		System.out.println("childname");
	}
	public static void main(String[] args) {
		Child obj=new Child();
		obj.childname();
		obj.parentname();
		obj.grandparentname();
	}

}
