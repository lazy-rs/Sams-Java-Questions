/*
. Create a program that turns a birthday in MM/DD/YYYY format (such as
04/29/2016) into three individual strings.
 */
package com.gitProject;

import java.util.Scanner;
import java.util.StringTokenizer;

class DayThree {

    public static void main(String[] args) {
        // creating a Scanner object to read birthday from user
        Scanner userInput = new Scanner(System.in);
        // Creating a StringTokenzier object 
        StringTokenizer dateString;

        // creating a String object to store birthdate
        String birthDate = "";
        System.out.println("Please Enter your birthdate : "
                + " \n Enter in the format MM/DD/YYYY");
        birthDate = userInput.next();
        dateString = new StringTokenizer(birthDate, "/");
        System.out.println("Your birthday is on :"
                + "\n " + dateString.nextToken()
                + "   \n " + dateString.nextToken()
                + "\n" + dateString.nextToken());

    }
}
