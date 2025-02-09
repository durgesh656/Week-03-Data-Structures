package runtime_analysis.file_reading_efficiently;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReaderPerformance {
    public static void readFileUsingFileReader(String filePath){
        String myFilePath =  "src/main/java/runtime_analysis/file_reading_efficiently/" + filePath;
        try(java.io.FileReader fileReader = new java.io.FileReader(myFilePath);
            BufferedReader reader = new BufferedReader(fileReader)){
            String line;
            while((line = reader.readLine()) != null){

            }

        }
        catch (FileNotFoundException e){
            System.out.println("Exception occurred file not found "+ e.getMessage());
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
