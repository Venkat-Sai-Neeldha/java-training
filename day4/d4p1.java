package day4;

public class d4p1 {

	public static void main(String[] args) {
		//multiplication table of a number
        int val=5;
		for(int i=1;i<=10;i++) {
			//break statement
			if(val*i>50) {
				break;
			}
			//continue statement
			else if(i==3){
				continue;
			}
			else {
               System.out.println(val+" * "+i+" = "+val*i);
			}
	}

}
}
