
/**
 * @author venkat
 * @apiNote this is a program to print first N primes
 * 
 * **/
import java.util.Scanner;
public class First_N_primes {
	 public static boolean isPrime(int number) {
   	  for(int i=2;i<number;i++) {
   		  if(number%i==0) {
   			  return false;
   		  }
   	
   	  }
   	  return true;
     }
     
     //checking the caselabel using method
     public static String switchcase(int var) {
   	  String caselabel="";
   	  
   	  // if else ladder for case labels
   	  if(var<10) return caselabel="small";
   	  else if(var>=10 && var<=50)  return caselabel="medium";
   	  else return caselabel="large";
     }
     
     //main method for counting no of primes
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);

	// selecting no of primes using variable
        System.out.println("enter the no of primes required");
		int No_of_primes=scan.nextInt();
		int count=0;
		int var=2;
		
		//while loop for counting primes
		while(count<=No_of_primes) {
			
			//calling is prime method
			if(isPrime(var)==true) {
				count=count+1;
				 
				// calling switch case condition methods
				 String caselabel=switchcase(var);
				switch(caselabel) {
				case "small":
					System.out.println(var+" small");
				     break;
				case "medium":
					System.out.println(var+" medium");
				     break;
				case "large":
					System.out.println(var +" large");
					
				}
		}
			// incrementing the value count
			var=var+1;

	}
	scan.close();

}


}
