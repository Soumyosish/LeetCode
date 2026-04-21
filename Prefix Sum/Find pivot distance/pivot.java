import java.util.*;
public class pivot{
    public static int pivotIndex(int[] nums) {
        int total=0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
        }
        int left=0;
        for(int i=0;i<nums.length;i++){
            int right=total-left-nums[i];
            if(left==right) return i;
            left+=nums[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(pivotIndex(arr));
    }
}