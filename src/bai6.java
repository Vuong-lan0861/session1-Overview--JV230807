import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hãy nhập điểm Toán :");
        int toan = sc.nextInt();
        System.out.print("Hãy nhập điểm Lý :");
        int ly = sc.nextInt();
        System.out.print("Hãy nhập điểm Hóa :");
        int hoa = sc.nextInt();
        System.out.print("Hãy nhập điểm Văn :");
        int van = sc.nextInt();
        System.out.print("Hãy nhập điểm Tiếng Anh :");
        int anh = sc.nextInt();
        double tb =   (double) (toan + ly + hoa + van + anh) /5;
        if (0<= tb && tb < 5){
            System.out.printf("Xếp loại của bạn là Yếu với điểm trung bình là %.1f",tb);
        }else if(tb < 6.5){
            System.out.printf("xếp loaị của bạn là Trung bình với điểm trung bình là %.1f",tb);
        }else if(tb < 8){
            System.out.printf("Xếp loại của bạn là khá với điểm trung bình là %.1f",tb);
        }else if(tb < 9){
            System.out.printf("Xếp loại của bạn là giỏi với điểm trung bình là %.1f",tb);
        }else if(tb <= 10){
            System.out.printf("Xếp loại của bạn là xuất sắc với điểm trung bình là %.1f",tb);
        }else{
            System.out.println(("Điểm bạn nhập không hợp lệ"));
        }
    }
}