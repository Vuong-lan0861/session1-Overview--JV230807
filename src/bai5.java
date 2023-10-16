import java.util.Scanner;
public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập chiều rộng :");
        int w = sc.nextInt();
        System.out.println("Hãy nhập chiều dài :");
        int l = sc.nextInt();
        System.out.printf("Chu vi của hình chữ nhật có chiều rộng %d , chiều dài %d là: %d", w,l,(w+l)*2 );
        System.out.printf("\n Diện tính của hình chữ nhật có chiều rộng %d , chiều dài %d là : %d",w,l,(w*l));
    }
}