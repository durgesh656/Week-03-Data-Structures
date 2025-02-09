package runtime_analysis.file_reading_efficiently;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class InputStreamReaderPerformance {
    public static void readFileUsingInputStreamReader(String filepath){
        String myFilePath =  "src/main/java/runtime_analysis/file_reading_efficiently/" + filepath;
        try(FileInputStream fileInputStream = new FileInputStream(myFilePath);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
            BufferedReader reader = new BufferedReader(inputStreamReader)){
            String line;
            while((line = reader.readLine()) != null){}

        }
        catch (FileNotFoundException e){
            System.out.println("Exception occurred file not found "+ e.getMessage());
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}
