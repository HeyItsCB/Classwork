/**
 * HolyGrail.java is the first lab I will write
 * It is a simple UI program that talks to the user
 * 9/15/20
 * @author 21burkhard
 */

/**
primitives (holdovers from C/C++):
int, double, boolean, char
Objects:
Starts with a capital letter
 */

// this imports a library when I compile this file
import java.util.Scanner;

public class HolyGrail {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("* A chat with the bridge keeper *");
        System.out.println("Who would cross the Bridge of Death must answer me these questions three, ere the other side he see.");
        System.out.print("Question 1: What is your name? ");
        String name = in.nextLine();
        System.out.print("Question 2: What is your quest? ");
        String quest = in.nextLine();
        System.out.print("Question 3: What is your favorite color? ");
        String color = in.nextLine();
        System.out.println("King Arthur says, \"You have to know these things when you're a king, you know.\"");
        System.out.println("Your name is: " + name);
        System.out.println("Your quest is: " + quest);
        System.out.println("Your favorite color is: " + color);
        System.out.println("* end of program *");


        /**
        Scanner in = new Scanner(System.in);
        System.out.print("What is your name: ");
        String name = in.nextLine();
        System.out.println("Hello " + name + ", nice to meet you.");
        System.out.print("How old are you: ");
        Integer age = in.nextInt();
        System.out.print("How many pets do you have: ");
        Integer numPets = in.nextInt();
        System.out.println("Nice talking to you," + name + ".");
        System.out.println("You are " + age + " years old.");
        System.out.println("You have " + numPets + " pets.");
         */
    }
}
