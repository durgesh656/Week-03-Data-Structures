package StringBuffer.ConcatenateString;
import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test1 {
    @Test
    void test1() {
        String[] str = {"hello", "world"};
        UseStringBuffer sb = new UseStringBuffer();
        String result = sb.concatenateString(str);

        assertEquals("hello world ",result);
        System.out.println("Test case pass 'Both Expected and Actual outputs are equal' ");

    }
}
