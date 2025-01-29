package doublylinkedlist.moviemanagementsystem;

public class Node {
    String movieTitle;
    String director;
    int yearOfRelease;
    float rating;
    Node next;
    Node prev;     // prev pointer to tract previous node

    Node(String movieTitle,  String director, int yearOfRelease, float rating){
        this.movieTitle = movieTitle;
        this.director = director;
        this.yearOfRelease = yearOfRelease;
        this.rating = rating;
    }

    public static void displayMovie(Node node){
        System.out.println("Movie Title : " + node.movieTitle);
        System.out.println("Director : " + node.director);
        System.out.println("Year of Release : " + node.yearOfRelease);
        System.out.println("Rating : " + node.rating);
        System.out.println();
    }
}
