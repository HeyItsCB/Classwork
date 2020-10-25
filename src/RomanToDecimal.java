/**
 * RomanToDecimal is a class that takes input from command line arguments,
 * converts valid Roman numeral input into a base-10 value,
 * and provides the original args alongside their base-10 equivalents as output.
 * @version 10/7/2020
 * @author Chris Burkhard
 */

public class RomanToDecimal {
    //no private data, only helper methods
    /**
     * Converts a string to a valid decimal (base-10 value)
     * @param roman Must be an uppercase string
     * @return returns the decimal sum of the Roman numeral
     */
    //NOTE: As a bonus, my program handles repeated invariants in a string and returns correct output.
    public static int romanToDecimal(String roman) {
        int sum = 0;
        //runs through each character in a string and adds its value to the total sum
        for (int i=0; i < roman.length(); i++) {
            String letter = roman.substring(i, i+1);
            if (letter.equals("I")) {
                sum += 1;
            }
            else if (letter.equals("V")) {
                sum += 5;
            }
            else if (letter.equals("X")) {
                sum += 10;
            }
            else if (letter.equals("L")) {
                sum += 50;
            }
            else if (letter.equals("C")) {
                sum += 100;
            }
            else if (letter.equals("D")) {
                sum += 500;
            }
            else if (letter.equals("M")) {
                sum += 1000;
            }
            /*
            if a character isn't a valid roman numeral, the method immediately returns -1 to main,
            which gives the argument the output 'invalid'
             */
            else {
                return -1;
            }
        }

        /*
        runs through each 2-character pair in a string searching for invariants and subtracts
        a value from the total sum if any are found
         */
        for (int j=0; j < roman.length()-1; j++) {
            if (roman.substring(j, j+2).equals("IV")) {
                sum -= 2;
            }
            if (roman.substring(j, j+2).equals("IX")) {
                sum -= 2;
            }
            if (roman.substring(j, j+2).equals("XL")) {
                sum -= 20;
            }
            if (roman.substring(j, j+2).equals("XC")) {
                sum -= 20;
            }
            if (roman.substring(j, j+2).equals("CD")) {
                sum -= 200;
            }
            if (roman.substring(j, j+2).equals("CM")) {
                sum -= 200;
            }
        }

        /*
        Original, worse means of identifying invariants within the string.
        This was replaced because it could only identify one instance of any
        given invariant in a string.

        if (roman.indexOf("IV") != -1 || roman.indexOf("IX") != -1) {
            sum -= 2;
        }
        if (roman.indexOf("XL") != -1 || roman.indexOf("XC") != -1) {
            sum -= 20;
        }
        if (roman.indexOf("CD") != -1 || roman.indexOf("CM") != -1) {
            sum -= 200;
        }
        */

        return sum;
    }

    /**
     * Main method for the class RomanToDecimal
     * @param args Command line arguments, parameters for the romanToDecimal method
     */
    public static void main(String[] args) {
        /*
        Takes each of the command line args, passes them into romanToDecimal and prints
        the base-10 output if not invalid
         */
        for (String roman : args) {
            int decimal = romanToDecimal(roman.toUpperCase());
            System.out.print("Input: " + roman + " => output: ");
            //If an argument is not a valid Roman numeral, its output is printed as 'invalid'
            if (decimal == -1)
                System.out.println("invalid");
            else
                System.out.println(romanToDecimal(roman.toUpperCase()));
        }
    }
}

/*
A hypothetical start to a decimalToRoman method

while(decimal >= 1000) {
    roman += "M";
    decimal -= 1000;
    }
while (decimal >= 900) {
    roman += "CM";
    decimal -= 900;
    }
while(decimal >= 500) {
    roman += "D";
    decimal -= 500;
    }
while (decimal >= 400) {
    roman += "CD";
    decimal -= 400;
    }
while (decimal >= 100) {
    roman += "C";
    decimal -= 100;
    }
while(decimal >= 90) {
    roman += "XC";
    decimal -= 90;
    }
while (decimal >= L) {
    roman += "L";
    decimal -= 50;
    }
while(decimal >= 40) {
    roman += "XL";
    decimal -= 40;
    }
while (decimal >= 10) {
    roman += "X";
    decimal -= 10;
    }
while(decimal >= 9) {
    roman += "IX";
    decimal -= 9;
    }
while (decimal >= 5) {
    roman += "V";
    decimal -= 5;
    }
while(decimal >= 4) {
    roman += "IV";
    decimal -= 4;
    }
while (decimal >= 1) {
    roman += "I";
    decimal -= 1;
    }
 */