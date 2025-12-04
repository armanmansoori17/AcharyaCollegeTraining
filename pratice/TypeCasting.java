package pratice;

public class TypeCasting {
    public static void main(String[] args) {
        int x=100000;
        int e=200000;
        double y=x;
        long z=x;
        long c=(long)x*e;
        byte b=-127;
        float rent=(float) 15/6;
        System.out.println("double "+y);
        System.out.println("int "+x);
        System.out.println("long "+z);
        System.out.println(c);
        System.out.println(rent);
        System.out.println(b);
        System.out.println(b+x);
    }
}
