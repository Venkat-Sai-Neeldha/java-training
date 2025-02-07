
public class d3p3 {

	public static void main(String[] args) {
		//creating a string buffer
		StringBuffer str=new StringBuffer("hello");
		//appending a string
		str.append(" java");
		System.out.println(str);
		
		//insert at specific position
		str.insert(5," this is string buffer");
		System.out.println(str);
		// delete a word from string buffer
		str.delete(0, 5);
		System.out.println(str);
        // string to int
		String strnum="123";
		int num=Integer.parseInt(strnum);
		System.out.println(num);
		//int to string
		int num1=34;
		String str2=Integer.toString(num1);
		System.out.println(str2);
	}

}
