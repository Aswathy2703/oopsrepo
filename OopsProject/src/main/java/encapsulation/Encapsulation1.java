package encapsulation;

public class Encapsulation1 {
private int age;//variable is provided as private
private String name;
public String getName() //parameterised method
{
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
}


// setname--binder