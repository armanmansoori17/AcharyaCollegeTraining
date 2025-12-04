package pratice;


import java.util.Scanner;

public class CricketMatchResult {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the RCB Score");
        int RCB_scored=scan.nextInt();
        System.out.println("Enter the KKR Score");
        int KKR_scored=scan.nextInt();
        if(RCB_scored>KKR_scored){
            System.out.println("RCB Win the match");
        } else if (RCB_scored<KKR_scored) {
            System.out.println("KKR win the match");
        }
        else {
            System.out.println("The match is Tie");
        }
    }
}
