package Com.pack;
/**
 * @author venkat
 * @apiNote this is a program implementing method overloading
 * 
 * 
 * 
 * 
 * **/
public class overload {
	public static int ROI(int investment ,int profit) { //method to find ROI
		int roi=(profit*100/investment);
		return roi;
	}
	public static int ROI(int investment ,int profit,int time ) { //method to find average ROI
		int  averageroi=(profit/investment)*100/time;             //overloading
		return averageroi;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(ROI(10000,5000));
		System.out.println(ROI(10000,10000,4));

	}

}
