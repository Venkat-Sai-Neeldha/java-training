package exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author venkat
 * @apiNote manager class for execution
 */
public class Manager {
	private static Map<String, List<Patient>> mapper = new HashMap<>();

	/**
	 * Adding patients
	 * 
	 * @throws LowBillException
	 * @throws InvalidAgeException
	 * @return adds patient details into the Hashmap
	 * 
	 */
	public static void addPatients(Patient patient) throws InvalidAgeException, LowBillException {
		String disease = patient.getDisease();
		List<Patient> list1 = mapper.getOrDefault(disease, new ArrayList<Patient>());

		/**
		 * checking for invalid age
		 */
		if (patient.getAge() < 1) {
			throw new InvalidAgeException("enter a valid age ");
		} else if (patient.getBill() < 5000) {
			throw new LowBillException("bill amount is less than 5000");
		}
		// }
		/**
		 * adding into the hashmap
		 * 
		 */
		list1.add(patient);
		mapper.put(disease, list1);

	}

	/**
	 * @author venkat
	 * @return map with a sorted order in descending order
	 * 
	 */

	public void sortedMap() {
		for (Map.Entry<String, List<Patient>> entry : mapper.entrySet()) {
			List<Patient> patients = entry.getValue();
			Collections.sort(patients, new Comparator<Patient>() {
				@Override
				public int compare(Patient patient1, Patient patient2) {
					return Double.compare(patient2.getBill(), patient1.getBill()); // Descending order
				}
			});
		}
	}
/**
 * 
 * @author venkat
 * @params method to display all patients
 * @return the patient details in a entry set
 * 
 * */
	public void displayAllPatients() {
		for (Map.Entry<String, List<Patient>> entry : mapper.entrySet()) {
			System.out.println("Disease: " + entry.getKey());
			for (Patient patient : entry.getValue()) {
				System.out.println(patient);
			}
		}

	}

}
