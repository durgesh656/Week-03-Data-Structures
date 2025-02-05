package stringbuilder.removeduplicates;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test1 {
    RemoveDuplicate rd=new RemoveDuplicate();
    String str="banana";
    @Test
    void f1(){
        assertEquals("ban",rd.removeDuplicateChar(str));
        System.out.println("test pass 'both expected and actual outputs are equal '");
    }
}
