package pratice;

public class NetSalary {
    public static void main(String[] args) {
        double hra=600000;
        double da=3000;
        double basic=8000000;
        double total=hra+da+basic;
        double tax=total-0.15;
        double net_Salary=total- tax;
        System.out.println("HRA is "+hra);
        System.out.println("DA id : "+da);
        System.out.println("Basic is : "+basic);
        System.out.println("total is: "+total);
        System.out.println("Tax is :"+tax);
        System.out.println("Net_Salary is : "+net_Salary);

    }
}
