package com.capgemini.challenge;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

import static com.capgemini.challenge.LinearAndBinarySearch.*;

public class LinearAndBinarySearchTest {
    // Test one
    @Test
    void linearSearchTest(){
        assertEquals(2,searchFirstMissingPositive(new ArrayList<>(  Arrays.asList(1,3,4,5,6))));
    }

    // Test second
    @Test
    void binaryTest(){
        assertEquals(2,binarySearch(new ArrayList<>(Arrays.asList(1,3,4,5,6)),4));
    }
}
