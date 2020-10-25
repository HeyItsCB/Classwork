import java.util.Random;

public class ChapterFive {
    public static void main(String[] args) {
        //static -- utility method, it just does something
        //non-static methods typically provide us with info about an object
        int a = -10 + (int)(Math.random()*21); // -10 to +10
        int b = -10 + (int)(Math.random()*21); // -10 to +10
        Random r = new Random();
        int c = -10 + r.nextInt(21); // -10 to +10
        if (a == b)
            System.out.println("a equals b: " + a + " " + b);
        else
            System.out.println("a not equals b: " + a + " " + b);
        //primitives (int, double, boolean, char) can be compared using ==
        //others objects like Strings should be compared using .equals()
        System.out.print(1 / 2.0 * 10);
    }
}
