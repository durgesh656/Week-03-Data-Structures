package com.capgemini.binary_search.find_the_peak_element_in_an_array;

import org.junit.jupiter.api.Test;
import static com.capgemini.binary_search.find_the_peak_element_in_an_array.FindPeakElement.findPeak;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindPeakElementTest {
    @Test
    void findPeakTest1(){
        assertEquals(4,findPeak(new int[] {1, 2, 3, 4, 5}) );
    }
}
