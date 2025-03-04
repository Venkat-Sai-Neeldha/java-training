package exam;
/**
 * @author venkat
 * @apiNote class ptient
 * */
public class Patient {

	private Integer patientId;
	private String name;
	private Integer age;
	private String disease;
	private Double bill;
	/**
	 * constructor for patient class
	 * */
	public Patient(Integer patientId,String name,Integer age,String disease,Double bill) {
		
		this.patientId=patientId;
		this.name=name;
		this.age=age;
		this.disease=disease;
		this.bill=bill;
	}
	
	/**
	 * getter and setter methods
	 * */
	public Integer getpid() {
		return patientId;
	}
	public String getname() {
		return name;
	}
	public Integer getage() {
		return age;
	}
	public String getdisease() {
		return disease;
	}
	public Double getbill() {
		return bill;
	}
	
	public String toString() {
		return "{"+" patient Id:"+patientId+" Name:"+name+
				" age:"+age+" disease:"+disease+" bill:"+bill+"}";
	}
}

