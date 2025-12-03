package pratice;

import java.util.Scanner;

public class UnitOfElectricity {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double unit= sc.nextDouble();
        double cost=0;
        if (unit<30){
            cost=3.50;
        } else if (unit>=30&&unit<50) {
            cost=4.25;
        } else if (unit>=50&&unit<100) {
            cost=5.25;
        }
        else {
            cost = 5.85;
        }
        double price= unit*cost;
        System.out.println(price);
    }
}
