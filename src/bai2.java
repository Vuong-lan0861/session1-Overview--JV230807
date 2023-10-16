import java.util.Scanner;
public class bai2 {
    public static void main(String[] args) {
        int rate = 23000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập số tiền USD cần chuyển đổi");
        int numb = sc.nextInt();
        System.out.println("Số tiền VND là "+(numb*rate) + "VND");
    }
}