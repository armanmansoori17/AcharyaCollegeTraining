package pratice;

import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arman=new int[5];



        for (int i=0;i<5;i++){
            arman[i]=sc.nextInt();

        }
        for (int i=0;i<5 ;i++){
            System.out.print(arman[i]+" ");
        }


    }
}
