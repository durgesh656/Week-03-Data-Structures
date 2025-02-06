package FileReader.ReadFileLineByLine;

import org.junit.jupiter.api.Test;

import static FileReader.ReadFileLineByLine.ReadFile.readFile;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test1 {
    @Test
    void test1(){
        assertEquals("src/main/java/FileReader/ReadFileLineByLine/demoFile.txt",readFile("demoFile.txt"));
        System.out.println("Test case passed");

    }
//    @Test
//    void test2(){
//        assertEquals("src/main/java/ReadFileLineByLine/demoFile.txt",readFile("demoFile.txt"));
//
//    }
}
