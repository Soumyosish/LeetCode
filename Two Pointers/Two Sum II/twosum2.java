import java.util.*;
public class twosum2{
    public static int[] twosum(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int sum=arr[start]+arr[end];
            if(sum==target) return new int[]{start+1,end+1};
            else if(sum<target) start++;
            else    end--;
        }
        return new int[]{-1,-1};
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int target=sc.nextInt();
        int ans[]=twosum(arr,target);
        System.out.println(ans[0]+" "+ans[1]);
    }
}