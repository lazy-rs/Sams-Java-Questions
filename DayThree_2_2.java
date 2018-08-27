/*
Create a class with instance variables for height, weight, and depth, making
each an integer. Create a Java application that uses your new class, sets each of these
values in an object, and displays the values.
*/
package com.gitProject;

class DayThree_2_2 {
    public static void main(String[] args) {
        DayThree_2 obj = new DayThree_2();
        obj.depth = 10;
        obj.height = 20;
        obj.weight = 30;
        
        System.out.println("Height : " + obj.height +
                "\nDepth : " + obj.depth + 
                "\nWeight : " + obj.weight);
    }
}