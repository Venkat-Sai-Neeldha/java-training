package collections;
/**
 * @author venkat
 * @apiNote class for session details
 * 
 * */
public class Session {
   private String userpref;
   private String sessiondetails;
   
   /**
    * constructor for class 
    * 
    * */
   public Session(String userpref,String sessiondetails) {
	   this.userpref=userpref;
	   this.sessiondetails=sessiondetails;
   }
   
   
   /**
    * getter and setter methods
    * */
   public void setname(String userpref) {
	   this.userpref=userpref;
   }
   public String getUserpref() {
	   return this.userpref;
   }
    public void setSession(String Sessiondetails) {
    	this.sessiondetails=sessiondetails;
    }
    public String getSession() {
    	return this.sessiondetails;
    }
    public String toString() {
    	return "{userpref: "+userpref+" ,sessiondetails: "+sessiondetails+"}";
    }
}
