package InputStreamReader.ByteStreamToCharacterStream;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ConvertByteStreamToCharacterStream {

    static void byteStreamToCharStream(String filePath){

        String myPath = "src/main/java/InputStreamReader/ByteStreamToCharacterStream/" + filePath;

        //try catch block if the exception occurred (file not found exception)
        try(InputStreamReader isr = new InputStreamReader(new FileInputStream(myPath), StandardCharsets.UTF_8)){
            BufferedReader br = new BufferedReader(isr);

            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        }
        catch (FileNotFoundException e){
            System.err.println("Exception caught File not Found Exception"+ e.getMessage());
        }

        catch (UnsupportedEncodingException e) {
            System.err.println("Exception caught UnsupportedEncodingException"+ e.getMessage());
        }
        catch (IOException e) {
            System.err.println("Exception caught IOException"+ e.getMessage());
        }

    }
}
