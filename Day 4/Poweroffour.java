import java.util.*;
public class Poweroffour{
    public static boolean powerof4(int n){
        if(n<=0){
            return false;
        }
        while(n%4==0){
            n/=4;
        }
        return n==1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(powerof4(n));
    }
}