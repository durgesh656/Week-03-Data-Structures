package runtime_analysis.string_concatenation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringConcatenationTest {

    @Test

    void Test1(){
        long timeTakenByString=StringPerformance.calculateStringTime(1000);
        long timeTakenByStringBuilder=StringBuilderPerformance.calculateStringBuilderTime(1000);
        long timeTakenByStringBuffer=StringBufferPerformance.calculateStringBufferTime(1000);

        assertTrue(timeTakenByStringBuilder<=timeTakenByStringBuffer && timeTakenByStringBuffer<timeTakenByString);

    }
    @Test
    void Test2(){
        long timeTakenByString=StringPerformance.calculateStringTime(10000);
        long timeTakenByStringBuilder=StringBuilderPerformance.calculateStringBuilderTime(10000);
        long timeTakenByStringBuffer=StringBufferPerformance.calculateStringBufferTime(10000);

        assertTrue(timeTakenByStringBuilder<=timeTakenByStringBuffer && timeTakenByStringBuffer<timeTakenByString);

    }
    @Test
    void Test3(){
        long timeTakenByString=StringPerformance.calculateStringTime(1000000);
        long timeTakenByStringBuilder=StringBuilderPerformance.calculateStringBuilderTime(1000000);
        long timeTakenByStringBuffer=StringBufferPerformance.calculateStringBufferTime(1000000);

        assertTrue(timeTakenByStringBuilder<=timeTakenByStringBuffer && timeTakenByStringBuffer<timeTakenByString);

    }
}
