package circularlinkedlist.taskscheduler;

public class LinkedList {
    private Node head = null;
    private Node tail = null;

    // Add a task at the end
    public void addTask(int taskId, String taskName, int priority, String dueDate) {
        Node newTask = new Node(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newTask;
            tail = newTask;
            tail.next = head; // Make circular
        } else {
            tail.next = newTask;
            newTask.next = head;
            tail = newTask;
        }
    }

    // Remove a task by Task ID
    public void removeTask(int taskId) {
        if (head == null) {
            System.out.println("No tasks to remove.");
            return;
        }

        Node current = head, prev = tail;
        do {
            if (current.taskId == taskId) {
                if (current == head) {
                    head = head.next;
                    tail.next = head;
                } else if (current == tail) {
                    tail = prev;
                    tail.next = head;
                } else {
                    prev.next = current.next;
                }
                System.out.println("Task " + taskId + " removed.");
                return;
            }
            prev = current;
            current = current.next;
        } while (current != head);

        System.out.println("Task not found.");
    }

    // Display all tasks
    public void displayTasks() {
        if (head == null) {
            System.out.println("No tasks in the list.");
            return;
        }

        Node current = head;
        do {
            System.out.println("Task ID: " + current.taskId + ", Name: " + current.taskName +
                    ", Priority: " + current.priority + ", Due Date: " + current.dueDate);
            current = current.next;
        } while (current != head);
    }

    // View current task and move to the next
    public Node viewAndMoveNext(Node currentTask) {
        if (currentTask == null) {
            return head;
        }
        return currentTask.next;
    }

    // Search for tasks by priority
    public void searchByPriority(int priority) {
        if (head == null) {
            System.out.println("No tasks in the list.");
            return;
        }

        Node current = head;
        boolean found = false;

        do {
            if (current.priority == priority) {
                System.out.println("Task ID: " + current.taskId + ", Name: " + current.taskName +
                        ", Due Date: " + current.dueDate);
                found = true;
            }
            current = current.next;
        } while (current != head);

        if (!found) {
            System.out.println("No tasks found with priority " + priority);
        }
    }
}
