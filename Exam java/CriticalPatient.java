package exam;
/**
 * @author venkat
 * @apiNote critical patient class extending the patient  class
 * 
 * */
public class CriticalPatient extends Patient {

	private Integer icuDays;

	public CriticalPatient(Integer patientId, String name, Integer age, String disease, Double bill , Integer Icudays) {
		super(patientId, name, age, disease, bill);
		this.icuDays=Icudays;
	}
	public void setIcuDays(int icuDays) {
        this.icuDays = icuDays;
    }
/**
 * @param to string method for critical patient class
 * @return a string of class variables
 * */
    @Override
    public String toString() {
        return super.toString() + "[, ICU Days: " + icuDays+"]";
    }
}


