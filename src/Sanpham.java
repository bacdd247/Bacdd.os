import java.util.Scanner;

public class Sanpham {


    int soLuong;
    String tenSanPham, maSanPham;
    double thanhTien, giaBan;

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public Sanpham(String maSanPham, String tenSanPham, double giaBan, int soLuong) {
        this.maSanPham = maSanPham;
        this.soLuong = soLuong;
        this.tenSanPham = tenSanPham;
        this.thanhTien = thanhTien;
        this.giaBan = giaBan;
    }

    public Sanpham() {
        this.maSanPham = maSanPham;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
        this.tenSanPham = tenSanPham;
        this.thanhTien = thanhTien;
    }



    public static void nhapThongTinSP(Sanpham[] Product, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Nhap thong tin san pham thu " + (i + 1));
            Product[i] = new Sanpham();
            System.out.print("Nhap ma san pham: ");
            Scanner input = new Scanner(System.in);
            Product[i].maSanPham = input.nextLine();
            System.out.print("Nhap ten san pham: ");
            input = new Scanner(System.in);
            Product[i].tenSanPham = input.nextLine();
            System.out.print("Nhap gia ban san pham: ");
            input = new Scanner(System.in);
            Product[i].giaBan =  input.nextInt();
            System.out.print("Nhap so luong san pham: ");
            input = new Scanner(System.in);
            Product[i].soLuong = input.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (Product[i].soLuong > 20) {
                Product[i].thanhTien = Product[i].giaBan * Product[i].soLuong * 0.85;
            } else {
                Product[i].thanhTien = Product[i].giaBan * Product[i].soLuong;
            }
        }

        for (int j = 0; j < n; j++) {
            for (int i = n - 1; i > j; --i) {
                if (Product[i].thanhTien < Product[i - 1].thanhTien) {
                    Sanpham sp = Product[i];
                    Product[i] = Product[i - 1];
                    Product[i - 1] = sp;
                }
            }
        }
    }

    public static void hienThiDanhSachSP(Sanpham[] Product, int n) {
        System.out.println("-----------------------");
        for (int i = 0; i < n; i++) {
            System.out.println("San pham ma so " + Product[i].maSanPham + ", ten la " + Product[i].tenSanPham + " co gia " + Product[i].giaBan);
            System.out.println("Duoc ban voi so luong la " + Product[i].soLuong + " => thanh tien: " + Product[i].thanhTien);
            System.out.println();
        }
    }
}
