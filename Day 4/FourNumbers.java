import java.util.*;
public class FourNumbers {
    private static int factors(int n){
        int s=0,c=0;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                int j=n/i;
                if(j==i || c>0) return 0;
                    s+=i+j;
                    c++;
                }
            }
            if(c==0)    return 0;
            return 1+s+n;
        }
    public static int sumFourDivisors(int[] nums) {
        int s=0;
        for(int i=0;i<nums.length;i++){
            s+=factors(nums[i]);
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(sumFourDivisors(arr));
    }
}