
public class day3p2 {

	public static void main(String[] args) {
		
//task2
		//creating stringBuilder object
		StringBuilder str=new StringBuilder("hello");
		str.toString();
		StringBuilder revstr=str.reverse();
		System.out.println(revstr);
		//palindrome or not
		String str2="howareyou";
		String str3="";
		for(int i=0;i<str2.length();i++) {
			str3=str3+str2.codePointAt(i);
		}
		if(str2.equals(str3)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not");
		}
		

	}

}
