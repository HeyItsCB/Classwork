import java.lang.Math;
import java.lang.StringBuilder;
import java.util.Scanner;

/**
 * SimpleIOMath is a class that takes input/output, stores that information
 * in class variables and then defines some helper methods.
 * @version 09/24/2020
 * @author Chris Burkhard
 */

/*
I used this site to figure out how to make the name show up reversed.
https://dzone.com/articles/the-right-way-to-reverse-a-string-in-java
 */

public class SimpleIOMath {
    private String name;
    private int age;
    private int favNumber;

    /**
     * Asks the user for info.
     */
    public void promptUser() {
        System.out.println("* Sit yourself down, take a seat *");
        System.out.println("* All you gotta do is repeat after me *");
        Scanner daScanner = new Scanner(System.in);
        System.out.print("Question 1: What is your name? ");
        name = daScanner.nextLine();
        System.out.print("Question 2: How old are you? ");
        age = daScanner.nextInt();
        System.out.print("Question 3: What is your favorite number? ");
        favNumber = daScanner.nextInt();
    }

    /**
     * Print the info that the user provided, along with some basic twists to it.
     */
    public void printInfo() {
        System.out.println("I'm gonna teach you how to sing it out\n" +
                "Come on, come on, come on\n" +
                "Let me tell you what it's all about\n" +
                "Reading, writing, arithmetic\n" +
                "Are the branches of the learning tree");
        System.out.println("Your name is: " + name);
        System.out.println("If it was opposite day, your name would be: " + oppositeDay(name));
        System.out.println("Your age is: " + age);
        System.out.println("At your next birthday, you will turn " + (age + 1) + ".");
        System.out.println("The first prime factor of " + age + " is: " + smallestPrimeFactor(age));
        System.out.println("Your favorite number is: " + favNumber);
        System.out.println("Your favorite number squared is: " + (int)Math.pow(favNumber, 2));
    }

    private int smallestPrimeFactor(int age) {
        int[] primes = {2,3,5,7,9,11,13,17,19,23,29,31,37,41,43,47,53,59,61};
        for (int factor: primes)    {
            if (age % factor == 0)
                return factor;
        }
        return age;
    }

    /*
Again, credit to this site for figuring out how to make the name show up reversed.
https://dzone.com/articles/the-right-way-to-reverse-a-string-in-java
 */

    private static String oppositeDay(String itsTheName) {
        return new StringBuilder(itsTheName).reverse().toString();
    }

    /**
     * Main method for the class SimpleIOMath
     * @param args Command line arguments, if needed.
     */
    public static void main(String[] args) {
        SimpleIOMath itsAnObject = new SimpleIOMath();
        itsAnObject.promptUser();
        itsAnObject.printInfo();
        System.out.println("* end of program *");
    }
}
