import java.util.*;
public class product{
    public static int[] productExceptSelf(int[] nums) {
        int p=1;
        int arr[]=new int[nums.length];
        arr[0]=1;
        for(int i=1;i<nums.length;i++){
            arr[i]=arr[i-1]*nums[i-1];
        }
        int right=1;
        for(int i=nums.length-1;i>=0;i--){
            arr[i]=arr[i]*right;
            right*=nums[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans[]=productExceptSelf(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}