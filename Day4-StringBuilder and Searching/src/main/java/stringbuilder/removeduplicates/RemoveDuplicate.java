package stringbuilder.removeduplicates;

import java.util.HashSet;

public class RemoveDuplicate {
    public String removeDuplicateChar(String string){
        //create a stringbuilder object
        StringBuilder sb= new StringBuilder();
        //create a hashset
        HashSet<Character> hs= new HashSet<>();

        for(char ch:string.toCharArray()){
            //add character to the stringbuilder if it is not present in hashset
            if(!hs.contains(ch)){
                hs.add(ch);
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}
