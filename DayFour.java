/*
Using the countDays() method from the DayCounter application, create an
application that displays every date in a given year in a single list from January 1 to
December 31.
 */
package com.gitproject;

class DayFour {

    public static void main(String[] args) {
        countDays();
    }

    static void countDays() {

        for (int i = 1; i <= 12; i++) {
            System.out.println("\nDays in Month " + i + " are : ");
            for (int j = 1; j <= 31; j++) {

                // for feburary 
                if (i == 2) {
                    if (j == 29) {
                        break;
                    }
                    System.out.print(j + " ");
                }

                //for august
                else  if (i == 8) {
                    System.out.print(j + " ");
                }

                //for even months before august
                else if ((i % 2 == 0) && (i < 8)) {
                    if (j == 31) {
                        break;
                    }

                    System.out.print(j + " ");
                }
                // for odd months after august
              else  if ((i > 8) && (i % 2 == 1)) {
                    if (j == 31) {
                        break;
                    }
                    System.out.print( j + " ");
                }

              else {
                    System.out.print( j + " ");
              }

            }

        }
    }

}
