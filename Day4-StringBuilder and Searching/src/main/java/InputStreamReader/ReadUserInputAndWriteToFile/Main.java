package InputStreamReader.ReadUserInputAndWriteToFile;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)  {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Enter the file name: ");
            String fileName = br.readLine();

            System.out.println("Write string you want to add: ");
            String content = "";
            while(!content.equals("exit")){
                content = br.readLine();
                if(!content.equals("exit")){
                    ReadUserInputAndWrite.writeFile(fileName, content);
                }
            }
            ReadUserInputAndWrite.readFile(fileName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
