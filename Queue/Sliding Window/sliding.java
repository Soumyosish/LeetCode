import java.util.*;
class sliding {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int result[]=new int[n-k+1];
        Deque<Integer>deque=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            while(!deque.isEmpty() && deque.peekFirst()<=i-k){
                deque.pollFirst();
            }
            while(!deque.isEmpty() && nums[deque.peekLast()]<nums[i]){
                deque.pollLast();
            }
            deque.addLast(i);
            if(i>=k-1){
                result[i-k+1]=nums[deque.peekFirst()];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); 
        int k=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        sliding s=new sliding();
        int result[]=s.maxSlidingWindow(nums, k);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}