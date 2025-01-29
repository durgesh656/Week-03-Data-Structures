package circularlinkedlist.roundrobinscheduling;

public class Node {
    //create attributes
    int processID;
    int burstTime;
    int priority;
    Node next;

    public Node(int processID, int burstTime, int priority){
        this.processID = processID;
        this.burstTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}
