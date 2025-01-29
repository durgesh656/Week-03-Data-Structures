package singlylinkedlist.studentrecordmanagement;

public class Main {
    public static void main(String[] args) {
        // creation of linkedList
        StudentList linkedList = new StudentList();

        // adding elements at last
        linkedList.addLast(101, "Durgesh", 20, "A");
        linkedList.addLast(102, "John", 20, "B");
        linkedList.addLast(103, "Alice", 20, "C");
        linkedList.addLast(104, "Bob", 20, "A");
        linkedList.addLast(105, "Harry", 20, "A");

        // adding elements at first
        linkedList.addFirst(106, "Happy", 23, "A");

        // adding elements at specific position
        linkedList.add(107, "Ashu", 22, "B", 4);

        // delete element
        linkedList.delete(102);

        // search element
        linkedList.search(102);

        // upgrade grades
        linkedList.updateGrade(104, "B");

        // display records
        linkedList.displayRecord();
    }

}