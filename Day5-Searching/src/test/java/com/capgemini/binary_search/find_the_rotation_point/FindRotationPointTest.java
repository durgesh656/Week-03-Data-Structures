package com.capgemini.binary_search.find_the_rotation_point;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static com.capgemini.binary_search.find_the_rotation_point.FindRotationPoint.findIndexOfSmallestElement;

public class FindRotationPointTest {
    @Test
    void FindRotationTest1(){
        assertEquals(2,findIndexOfSmallestElement(new int[] {4,5,1,2,3}));
    }
}
