package singlylinkedlist.inventorymanagementsystem;

public class Node {
    String itemName;
    int itemID;
    int quantity;
    int price;
    Node next;

    // constructor to create a node
    Node(String itemName, int itemID, int quantity, int price){
        this.itemName = itemName;
        this.itemID = itemID;
        this.quantity = quantity;
        this.price = price;
        this.next=null;
    }

    // method to display specific Node
    static void displayNode(Node node){

        System.out.println("Item name : " + node.itemName);
        System.out.println("Item ID : " + node.itemID);
        System.out.println("Item quantity " + node.quantity);
        System.out.println("Item price : " + node.price);
        System.out.println();

    }

}
