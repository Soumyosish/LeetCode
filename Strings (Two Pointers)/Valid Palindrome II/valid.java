import java.util.*;
public class valid {
    public static boolean validPalindrome(String s) {
        int start=0;
        int end=s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end))   return str(s,start+1,end) || str(s,start,end-1);
            start++;
            end--; 
        }
        return true;
    }
    public static boolean str(String s,int start,int end){
        while(start<end){
            if(s.charAt(start)!=s.charAt(end))  return false;
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(validPalindrome(s));
    }
}