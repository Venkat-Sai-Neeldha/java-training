package day10exception;

import java.io.IOException;
/**
 * @author venkat
 * @apiNote this is a program to find IO exception
 * 
 * **/

public class fileReadException {
     public static void readFile(String file) throws IOException
     {
    	throw new IOException("you are not allowed to read file");
     }
	public static void main(String[] args) {
		try {
			readFile("hi");
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}

	}

}
