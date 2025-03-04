package exam;
import java.math.BigInteger;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter details one by one: in following order(patient Id, name,age,disease ,billamount");
	    Integer Id=	scan.nextInt();
	    String name=scan.next();
	    Integer age=scan.nextInt();
		String disease=scan.next();
		double bill=scan.nextDouble();
		
		Patient p1=new Patient(Id, name, age, disease, bill);
    
	}

}


/**
 *   Ask the user for n Patient (including CriticalPatient).
        For each Patient , take input for all fields.
        If the Patient  is a CriticalPatient, take input for icuDays.
        Use a to validate input and retry in case of errors.
 * 
 * */
 