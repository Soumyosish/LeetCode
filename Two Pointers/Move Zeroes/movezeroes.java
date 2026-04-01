import java.util.*;
public class movezeroes{
    public void moveZeroes(int[] nums) {
        int curr=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[curr];
                nums[curr]=nums[i];
                nums[i]=temp;
                curr++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        movezeroes obj=new movezeroes();
        obj.moveZeroes(arr);    
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }      
    }
}