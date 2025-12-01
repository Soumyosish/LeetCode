import java.util.*;
public class sortcolors {
    public static void sort(int arr[]){
        int x=0,y=0,z=0;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            if(arr[start]==0){
                x++;
            }
            else if(arr[start]==1){
                y++;
            }
            else if(arr[start]==2){
                z++;
            }
            start++;
        }
        for(int i=0;i<arr.length;i++){
            if(x!=0){
                arr[i]=0;
                x--;
            }
            else if(x==0 && y!=0){
                arr[i]=1;
                y--;
            }
            else if(x==0 && y==0 && z!=0){
                arr[i]=2;
                z--;
            }
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
