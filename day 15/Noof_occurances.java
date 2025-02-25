package enumsandfile;
/**
 * @author venkat
 * @apiNote this is program to count no of occurances of a character
 * 
 * 
 * */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Noof_occurances {
public static void main(String[] args) {
	File newfile= new File("D:\\abc.txt");
	/**
	 * variable declaration
	 * */
	char ch='h';
	int count=0;
	try {
		FileInputStream fis=new FileInputStream(newfile);
		int bytes;
		
		try {
			while((bytes=fis.read())!=-1) {
				if((int)ch==bytes) {
					count=count+1;
				}
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	System.out.println(count);
}
}
