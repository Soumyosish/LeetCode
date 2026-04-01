import java.util.*;
public class trappingrainwater {
    public static int trap(int[] height) {
        int left[]=new int[height.length];
        int right[]=new int[height.length];
        left[0]=height[0];
        right[height.length-1]=height[height.length-1];
        for(int i=1;i<height.length-1;i++){
            left[i]=Math.max(left[i-1],height[i]);
        }
        for(int i=height.length-2;i>=0;i--){
            right[i]=Math.max(right[i+1],height[i]);
        }
        int trapped=0;
        for(int i=0;i<height.length-1;i++){
            int water=Math.min(left[i],right[i]);
            trapped+=water-height[i];
        }
        return trapped;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); 
        int[] height=new int[n];
        for(int i=0;i<n;i++){
            height[i]=sc.nextInt();
        }
        int result=trap(height);
        System.out.println(result);
    }
}
