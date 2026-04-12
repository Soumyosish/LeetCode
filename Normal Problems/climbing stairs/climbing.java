import java.util.*;
public class climbing {
    public static int climbStairs(int n) {
       if(n==1){
        return 1;
       } 
       int x[]=new int[n+1];
       x[1]=1;
       x[2]=2;
       for(int i=3;i<=n;i++){
        x[i]=x[i-1]+x[i-2];
       }
       return x[n];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(climbStairs(n));
    }
}