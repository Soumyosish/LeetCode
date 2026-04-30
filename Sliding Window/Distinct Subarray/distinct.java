import java.util.*;
public class distinct{
    public static long maximumSubarraySum(int[] nums,int k){
        long max=0,window=0;
        Map<Integer,Integer>dis=new HashMap<>();
        for(int i=0;i<k;i++){
            window+=nums[i];
            dis.put(nums[i],dis.getOrDefault(nums[i],0)+1);
        }
        if(dis.size()==k)   max=window;
        for(int j=k;j<nums.length;j++){
            window+=nums[j];
            dis.put(nums[j],dis.getOrDefault(nums[j],0)+1);
            int out=nums[j-k];
            window-=out;
            int current=dis.get(out);
            if(current==1)  dis.remove(out);
            else    dis.put(out,current-1);
            if(dis.size()==k)   max=Math.max(max,window);
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(maximumSubarraySum(nums, k));
    }
}