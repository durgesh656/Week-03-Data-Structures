package StringBuffer.ConcatenateString;

public class UseStringBuffer {

    public static String concatenateString(String[] stringArray){

        StringBuffer sb = new StringBuffer();

        for(String s : stringArray){
            sb.append(s+" ");
        }


        return sb.toString();
    }


}
