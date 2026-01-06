import java.util.*;
public class Palindrome {
    public static boolean isPalindrome(int x) {
        int y=x,r=0;
        if(x<0) return false;
        else{
            while(x>0){
                int d=x%10;
                r=r*10+d;
                x=x/10;
            }
            if(y==r){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isPalindrome(n));
    }
}