package singlylinkedlist.studentrecordmanagement;

public class StudentList {
    public StudentNode head;
    // method to add element at last index
    public void addLast(int rollNumber, String name, int age, String grade){
        // creating a node
        StudentNode node = new StudentNode(rollNumber, name, age, grade);

        if(head == null){
            head = node;
            return;
        }

        StudentNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = node;
    }

    // method to add element at first index
    public void addFirst(int rollNumber, String name, int age, String grade){
        // creating a node
        StudentNode node = new StudentNode(rollNumber, name, age, grade);

        node.next = head;
        head = node;
    }

    // method to add student at specific index
    public void add(int rollNumber, String name, int age, String grade, int position){
        // creating a node
        StudentNode node = new StudentNode(rollNumber, name, age, grade);

        // index value to track the index of the linkedList
        int idx = 1;

        StudentNode temp = head;

        while(idx < position-1){
            temp = temp.next;
            idx++;
        }

        node.next = temp.next;
        temp.next = node;

    }

    // method to delete roll number
    public void delete(int rollNumber){
        StudentNode temp = head;

        while(temp.next != null && temp.next.rollNumber != rollNumber){
            temp = temp.next;
        }

        if(temp.next != null){
            temp.next = temp.next.next;
            System.out.println("Deleted the record");
        }

        else{
            System.out.println("Roll Number doesn't exist.");
        }
    }

    // method to search roll number in list
    public void search(int rollNumber){
        StudentNode temp = head;

        while(temp.next != null && temp.rollNumber != rollNumber){
            temp = temp.next;
        }

        if(temp.next != null){
            System.out.println("Record Found");
            StudentNode.display(temp);
        }

        else{
            System.out.println("Record doesn't exist");
        }
    }

    // method to upgrade grades of Student
    public void updateGrade(int rollNumber, String grade){
        StudentNode temp = head;

        while(temp.next != null && temp.rollNumber != rollNumber){
            temp = temp.next;
        }

        if(temp.next != null){
            System.out.println("Record Found");
            temp.grade = grade;
            StudentNode.display(temp);
        }

        else{
            System.out.println("Record doesn't exist");
        }
    }

    // method to display record of student
    public void displayRecord(){
        StudentNode temp = head;
        int i = 1;
        while(temp != null){
            System.out.println("Student : " + i);
            StudentNode.display(temp);
            System.out.println();
            temp = temp.next;
            i++;
        }
    }
}
