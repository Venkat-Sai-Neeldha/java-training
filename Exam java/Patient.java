package exam;

/**
 * @author venkat
 * @apiNote class ptient
 */
public class Patient {

	private Integer patientId;
	private String name;
	private Integer age;
	private String disease;
	private Double bill;

	/**
	 * constructor for patient class
	 */
	public Patient(Integer patientId, String name, Integer age, String disease, Double bill) {

		this.patientId = patientId;
		this.name = name;
		this.age = age;
		this.disease = disease;
		this.bill = bill;
	}
	/**
	 * @param getter and setter methods for patient class
	 * @return get and set variables
	 * */

	public Integer getPatientId() {
		return patientId;
	}

	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public Double getBill() {
		return bill;
	}

	public void setBill(Double bill) {
		this.bill = bill;
	}
   /**
    * @param to string method for Patient class
    * 
    * */
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", name=" + name + ", age=" + age + ", disease=" + disease
				+ ", bill=" + bill + "]";
	}

}
