package StringBuffer.CompareStringBuilderAndStringBuffer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Test1 {
    @Test
    void test1(){
        String[] str=new String[1000000];
        for (int i=0; i<1000000;i++){
            str[i]="hello";
        }

        assertTrue(UsingStringBuilder.stringBuilderPerformance(str)<UsingStringBuffer.stringBufferPerformance(str),"StringBuilder takes less time than StringBuffer");
        System.out.println("test case pass");
    }
}
