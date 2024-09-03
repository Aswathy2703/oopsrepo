//get value from main method and print in default instance method-create constructor
package aggregation;

public class Employee {
	//instance variable
	int id;
	String name;
	Address address;//reference object of class Address as instance variable
	Employee(int id, String name,Address address)//local method
	{
		this.id=id;// both variables should be same
		this.name=name;
		this.address=address;
		//this is provide if parameter of local and instance variable are same
	}
	//default instance method
public void display() {
	System.out.println(id+"  "+name);
	System.out.println( address.city+"  "+ address.state+"  "+ address.country+"  ");
}
	public static void main(String[] args) {
		Address address1=new Address("Pathanamthitta", "Kerala", "India");
		Employee object=new Employee(2301600, "Aswathy", address1);
		object.display();
	
	}

}
//"Pathanamthitta", "Kerala", "India" passes to address1 then 2301600, "Aswathy", goes to
//Employee(int id, String name,Address address) then call, System.out.println
//( address.city+"  "+ address.state+"  "+ address.country+"  ");
