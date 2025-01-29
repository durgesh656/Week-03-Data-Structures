package singlylinkedlist.studentrecordmanagement;

public class StudentNode {
    int rollNumber;
    String name;
    int age;
    String grade;
    StudentNode next;

    StudentNode(int rollNumber,String name,int age,String grade){
        this.rollNumber=rollNumber;
        this.name=name;
        this.age=age;
        this.grade=grade;
        this.next=null;

    }
    // method to display a student node
    public static void display(StudentNode node){
        System.out.println("Roll number : " + node.rollNumber);
        System.out.println("Name : " + node.name);
        System.out.println("Age : " + node.age);
        System.out.println("Grade : " + node.grade);
        System.out.println("---------------------------------");
    }
}
