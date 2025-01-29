package doublylinkedlist.moviemanagementsystem;

public class main {

    public static void main(String[] args) {

        // creating doubly linked list
        LinkedList dll = new LinkedList();

        // add elements in last
        dll.addAtLast("Dhoom", "John", 2022, 2);
//        dll.displayRecordForward();
//        System.out.println("");

        dll.addAtLast("Dhoom2", "Aryan", 2023, 8);
//        dll.displayRecordForward();
//        System.out.println();

        // add elements in first
        dll.addAtFirst("Dhoom3", "Durgesh", 2024, 9);
//        dll.displayRecordForward();
//        System.out.println();

        // add element at specific index
        dll.addAtSpecificPosition("Dhoom4", "Deepraj", 2025, 7, 2);
//        dll.displayRecordForward();
//        System.out.println();

        // delete element
        dll.delete("Dhoom2");
//        dll.displayRecordForward();
//        System.out.println();

        // search element
        dll.search("Durgesh");
//        dll.displayRecordForward();
//        System.out.println();

        //update rating
        dll.updateRating("Dhoom", 9);
//        dll.displayRecordForward();
//        System.out.println();

        // print nodes in forward direction
        System.out.println("displaying movie in forward direction");
        dll.displayRecordForward();

        // print nodes in backward direction
        System.out.println("displaying movie in backward direction" );
        dll.displayRecordBackward();

    }


}