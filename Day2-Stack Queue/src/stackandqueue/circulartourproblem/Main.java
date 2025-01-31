package stackandqueue.circulartourproblem;

public class Main {

    public static void main(String[] args) {
        int[] petrol = {3, 6, 50, 4};
        int[] distance = {6, 50, 3, 1};
        CircularTour tour = new CircularTour();
        int start = CircularTour.findStartingPoint(petrol, distance);
        System.out.println(start);

    }
}
