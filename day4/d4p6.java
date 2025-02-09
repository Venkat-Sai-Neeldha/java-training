package day4;

public class d4p6 {

	public static void main(String[] args) {
		int number=10;
		int firstno=-1;
		int secondno=1;
		int sum;
		for(int i=0;i<number;i++) {
			sum=firstno+secondno;
			
			if(sum%3==0 && sum%5==0) {
				System.out.println(sum+" :I am spiderman and ironman");
			}
			else if(sum%3==0) {
				System.out.println(sum+" :I am spiderman");
			}
			else if( sum%5==0) {
				System.out.println(sum+" :I am ironman");
			}
			else {
				System.out.println(sum+" : i am zero");
			}
			firstno=secondno;
			secondno=sum;
			
		}

	}

}
