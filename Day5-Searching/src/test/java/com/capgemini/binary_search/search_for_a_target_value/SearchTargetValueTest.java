package com.capgemini.binary_search.search_for_a_target_value;

import org.junit.jupiter.api.Test;

import static com.capgemini.binary_search.search_for_a_target_value.SearchTargetValue.searchForTargetValue;
import static org.junit.jupiter.api.Assertions.*;

public class SearchTargetValueTest {
    @Test
    void SearchForTargetTest1(){
        assertTrue(searchForTargetValue(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, 6));
    }
}
