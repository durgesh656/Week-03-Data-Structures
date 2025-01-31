package stackandqueue.queueusingstack;
import java.util.Stack;
public class QueueUsingStack {
    //Declaring two stacks
    Stack<Integer> s1;
    Stack<Integer> s2;
    //Constructor
    public QueueUsingStack()
    {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    //method for enqueue
    public void enqueue(int data)
    {
        this.s1.push(data);
        return;
    }

    //method to check weather the Queue is empty or not
    public boolean checkEmpty()
    {
        //if both stacks are empty then queue is empty
        return s1.isEmpty() && s2.isEmpty();
    }

    //method for dequeue
    public int dequeue() {
        //check whether the second stack is empty or not
        if (s2.isEmpty()) {
            while (!s1.isEmpty())//Adding all the elements in another stack
            {
                s2.push(s1.pop());
            }
        }
        //Checking weather the Queue is empty after adding the elements
        if (s2.isEmpty()) {
            System.out.println("Queue is Empty");
            return 0;
        }
        return s2.pop();
    }



}
