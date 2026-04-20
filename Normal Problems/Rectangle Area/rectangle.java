import java.util.*;
public class rectangle {
    public static int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area=((ax2-ax1)*(ay2-ay1));
        int area1=((bx2-bx1)*(by2-by1));
        int length=Math.max(0,Math.min(ax2,bx2)-Math.max(ax1,bx1));
        int width=Math.max(0,Math.min(ay2,by2)-Math.max(ay1,by1));
        int overlap=length*width;
        return area+area1-overlap;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ax1 = sc.nextInt();
        int ay1 = sc.nextInt(); 
        int ax2 = sc.nextInt();
        int ay2 = sc.nextInt();
        int bx1 = sc.nextInt();
        int by1 = sc.nextInt();
        int bx2 = sc.nextInt();
        int by2 = sc.nextInt();
        System.out.println(computeArea(ax1, ay1, ax2, ay2, bx1, by1, bx2, by2));
    }
}