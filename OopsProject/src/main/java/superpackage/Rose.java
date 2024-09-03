package superpackage;

public class Rose extends Flower {
	Rose()
	{
		//super();//constructor invoke, provide above sysout
		//if we donot provide super keyword compiler himself provide the super () keyword
		System.out.println("Rose");
	}

	public static void main(String[] args) {
		Rose object= new Rose();
		

	}

}
