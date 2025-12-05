import java.util.*;
public class poweroftwo {
    public static boolean powerof2(int n){
        return n>0 && (n&(n-1))==0;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(powerof2(n));
    }
}
