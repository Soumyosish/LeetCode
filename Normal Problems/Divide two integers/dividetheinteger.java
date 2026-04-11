import java.util.*;
public class dividetheinteger {
    public int divide(int dividend, int divisor) {
         if(dividend==Integer.MIN_VALUE && divisor==-1){
            return Integer.MAX_VALUE;
        }
        return (int)Math.ceil(dividend/divisor);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int dividend=sc.nextInt();
        int divisor=sc.nextInt();
        dividetheinteger ob=new dividetheinteger();
        System.out.println(ob.divide(dividend,divisor));
    }
}