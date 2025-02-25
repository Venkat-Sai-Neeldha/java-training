package enumsandfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class KeywordSearcher {
    public static void searchKeywordInFile(String filePath, String keyword) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int lineNumber = 1;
            while ((line = reader.readLine()) != null) {
                if (line.contains(keyword)) {
                    System.out.println("Line " + lineNumber + ": " + line);
                }
                lineNumber++;
            }
        } catch (IOException e) {
            System.out.println( e.getMessage());
        }
    }

    public static void main(String[] args) {
        String filePath = "D:\\abc.txt";
        String keyword = "hello";
        searchKeywordInFile(filePath, keyword);
    }
}