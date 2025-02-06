package com.capgemini.binary_search.find_the_first_and_last_occurrence;

import org.junit.jupiter.api.Test;
import static com.capgemini.binary_search.find_the_first_and_last_occurrence.FirstAndLastOccurrenceOfElement.findFirstAndLastOccurrence;
import static org.junit.jupiter.api.Assertions.*;

public class FirstAndLastOccurrenceOfElementTest {
    @Test
    void FirstAndLastTest1(){
        assertArrayEquals(new int[]{1,3},findFirstAndLastOccurrence(new int[]{1,2,2,2,5}, 2));
    }
}
