package exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author venkat
 * @apiNote manager class for execution
 */
public class Manager {
	private Map<String, List<Patient>> mapper = new HashMap<>();

	/**
	 * Adding patients
	 * 
	 * @throws LowBillException
	 * @throws InvalidAgeException
	 * 
	 */
	public void addPatients(Patient patient) throws InvalidAgeException, LowBillException {
		String disease = patient.getdisease();
		List<Patient> list1 = mapper.getOrDefault(disease, new ArrayList<Patient>());

		/**
		 * checking for invalid age
		 */
		for (Patient p : list1) {
			if (p.getage() < 1) {
				throw new InvalidAgeException("enter a valid age ");
			} else if (p.getbill() < 5000) {
				throw new LowBillException("bill amount is less than 5000");
			}
		}
		/**
		 * adding into the hashmap
		 * 
		 */
		list1.add(patient);
		mapper.put(disease, list1);
		/**
		 * sorting based on bill amount in descending order;
		 */
		Collections.sort(list1, new Comparator<>() {
			public int compare(Patient p1, Patient p2) {
				return p2.getbill().compareTo(p1.getbill());

			}
		});
	}

	/**
	 * @author venkat
	 * @apiNote display method for displaying
	 * 
	 */
	public void printpatients(String disease) {
		List<Patient> patients = mapper.get(disease);
		if (patients == null) {
			System.out.println("no patients found with disease: " + disease);
		} else {
			System.out.println("patients with disease: " + disease);
			for (Patient p : patients) {
				System.out.println(p);
			}
		}
	}

	/**
	 * printing data from hashmap
	 */
	public void display() {
    Map.Entry<String, List<Patient>> ent=mapper.entrySet();
    
	}

}
