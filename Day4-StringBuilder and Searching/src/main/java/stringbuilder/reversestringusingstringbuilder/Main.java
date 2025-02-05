package stringbuilder.reversestringusingstringbuilder;

import java.util.Scanner;

import static stringbuilder.reversestringusingstringbuilder.ReverseAString.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //take user input
        System.out.print("Input a string: ");
        String string = sc.nextLine();

       // create an object of ReverseAString class
        ReverseAString rs = new ReverseAString();

        //call the reverseString method and store the result
        String result=rs.reverseString(string);

       //Display the result

        //print the string
        System.out.println("Reversed String is: "+result);



    }
}
