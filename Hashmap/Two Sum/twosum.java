import java.util.*;
public class twosum{
    public static int[] twosum1(int arr[],int target){
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int element=target-arr[i];
            if(map.containsKey(element))    return new int[]{map.get(element),i};
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
        int ans[]=twosum1(arr,target);
        System.out.println("["+ans[0]+","+ans[1]+"]");
    }
}