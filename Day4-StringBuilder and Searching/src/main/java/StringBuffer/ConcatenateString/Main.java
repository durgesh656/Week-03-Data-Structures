package StringBuffer.ConcatenateString;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //taking size if the stringArray from user
        System.out.print("Enter the size of the Array: ");
        int size = sc.nextInt();
        //declare a stringArray of the given size
        String[] stringArray = new String[size];

        //user input for elements of the array
        System.out.println("Enter the Strings: ");
        for(int i = 0; i < size; i++){
            stringArray[i] = sc.next().trim();

        }
        //instantiate the UseStringBuffer class
        UseStringBuffer stringBuffer=new UseStringBuffer();

        //call the concatenateString method and store the result
        String str=stringBuffer.concatenateString(stringArray);

        //Display the result
        System.out.print("Final concatenated string is: ");
        System.out.println(str);


    }
}
