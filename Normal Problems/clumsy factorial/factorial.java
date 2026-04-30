import java.util.*;
class factorial {
    public int clumsy(int n) {
        if(n==0)   return 0;
        if(n==1)   return 1;
        if(n==2)   return 2;
        if(n==3)   return 6;
        if(n==4)   return 7;
        if(n%4==0) return n + 1;
        if(n%4<=2) return n + 2;
        return n-1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(new factorial().clumsy(n));
    }
}