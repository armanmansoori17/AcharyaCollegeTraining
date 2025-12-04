package pratice;

import java.util.Scanner;

public class TernaryOps {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age= sc.nextInt();
        int x = age>18?0:1;
        System.out.println(x);
    }
}
