package src.testPackage;

public class Berries {
	String berry = "blue";

	public static void main(String[] args) {
	new Berries().juicy("Straw");
		//System.out.println(berry);
	}

 void juicy(String berry)
	{
		
		//berry = this.berry;
		this.berry = "red";
		System.out.println(berry+"berry");
	}
	

}
