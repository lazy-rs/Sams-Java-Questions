/*
Create a class that takes words for the first 10 numbers (“one” to “ten”) and
converts them into a single long integer. Use a switch statement for the
conversion and command-line arguments for the words
 */
package com.gitProject;

class DayFour_2 {

    public static void main(String[] args) {

        String word = null;
        if (args.length > 0) {
            word = args[0];
        }

       
        System.out.println("You have entered word : "+ word + 
                    " Its converted number is "+number(word));

    }

    static long number(String word) {
        int number = 0;
        long final_number = 0;

        switch (word) {
            case "one":
                number = 1;
                break;
            case "two":
                number = 2;
                break;
            case "three":
                number = 3;
                break;
            case "four":
                number = 4;
                break;
            case "five":
                number = 5;
                break;
            case "six":
                number = 6;
                break;
            case "seven":
                number = 7;
                break;
            case "eight":
                number = 8;
                break;
            case "nine":
                number = 9;
                break;
            case "ten":
                number = 10;
                break;

        }
            final_number = (long) number;
        return final_number;

    }

}
