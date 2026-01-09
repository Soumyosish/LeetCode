import java.util.*;
public class Pow {
    public static double myPow(double x, int n) {
        return Math.pow(x,n);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double x=sc.nextDouble();
        System.out.println(myPow(x,n));
    }
}