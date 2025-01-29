package doublylinkedlist.librarymanagementsystem;

public class Node {
    String title;
    String author;
    String genre;
    int bookID;
    boolean isAvailable;
    Node next;
    Node prev;

    public Node(String title, String author, String genre, int bookID, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookID = bookID;
        this.isAvailable = isAvailable;
        this.next = null;
        this.prev = null;
    }
}
