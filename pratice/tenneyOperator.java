package pratice;

public class tenneyOperator {
    public static void main(String[] args) {
        int a=10;
        int b=100;
        int c=300;
        int d=450;
        int e=690;
        int max = (a > b) ? ( (a>c) ? ( (a>d) ? ( (a>e) ? a : e ) : ( (d>e) ? d : e ) ) : ( (c>d) ? ( (c>e) ? c : e ) : ( (d>e) ? d : e ) ) ) : ( (b>c) ? ( (b>d) ? ( (b>e) ? b : e ) : ( (d>e) ? d : e ) ) : ( (c>d) ? ( (c>e) ? c : e ) : ( (d>e) ? d : e ) ) );
        System.out.println("the max value is  "+max);
//        if ((a>b)&&(a>b)&&(a>c)&&(a>d)&&a>e){
//            System.out.println("A is Greatest");
//        } else if ((b>c)&&(b>c)&&(b>d)&&(b>e)) {
//            System.out.println("B is greater");
//
//        } else if ((c>d)&&(c>e)) {
//            System.out.println("C is greater");
//
//        } else if (d>e) {
//            System.out.println("D is greater");
//
//        }
//        else System.out.println("e is greater");

    }
}
