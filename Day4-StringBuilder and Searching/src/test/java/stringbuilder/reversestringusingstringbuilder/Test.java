package stringbuilder.reversestringusingstringbuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;




class test {
    ReverseAString rs=new ReverseAString();
    String s="hello";
    @Test
    void test1(){// test pass due to correct expected output
        assertEquals("olleh",rs.reverseString(s));
    }
    @Test
    void test2(){//test fail due to wrong answer
        assertEquals("hello",rs.reverseString(s));

    }


}


