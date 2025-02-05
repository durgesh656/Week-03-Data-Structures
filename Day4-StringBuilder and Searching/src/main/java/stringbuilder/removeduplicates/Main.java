package stringbuilder.removeduplicates;

import java.util.Scanner;

public class Main {
    public String s;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //taking user input for string
        System.out.print("input a string: ");
        String string = sc.nextLine();
        //create object of RemoveDuplicate class
        RemoveDuplicate rd = new RemoveDuplicate();
        //call the removeDuplicateChar method and store the result
        String s = rd.removeDuplicateChar(string);
        //print thr result string
        System.out.println("string after removing duplicate char is: "+s);

    }
}
