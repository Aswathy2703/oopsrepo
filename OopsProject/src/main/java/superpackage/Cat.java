package superpackage;

public class Cat extends Animal {
	String name="Agneya";// instance varisble same as parent class variable
	public void show() {
		System.out.println(name);
		System.out.println(super.name);//immediate parent class name is referred
	}
public static void main(String args[]) {
	Cat obj=new Cat();
	obj.show();
	
}
}