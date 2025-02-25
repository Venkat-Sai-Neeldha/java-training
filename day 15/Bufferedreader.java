package enumsandfile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 * @author venkat
 * @apiNote program for buffered reader example
 * 
 * 
 * */
public class Bufferedreader {
    public static void main(String[] args) {
		FileReader newfile = null;
		try {
			newfile = new  FileReader("D:\\abc.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		BufferedReader bfr=new BufferedReader(newfile);
		try {
			while(bfr.ready()) {
				System.out.print((char)bfr.read());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
