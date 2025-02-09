package runtime_analysis.compare_recursive_and_iterative_fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RecursiveVsIterativeTest {

    @Test
    void test1(){
        assertTrue(CalculateTime.displayTime(30));
    }
    @Test
    void test2(){
        assertTrue(CalculateTime.displayTime(10));
    }
    @Test
    void test3(){
        assertTrue(CalculateTime.displayTime(50));
    }


}
