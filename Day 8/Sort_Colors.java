import java.util.*;
public class Sort_Colors {
    public static void sortColors(int[] nums) {
        int x=0,y=0,z=0;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            if(nums[start]==0){
                x++;
            }
            else if(nums[start]==1){
                y++;
            }
            else if(nums[start]==2){
                z++;
            }
            start++;
        }
        for(int i=0;i<nums.length;i++){
            if(x!=0){
                nums[i]=0;
                x--;
            }
            else if(x==0 && y!=0){
                nums[i]=1;
                y--;
            }
            else if(x==0 && y==0 && z!=0){
                nums[i]=2;
                z--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
}