import java.util.Scanner;
public class bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hãy nhập số cần kiểm tra : ");
        int numb = sc.nextInt();
        String str = "";
        if (numb % 15 == 0) {
            str = "Chia hết cho cả 3 và 5";
        } else if (numb % 5 == 0) {
            str = "Chỉ chia hết cho 5";
        } else if (numb % 3 == 0) {
            str = "Chỉ chia hết cho 3";
        } else {
            str = "Không chia hết cho 3 , cũng không chia hết cho 5";
        }
        System.out.printf("%d là số %s",numb,str);
    }
}