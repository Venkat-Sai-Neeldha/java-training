import java.util.Scanner;
/**
 * @author venkat
 * @apiNote this is program to grade students
 * 
 * **/
public class grading {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//taking user input
		System.out.println("enter marks  : ");
		int marks=sc.nextInt();
	    int label=marks/10;
		if (marks>100 || marks<0) {
			System.out.println("invalid input");
		}
		else {
		switch(label) {
		case 10: case 9:
			System.out.println("Grade A");
			break;
		case 8:
			System.out.println("Grade B");
			break;
		case 7:
			System.out.println("Grade C");
			break;
		case 6:
			System.out.println("Grade D");
			break;
		case 5: case 4: case 3: case 2: case 1:
			System.out.println("Fail");
			break;
		default:
			System.out.println(" please enter valid input");
			break;
			
		}
		}
		sc.close();

	}

}
