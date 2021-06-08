import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		int choice;
		System.out.println("Pich one : 1.Hi\t2.Hey\t3.Hello\t:");
		Scanner s = new Scanner(System.in);
		choice = s.nextInt();
		switch(choice)
		{
		case 1 : System.out.println("Hi");
		break;
		case 2 : System.out.println("Hey");
		break;
		case 3 : System.out.println("Hello");
		break;
		default : System.out.println("Invalid Choice!");
		}
	}

}
//By Aditya Kuranjekar------------->>>HAPPY CODING<<<<<<----------
