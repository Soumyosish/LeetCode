import java.util.*;
import java.util.Arrays;
public class concatenation {
    public static int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int ar[]=new int[2*n];
        for(int i=0;i<n;i++){
            ar[i]=nums[i];
        }
        for(int i=0;i<n;i++){
            ar[i+n]=nums[i];
        }
        return ar;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(getConcatenation(arr)));  //printing the final array
    } 
}