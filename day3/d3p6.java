
public class d3p6 {

	public static void main(String[] args) {
	//two strings using literals
	  String str="hi";
	  String str1="hi";
	  //two strings using new keyword
	  String str2= new String("hello");
	  String str3=new String("hello");
	  //comparing literals
	  System.out.println(str==str1);
	  System.out.println(str.equals(str1));
      //comparing objects
	  System.out.println(str2==str3);
	  System.out.println(str2.equals(str3));
	}

}
