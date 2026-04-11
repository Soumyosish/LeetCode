import java.util.*;
public class sqrt{
    public static int sqrt1(int x){
        // return (int)Math.sqrt(x);
        long left=1,right=x/2;
        if(x<2) return x;
        while(left<right){
            long mid=(left+right)/2;
            long square=mid*mid;
            if(square==x)   return (int)mid;
            else if(square<x)   left=mid+1;
            else    right=mid-1;
        }
        return (int)right; 
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sqrt1(n));
    }
}