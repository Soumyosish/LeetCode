import java.util.*;
public class reverse {
    public static void reverseString(char[] s) {
           int start=0;
        int end=s.length-1;
        while(start<end){
            char temp=s[end];
            s[end]=s[start];
            s[start]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // String s = sc.next();
        // char[] ch = s.toCharArray();
        int n=sc.nextInt();
        char ch[]=new char[n];
        for(int i=0;i<n;i++){
            ch[i]=sc.next().charAt(0);
        }
        reverseString(ch);
        System.out.println(new String(ch));
    }
}