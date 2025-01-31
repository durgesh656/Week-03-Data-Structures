package stackandqueue.sortstackusingrecursion;

public class Main {
    public static void main(String [] args)
    {
        //Declaring the Queue
        SortStackUsingRecursion stack= new SortStackUsingRecursion();
        //Adding the elements in Queue
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(1);
        stack.push(5);
        stack.push(6);
        stack.sortStack();
        stack.display();
    }
}
