package day6;

/**
 * @author venkat
 * @apiNote this is a program to check palindrome using recursion
 */
public class palindrome {
    // recursion method
	static boolean ispal(String str,int stidx,int eidx) {
		if(stidx==eidx) {
			return true;
		}
		if(str.charAt(stidx)!=str.charAt(eidx)) { //checking characters at both index positions
			return false;
		}
		if(stidx<eidx+1){     // checking condition until st index is less than ending index
			return ispal(str,stidx+1,eidx-1);
		}
	return true;
	}
	
	
	public static void main(String[] args) {
		
      String str="madam";   //given string
      int len=str.length();
      
    if(ispal(str,0,len-1)==true) { //condition for palindrome
    	System.out.println("it is a palindrome");
    }
    else {
    	System.out.println("it is not a palindrome");
    }
	}

}
