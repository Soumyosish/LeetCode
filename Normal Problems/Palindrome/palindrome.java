package Palindrome;
import java.util.*;
public class palindrome {
    public static boolean isPalindrome(int x) {
        if(x<0) return false;
        int z=x,s=0;
        while(x!=0){
            int y=x%10;
            s=s*10+y;
            x/=10;
        }
        return z==s?true:false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isPalindrome(n));
    }
}