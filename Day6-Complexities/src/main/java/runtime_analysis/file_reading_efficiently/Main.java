package runtime_analysis.file_reading_efficiently;

public class Main {
    public static void main(String[] args) {
        long startFileReaderTime = System.nanoTime();
        FileReaderPerformance.readFileUsingFileReader("demo.txt");
        long endFileReaderTime = System.nanoTime();

        long startInputStreamReaderTime = System.nanoTime();
        InputStreamReaderPerformance.readFileUsingInputStreamReader("demo.txt");
        long endInputStreamReaderTime = System.nanoTime();

        System.out.println("Time Taken by File Reader        : "+ (endFileReaderTime-startFileReaderTime));
        System.out.println("Time Taken by Input Stream Reader: "+(endInputStreamReaderTime-startInputStreamReaderTime));
    }
}
