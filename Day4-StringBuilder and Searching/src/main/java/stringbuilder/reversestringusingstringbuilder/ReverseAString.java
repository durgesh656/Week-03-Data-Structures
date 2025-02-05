package stringbuilder.reversestringusingstringbuilder;
import java.util.*;

public class ReverseAString {
    public  String reverseString(String string) {

        //create a stringBuilder object
        StringBuilder sb = new StringBuilder(string);

        sb.reverse();//using reverse method to reverse a string

        return sb.toString();

    }
}


