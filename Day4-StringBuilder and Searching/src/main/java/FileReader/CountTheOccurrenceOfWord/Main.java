package FileReader.CountTheOccurrenceOfWord;

public class Main {
    public static void main(String[] args) {

        //storing result from method countWordOccurrences
        int count = WordOccurrence.countWordOccurrences("demo.txt", 'i');

        //print the count
        System.out.println("Total count of word is: "+ count);
    }
}
