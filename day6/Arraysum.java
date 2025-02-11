package day6;

/**
 * @author venkat
 * @apiNote this is a program to find the sum of array using java
 */
public class Arraysum {
      
	public static int sum(int Arr[],int len) {
		if(len<=0) {
			return 0;             // base step to terminate recursion
		}
	return sum(Arr,len-1)+Arr[len-1]; // recursive step
	}
	public static void main(String[] args) {
		int[] Arr1= {1,2,3,4,5};
		int len=Arr1.length;
		System.out.println("sum of array is "+sum(Arr1,len));

}
}
