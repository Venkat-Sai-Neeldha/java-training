package enumsandfile;
/**
 * @author venkat
 * @apiNote this is a program for fileinput stream example 
 * 
 *
 * */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class FilesExample {
public static void main(String[] args) {
	/**
	 * reading a file
	 * */
	File newfile=new File("D:\\abc.txt");

	try {
		FileInputStream fis=new FileInputStream(newfile);
		int bytes;
		try {
			/*printing the file*/
			while((bytes=fis.read())!=-1) {
				System.out.print((char)bytes);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}
}
}
