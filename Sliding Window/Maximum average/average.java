import java.util.*;
public class average {
    public static double findMaxAverage(int[] nums, int k){
        double window=0;
        for(int i=0;i<k;i++){
            window+=nums[i];
        }
        double max=window;
        for(int j=k;j<nums.length;j++){
            window+=nums[j];
            window-=nums[j-k];
            max=Math.max(window,max);
        }
        return max/k;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(findMaxAverage(arr, k));
    }
}
