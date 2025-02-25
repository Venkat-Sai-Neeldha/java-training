package enumsandfile;
/**
 * @author venkat
 * @apiNote enum role
 * 
 * */
enum Role {
	
  ADMIN(1,true){
  public void performTask() {
	  System.out.println("ADMIN: Can manage users.");
  }
  },
  MANAGER(2,true){
	  public void performTask() {
		  System.out.println("MANAGER: Can manage projects.");
	  }
	  },
  DEVELOPER(3,true){
	  public void performTask() {
		  System.out.println("DEVELOPER: Can develop features.");
	  }
	  },
  GUEST(4,false){
	  public void performTask() {
		  System.out.println("GUEST: Can view public information");
	  }
	  };
	/**
	 * @apiNote abstract method for enum
	 * */
	public abstract void performTask();
	
	/**
	 * @apiNote variables
	 * */
private int level;
private boolean haspermission;

Role(int level, boolean haspermission) {
	this.level=level;
	this.haspermission=haspermission;
}
public int getlevel() {
	return level;
}
public boolean getPermission() {
	return haspermission;
}
public static Role getRoleByLevel(int level) {
	for (Role role : Role.values()) {
        if (role.getlevel() == level) {
            return role;
        }
    }
	return null;
}
public static void displayRoleInfo() {
    for (Role role : Role.values()) {
        System.out.println("Role: " + role.name() + ", Level: " + role.getlevel() + ", Has Permissions: " + role.getPermission());
        role.performTask();
    }
}
}

public class Enumexample {
   public static void main(String[] args) {
	   Role.displayRoleInfo();
	}
}

