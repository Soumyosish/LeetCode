import java.util.*;
public class subarray {
    public static int minSubArrayLen(int[] nums,int target){
        int left=0,sum=0,min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum>=target){
                min=Math.min(min,i-left+1);
                sum-=nums[left];
                left++;
            }
        }
        return min==Integer.MAX_VALUE?0:min;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int  target=sc.nextInt();
        System.out.println(minSubArrayLen(arr,target));
    }
}
