package doublylinkedlist.moviemanagementsystem;

public class LinkedList {

    Node head;
    Node tail;

    // method to add element at last index
    public void addAtLast(String movieTitle, String director, int yearOfRelease, float rating){
        // creating a node
        Node node = new Node(movieTitle, director, yearOfRelease, rating);

        if(head == null){
            node.prev = node.next = null;
            head = node;
            head.next = tail;
            tail = head;
            return;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = node;
        node.prev = temp;
        tail = node;
    }

    // method to add element at first index
    public void addAtFirst(String movieTitle, String director, int yearOfRelease, float rating){
        // creating a node
        Node node = new Node(movieTitle, director, yearOfRelease, rating);

        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }

        if (head == null){
            node.next = tail;
            tail.prev = node;
        }

        head = node;
    }

    // method to add element at specific index
    public void addAtSpecificPosition(String movieTitle, String director, int yearOfRelease, float rating, int position){
        // creating a node
        Node node = new Node(movieTitle, director, yearOfRelease, rating);

        // index value to track the index of the linkedList
        int idx = 1;

        Node temp = head;

        while(idx < position-1){
            temp = temp.next;
            idx++;
        }

        if(temp == tail){
            addAtLast(movieTitle, director, yearOfRelease, rating);
            return;
        }

        node.next = temp.next;
        node.next.prev = node;
        temp.next = node;
        node.prev = temp;

    }

    // method to delete roll number
    public void delete(String movieTitle){
        // if list is empty
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        // If the head node contains the movie title to delete
        if (head.movieTitle.equals(movieTitle)) {
            head = head.next;
            if (head != null) { // If list is not empty after deletion
                head.prev = null;
            }
            System.out.println("Deleted the record.");
            return;
        }

        Node temp = head;

        // Traverse to find the node before the one to delete
        while (temp.next != null && !temp.next.movieTitle.equals(movieTitle)) {
            temp = temp.next;
        }

        // If the movie was not found
        if (temp.next == null) {
            System.out.println("Movie title doesn't exist.");
            return;
        }

        // Delete the node
        Node nodeToDelete = temp.next;
        temp.next = nodeToDelete.next;

        // If not deleting the last node, update the prev pointer of the next node
        if (nodeToDelete.next != null) {
            nodeToDelete.next.prev = temp;
        }

        System.out.println("Deleted the record.");

    }

    // method to search roll number in list
    public void search(String director){
        Node temp = head;

        while(temp.next != null && !temp.director.equals(director)){
            temp = temp.next;
        }

        if(temp.next != null){
            System.out.println("Record Found");
            Node.displayMovie(temp);
        }

        else{
            System.out.println("Record doesn't exist");
        }
    }

    // method to upgrade rating of movies
    public void updateRating(String movieTitle, float rating){
        Node temp = head;

        while(temp.next != null && !temp.movieTitle.equals(movieTitle)){
            temp = temp.next;
        }

        if(temp.movieTitle.equals(movieTitle)){
            System.out.println("Record Found update rating");
            temp.rating = rating;
            Node.displayMovie(temp);
        }

        else{
            System.out.println("Record doesn't exist");
        }
    }

    // method to display record forward
    public void displayRecordForward(){
        Node temp = head;
        int i = 1;
        while(temp != null){
            System.out.println("Movie : " + i);
            Node.displayMovie(temp);
            temp = temp.next;
            i++;
        }
    }

    // method to display record backward
    public void displayRecordBackward(){
        Node temp = tail;

        while(temp != null){
            Node.displayMovie(temp);
            temp = temp.prev;
        }
    }
}

