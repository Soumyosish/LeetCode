import java.util.*;
public class sqrt{
    public static int sqrt1(int x){
        return (int)Math.sqrt(x);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sqrt1(n));
    }
}