import java.util.*;
public class Maximum_Matrix_sum{
    public static long maxMatrixSum(int[][] matrix) {
        long sum=0;
        int neg=0,min=Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                int val=Math.abs(matrix[i][j]);
                if(matrix[i][j]<0)  neg++;
                if(val<min) min=val;
                sum+=val;
            }
        }
        return  (neg&1)==0?sum:sum-2*min;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(maxMatrixSum(arr));
    }
}