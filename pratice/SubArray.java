package pratice;

import java.util.Scanner;

public class SubArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr ={6,4,8,4,6,7,6,4,6,4,6,4};
        System.out.println("enter first index");
        int first=sc.nextInt();
        System.out.println("enter second index");
        int second=sc.nextInt();
        sub(arr,first,second);
    }

    public static void sub(int arr[], int first, int second) {

        if (first < 0 || second >= arr.length || first > second) {
            System.out.println("Invalid index range!");
            return;
        }

        for (int i = first; i <= second; i++) {  // inclusive
            System.out.print(arr[i] + " ");
        }
    }
}