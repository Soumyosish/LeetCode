import java.util.*;
public class Two_Sum{
    public static int[] twosum(int arr[],int target){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int value=target-arr[i];
            if(map.containsKey(value))  return new int[]{map.get(value),i};
            map.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int result[]=twosum(arr, target);
        System.out.println(Arrays.toString(result));
    }
}