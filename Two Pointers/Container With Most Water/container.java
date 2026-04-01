import java.util.*;
public class container {
    public static int maxArea(int[] height){
        int start=0;
        int end=height.length-1;
        int water=0;
        while(start<=end){
            int high=Math.min(height[start],height[end]);
            int width=end-start;
            int area=high*width;
            water=Math.max(area,water);
            if(height[start]<height[end])   start++;
            else    end--;
        }
        return water;
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();  
       int[] height=new int[n];
       for(int i=0;i<n;i++){
            height[i]=sc.nextInt();
        }
        System.out.println(maxArea(height));
           
    }
}
