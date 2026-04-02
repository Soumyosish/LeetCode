import java.util.*;
public class maximum{
    public static int longestOnes(int[] nums, int k){
        int left=0,zero=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)  zero++;
            if(zero>k){
                if(nums[left]==0)   zero--;
                left++;
            }
        }
        return nums.length-left;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(longestOnes(arr, k));
    }
}