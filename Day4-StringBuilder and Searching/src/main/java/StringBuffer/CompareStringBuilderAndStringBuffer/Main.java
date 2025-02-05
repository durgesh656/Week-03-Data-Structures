package StringBuffer.CompareStringBuilderAndStringBuffer;

public class Main {
    public static void main(String[] args) {
        //create an array of strings
        String[] str=new String[1000000];
        for (int i=0; i<1000000;i++){
            str[i]="hello";
        }
        //call the stringBuilderPerformance method and store the result
        long stringBuilderTime=UsingStringBuilder.stringBuilderPerformance(str);
        System.out.println("time taken by string Builder: "+stringBuilderTime);

        //call the stringBufferPerformance method and store the result
        long stringBufferTime=UsingStringBuffer.stringBufferPerformance(str);
        System.out.println("time taken by string Buffer: "+stringBufferTime);

        //check who takes more time
        if(stringBufferTime>stringBuilderTime){
            System.out.println("String Buffer taking more time. ");
        }
        else{
            System.out.println("String Builder taking more time. ");
        }



    }
}
