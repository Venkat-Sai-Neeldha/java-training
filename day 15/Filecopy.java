package enumsandfile;
/**
 * @author venkat
 * @apiNote  program to copy one file to another
 * 
 * 
 * */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class Filecopy {

	public static void main(String[] args) {
     
        File file = new File("D:\\abc.txt");
        File oFile = new File("D:\\output.txt");
 
   
        FileInputStream fis = null;
        FileOutputStream fos = null;
 
        try {
        
            fis = new FileInputStream(file);
            fos = new FileOutputStream(oFile);
        }

        catch (FileNotFoundException e) {
 
    
            System.out.println("error in finding file");
        }
 
        try {
 
           
            fis.available();
        }
 
        catch (Exception e) {
            e.printStackTrace();
        }
 
        
        int id = 0;
        
        /**
         * copying data from file to another file
         * 
         * */
        try {
			while ((id = fis.read()) != -1) {
			    try {
					fos.write(id);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
 
        try {
			fis.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
       
      
    }


	}

