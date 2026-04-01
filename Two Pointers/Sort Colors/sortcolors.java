import java.util.*;
public class sortcolors {
    public static void sortcolours(int arr[]){
        int start=0,end=arr.length-1,curr=0;
        while(curr<=end){
            if(arr[curr]==0){
                int temp=arr[start];
                arr[start]=arr[curr];
                arr[curr]=temp;
                start++;
                curr++;
            }
            else if(arr[curr]==1)   curr++;
            else if(arr[curr]==2){
                int temp=arr[end];
                arr[end]=arr[curr];
                arr[curr]=temp;
                end--;
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
        sortcolours(arr);
        System.out.println(Arrays.toString(arr));
    }
}
