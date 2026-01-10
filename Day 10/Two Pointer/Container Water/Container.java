import java.util.*;
public class Container {
    public static int maxArea(int arr[]){
        int left=0;int right=arr.length-1;int maxwater=0;
        while(left<right){
            int h=Math.min(arr[left],arr[right]);
            int width=right-left;
            int curr=h*width;
            maxwater=Math.max(curr,maxwater);
            if(arr[left]<arr[right])    left++;
            else    right--;
        }
        return maxwater;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(maxArea(arr));
    }
}
