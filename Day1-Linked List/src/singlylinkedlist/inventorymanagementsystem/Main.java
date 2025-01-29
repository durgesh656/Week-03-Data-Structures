package singlylinkedlist.inventorymanagementsystem;

public class Main {
    public static void main(String[] args) {

        // creating object of linkedList
         LinkedList ll = new LinkedList();

        // add elements at last
        ll.addLast("Soup", 101, 4, 40);
        ll.addLast("Shampoo", 102, 2, 100);
        ll.addLast("Chips", 103, 10, 20);

        // add elements at first
        ll.addFirst("Butter", 104, 3, 150);
        ll.addFirst("Bottle", 105, 1, 100);

        // add element at specific position
        ll.add("Bag", 106, 1, 1000, 3);

        // remove item based on itemID
        ll.delete(102);

        // update item quantity based on item ID
        ll.updateQuantity(104, 11);

        // search item based on itemID
        ll.search(106);

        System.out.println();
        System.out.println("Total amount = " + LinkedList.totalAmount);
        System.out.println();

        // sort the item
        ll.sort();
    }
}
