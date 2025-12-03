import java.util.*;
public class Palindrome{
    public static boolean palindromenumber(int x){
        int y=x,s=0;
        if(x<0){
            return false;
        }
        while(x>0){
            int n=x%10;
            s=s*10+n;
            x=x/10;
        }
        if(y==s){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(palindromenumber(x));
    }
}