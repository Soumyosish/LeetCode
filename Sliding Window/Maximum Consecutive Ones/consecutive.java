import java.util.*;
public class consecutive {
    public static int findMaxConsecutiveOnes(int[] nums){
        int current=0,max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1)  current++;
            else{
                max=Math.max(max,current);
                current=0;
            }
        }
        return Math.max(max,current);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(findMaxConsecutiveOnes(arr));
    }
}
