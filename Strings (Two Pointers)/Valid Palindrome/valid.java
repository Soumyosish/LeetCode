import java.util.*;
public class valid {
    public static boolean isPalindrome(String s) {
        int start=0;
        int end=s.length()-1;
        while(start<end){
            if(!Character.isLetterOrDigit(s.charAt(start))) start++;
            else if(!Character.isLetterOrDigit(s.charAt(end)))  end--;
            else{
                if(Character.toLowerCase(s.charAt(start))!=Character.toLowerCase(s.charAt(end)))    return false;
                start++;
                end--;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(isPalindrome(s));
    }
}