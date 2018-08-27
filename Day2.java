/*
Day 2 question

Create a program that calculates how much a $14,000 investment would be worth if
it increased in value by 40% during the first year, lost $1,500 in value the second
year, and increased 12% in the third year.

*/

package com.gitProject;

class Day2 {
    public static void main(String[] args) {
        int investment = 14_000;
        
        //calculating increase in the first year
        int increase = (40 * investment)/100;
        int firstYear = investment + increase;
        
        // calculating loss in second year
        int loss = 1_500;
        int secondYear = firstYear - loss;
        
        // calculating increase in the final year
        int increase_2nd = (12 * secondYear)/100;
        int final_Investment = secondYear + increase_2nd;
        System.out.format("Investment in the third year will be : $%,d%n", final_Investment);
        
    }
}
