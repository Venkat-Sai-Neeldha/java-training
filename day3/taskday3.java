import java.util.Scanner;
public class taskday3 {

	public static void main(String[] args) {
//task1
		//take string as an input
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.nextLine();
		
		//convert to upper case
		String upperString=str.toUpperCase();
		System.out.println(upperString);
		
		//convert to lower case
		String lowerStr=str.toLowerCase();
		System.out.println(lowerStr);
		sc.close();
		
		//length of string\
		System.out.println(str.length());
		
		//replace substring
		String str3="hi hello how are you";
		System.out.println(str3.replace("h","q"));
	}

}
