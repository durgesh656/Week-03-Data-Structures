package FileReader.CountTheOccurrenceOfWord;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WordOccurrence {
    public static int countWordOccurrences(String filePath,char word){

        //initialize a variable count to keep track of number of occurrences
        int count = 0;

        //concatenate current path with user path
        String myPath = "src/main/java/FileReader/CountTheOccurrenceOfWord/" + filePath;

        //try catch block to handle the exception if Occurred
        try {

            //create a bufferreader to take input
            BufferedReader br = new BufferedReader(new FileReader(myPath));

            //create a variable to read file by line
            String line;

            //using try catch block to handle IOException if occurred
            try{
                while((line = br.readLine()) != null){

                    for (int i = 0; i < line.length(); i++) {
                        if(line.charAt(i) == word){
                            count++;
                        }
                    }
                }
            }
            catch (IOException e) {
                System.out.println("Exception occurred IOException found"+e.getMessage());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Exception occurred File not found"+e.getMessage());
        }
        return count;
    }
}
