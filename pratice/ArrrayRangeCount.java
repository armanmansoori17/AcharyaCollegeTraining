
/*Take a two dimensional array of size 3X3. Insert the values into the
array using the scanner class. Insert different numbers. Now check how many numbers are between 1 to 50, 50 to 100 and above 100. Using conditional statement for achieving the output.

        Example:

        81   23   340

        22   5    3

        2    73   105

Expected output:

In the above array there are 5 number  between 1 to 50
In the above array there are 2 number  between 50 to 100
In the above array there are 2 number  above 100

Take your own ramdom values into the array and check.*/
        package pratice;

import java.util.Scanner;
public class ArrrayRangeCount {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[][] arr = new int[3][3];

            System.out.println("Enter 9 different numbers for the 3x3 array:");

            // Taking input
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            int count1to50 = 0;
            int count50to100 = 0;
            int countAbove100 = 0;

            // Counting values
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int num = arr[i][j];

                    if (num >= 1 && num <= 50) {
                        count1to50++;
                    } else if (num > 50 && num <= 100) {
                        count50to100++;
                    } else if (num > 100) {
                        countAbove100++;
                    }
                }
            }

            // Output
            System.out.println("In the above array there are " + count1to50 + " numbers between 1 to 50");
            System.out.println("In the above array there are " + count50to100 + " numbers between 50 to 100");
            System.out.println("In the above array there are " + countAbove100 + " numbers above 100");
        }
    }


