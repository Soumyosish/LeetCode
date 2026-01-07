import java.util.Scanner;
public class Reverse {
    public static int reverse(int x) {
        int r=0;
        while(x!=0){
            int d=x%10;
            int r1=r*10+d;
            if((r1-d)/10!=r){
                return 0;
            }
            r=r1;
            x=x/10;
        }
        return r;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=reverse(n);
        System.out.println(x);
    }
}