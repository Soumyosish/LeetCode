import java.util.*;
public class firstoccurrence{
    public static int firstoccur(String haystack, String needle) {
        int x=needle.length();
        int y=haystack.length();
        String s="";
        if(x==0){
            return 0;
        }
        for(int i=0;i<=y-x;i++){
            s=haystack.substring(i,i+x);
            if(s.equals(needle)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();
        System.out.println(firstoccur(s, t));
    }
}