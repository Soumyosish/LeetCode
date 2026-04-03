import java.util.*;
public class subarray{
    public static int numSubarrayProductLessThanK(int[] nums, int k){
        if(k<=1)    return 0;
        int left=0,count=0,p=1;
        for(int i=0;i<nums.length;i++){
            p*=nums[i];
            while(p>=k){
                p/=nums[left];
                left++;
            }
            count+=i-left+1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(numSubarrayProductLessThanK(arr,k));
    }
}