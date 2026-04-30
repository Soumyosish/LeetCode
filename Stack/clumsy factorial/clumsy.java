import java.util.*;
public class clumsy {
    public int clumsy(int n){
        Stack<Integer>stack=new Stack<>();
        stack.push(n);
        n--;
        int index=0;
        while(n>0){
            if(index%4==0)  stack.push(stack.pop()*n);
            if(index%4==1)  stack.push(stack.pop()/n);
            if(index%4==2)  stack.push(n);
            if(index%4==3)  stack.push(-n);
            index++;
            n--;
        }
        int result=0;
        while (!stack.isEmpty()) {
            result += stack.pop();
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(new clumsy().clumsy(n));
    }
}
