import java.util.*;
public class Nrepeatedelement{
    public static int repeatedNTimes(int[] nums) {
        if(nums[0]==nums[nums.length-1])    return nums[0];
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]||nums[i]==nums[i+2])  return nums[i];
        }
        return nums[0];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(repeatedNTimes(arr));
    }
}