package FileReader.CountTheOccurrenceOfWord;

import org.junit.jupiter.api.Test;

import static FileReader.CountTheOccurrenceOfWord.WordOccurrence.countWordOccurrences;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test1 {
    @Test
    void test1(){
        assertEquals(14,countWordOccurrences("demo.txt",'i'));
        System.out.println("test case passed");
    }
}
