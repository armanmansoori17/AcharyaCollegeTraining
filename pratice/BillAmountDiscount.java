package pratice;

import java.util.Scanner;

public class BillAmountDiscount {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double TotalAmount=sc.nextDouble();
        double discount=0;
        if (TotalAmount>2000){
            discount=TotalAmount*0.15;
        } else if (TotalAmount>1000) {
            discount=TotalAmount*0.8;
        }
        else{
            discount=0;
        }
        System.out.println(TotalAmount-discount);

    }
}
