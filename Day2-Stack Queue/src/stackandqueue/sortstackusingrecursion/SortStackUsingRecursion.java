package stackandqueue.sortstackusingrecursion;

import java.util.Stack;

public class SortStackUsingRecursion {
        //Declared the stack
        Stack<Integer> stack;

        //Constructor
        public SortStackUsingRecursion()
        {
            stack = new Stack<>();
        }

        void push(int data)
        {
            stack.push(data);
        }
        public void sortStack()
        {
            if (stack.isEmpty())
            {
                return;
            }
            int temp = stack.pop();
            sortStack();
            insertSorted(stack,temp);
        }


        public  void insertSorted(Stack<Integer> stack, int element) {
            if (stack.isEmpty() || element > stack.peek())
            {
                stack.push(element);
            }
            else
            {
                int temp = stack.pop();
                insertSorted(stack, element);
                stack.push(temp);
            }
        }
        //display method
        public void display()
        {
            System.out.println("Sorted stack is "+ stack);

        }


}

