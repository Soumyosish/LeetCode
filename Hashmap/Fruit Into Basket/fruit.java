import java.util.*;
public class fruit {
    public static int totalFruit(int[] nums) {
        int left=0,sum=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            while(map.size()>2){
                map.put(nums[left],map.get(nums[left])-1);
                if(map.get(nums[left])==0)  map.remove(nums[left]);
                left++;
            }
            sum=Math.max(sum,i-left+1);
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(totalFruit(arr));
    }
}
