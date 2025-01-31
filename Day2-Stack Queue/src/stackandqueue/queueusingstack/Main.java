package stackandqueue.queueusingstack;


public class Main {
    public static void main(String[] args) {
        QueueUsingStack que=new QueueUsingStack();

        System.out.println("is the queue is empty: "+que.checkEmpty());
        que.enqueue(1);
        que.enqueue(5);
        que.enqueue(7);

        //queue status after enqueuing element
        System.out.println("is the queue is empty: "+que.checkEmpty());

        System.out.println(que.dequeue());// 1 will be dequed from the queue
        que.enqueue(12);
        // 5 will be dequed from the queue
        System.out.println(que.dequeue());

    }
}
