package InputStreamReader.ReadUserInputAndWriteToFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadUserInputAndWrite {

    //method to read file
    public static void readFile(String fileName){
        //storing in file path
        String myFile = "src/main/java/InputStreamReader/ReadUserInputAndWriteToFile/" + fileName;

        try (BufferedReader br = new BufferedReader(new FileReader(myFile))){
            String line; //line contains each line
            while((line = br.readLine()) != null ){
                System.out.println(line);
            }
        }
        catch (IOException e){     //Handling IO exception
            System.out.println("Exception occurred File not found"+ e.getMessage());
        }
    }

    //method to write in file
    public static void writeFile(String fileName, String content){
        String myFile = "src/main/java/InputStreamReader/ReadUserInputAndWriteToFile/" + fileName;
        try (FileWriter newFile = new FileWriter(myFile,true)){
            newFile.write(content + "\n");
        } catch (IOException e) {
            System.out.println("Exception caught IOException"+e.getMessage());
        }
    }
}
