package pratice;

import java.util.Scanner;

public class Time {
    public static void PrintTime(int time){
        if(time>1&time<=12){
            System.out.println(time+"am");
        }
        else if(time>12 &  time<24) {
            System.out.println(time + "pm");
        }
        else System.out.println("invalid");

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PrintTime(20);
    }
}
