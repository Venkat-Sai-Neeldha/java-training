package exam;

import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author venkat
 * 
 * @apiNote main method for execution
 * 
 */
public class Main {

	/**
	 * @apiNote main method for execution
	 * 
	 * */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Manager manager = new Manager();

		/** Taking user input for patients */
		System.out.println("Enter the number of patients:");
		int n = scanner.nextInt();
		scanner.nextLine();

		for (int i = 0; i < n; i++) {
			try {
				System.out.println("Enter details for patient " + (i + 1) + ":");

				System.out.print("Patient ID: ");
				int patientId = scanner.nextInt();
				scanner.nextLine();

				System.out.print("Name: ");
				String name = scanner.nextLine();

				System.out.print("Age: ");
				int age = scanner.nextInt();

				System.out.print("Disease: ");
				scanner.nextLine();
				String disease = scanner.nextLine();

				System.out.print("Bill Amount: ");
				double billAmount = scanner.nextDouble();

				System.out.print("patient is critical :yes or no ");
				scanner.nextLine();
				String isCritical = scanner.nextLine();

				if (isCritical.equalsIgnoreCase("yes")) {
					System.out.print("ICU Days: ");
					int icuDays = scanner.nextInt();
					CriticalPatient criticalPatient = new CriticalPatient(patientId, name, age, disease, billAmount,
							icuDays);
					manager.addPatients(criticalPatient);
				} else {
					Patient patient = new Patient(patientId, name, age, disease, billAmount);
					manager.addPatients(patient);
				}
			} catch (InvalidAgeException | LowBillException e) {
				System.out.println("Error: " + e.getMessage());
				i--;
			}
            finally {
            	scanner.close();
            }
		}
	

		/** sorting the values */
		
		manager.sortedMap();

		/** Display patients grouped by disease */
		
		System.out.println("\nDisplaying patients grouped by disease:");
		manager.displayAllPatients();
	}
}
