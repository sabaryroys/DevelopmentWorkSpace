package devWorkPackage;
import devWorkPackage.readNumber;
import devWorkPackage.TextEditor;
import devWorkPackage.TheHomeWork;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		//readNumber rn = new readNumber();
		//rn.calculateWord();
		//TextEditor te = new TextEditor();
		//te.textEditor();
		int j=1;
		System.out.println("Enter the test case number");
		Scanner sc = new Scanner(System.in);
		int tcs = sc.nextInt();
		TheHomeWork hw  = new TheHomeWork();
		while(j<=tcs)
		{
		 hw.homework();
		j++;
		}

	}

}
