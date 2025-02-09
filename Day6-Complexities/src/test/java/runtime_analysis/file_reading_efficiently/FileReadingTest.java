package runtime_analysis.file_reading_efficiently;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FileReadingTest {
    @Test
    void test1(){
        long start1 = System.nanoTime();
        FileReaderPerformance.readFileUsingFileReader("demo.txt");
        long end1 = System.nanoTime();
        long meanTimeOfFileReader = end1 - start1;

        long start2 = System.nanoTime();
        InputStreamReaderPerformance.readFileUsingInputStreamReader("demo.txt");
        long end2 = System.nanoTime();
        long meanTimeOfInputStreamReader = end2 - start2;

        assertTrue(meanTimeOfInputStreamReader < meanTimeOfFileReader);
    }


}
