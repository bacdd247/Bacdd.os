import java.util.Scanner;

public class Nhapsanpham {
    public static void main(String[] args) {
        System.out.print("Hay cho biet so luong san pham ban muon nhap: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Sanpham[] Product = new Sanpham[n];
        Sanpham.nhapThongTinSP(Product, n);
        Sanpham.hienThiDanhSachSP(Product, n);
    }
}
