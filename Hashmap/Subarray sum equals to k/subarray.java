import java.util.*;
public class subarray {
   public static int subarraySum(int[] nums, int k) { 
    HashMap<Integer,Integer>map=new HashMap<>();
    int prefix=0,count=0;
    map.put(0,1);
    for(int i=0;i<nums.length;i++){
        prefix+=nums[i];
        if(map.containsKey(prefix-k))   count+=map.get(prefix-k);
        map.put(prefix,map.getOrDefault(prefix,0)+1);
    }
    return count;
   }
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int target=sc.nextInt();
    System.out.println(subarraySum(arr, target));
   }
}
