import java.util.*;
public class PlusOne {
    public static int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int x[]=new int[digits.length+1];
        x[0]=1;
        return x;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k[]=new int[n];
        for(int i=0;i<n;i++){
            k[i]=sc.nextInt();
        }
        int x[]=plusOne(k);
        System.out.println(Arrays.toString(x));
    }
}