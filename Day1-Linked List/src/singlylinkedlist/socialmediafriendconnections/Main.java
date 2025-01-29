package singlylinkedlist.socialmediafriendconnections;


public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        // Add users
        ll.addUser("John123", "John", 20);
        ll.addUser("Alice123", "Alice", 21);
        ll.addUser("Bob123", "Bob", 22);
        ll.addUser("Durgesh123", "Durgesh", 21);
        ll.addUser("Aryan123", "Aryan", 23);

        // Add a connection
        ll.addConnection("John123", "Alice123");
        ll.addConnection("John123", "Bob123");
        ll.addConnection("Durgesh123", "Aryan123");
        // Add a connection
        ll.addConnection("Aryan123", "Bob123");
        ll.addConnection("Aryan123", "Bob123");
        ll.findMutualFriends("John123","Aryan123");

        ll.addConnection("Durgesh123", "John123");

        ll.removeConnection("John123","Bob123");

        // Display friends of a user
        ll.displayFriends("Durgesh123");
    }
}
