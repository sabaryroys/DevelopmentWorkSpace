package src.testPackage;

public class HappyString {
	static int tempinput = 26 ;
	
	public static void printHello()
	{
		//int intialAsciiVal = 97;
		//this.tempinput = 5;
		int b = /*intialAsciiVal*/ 97 + tempinput;
		for(int i =tempinput ;i> 0;i--)
		{
			b--;
		char c = (char)b;
System.out.print(c); 
	}
}

}