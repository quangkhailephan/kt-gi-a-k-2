import java.util.Scanner;

import javax.print.attribute.standard.DocumentName;

public class Hoadon {
    protected int MaHD, Maphong;
    protected String NgayHD, TenKH;
    protected double DonGia;
    Scanner in = new Scanner(System.in);
    protected Hoadon()
    {
        this.DonGia=0;
        this.MaHD=0;
        this.Maphong=0;
        this.NgayHD="";
        this.TenKH="";
    }
    protected Hoadon(int mahdon, int maphong, String ngayhd, String ten, double dgia)
    {
        this.MaHD=mahdon;
        this.Maphong=maphong;
        this.NgayHD=ngayhd;
        this.TenKH=ten;
        this.DonGia=dgia;
    }
    protected int getMaHD()  {
        return MaHD;
    }
    protected void setMaHD(int maHD)  {
        MaHD = maHD;
    }
    protected int getMaphong()  {
        return Maphong;
    }
    protected void setMaphong(int maphong)
        Maphong = maphong;
    }
    protected String getNgayHD()  {
        return NgayHD;
    }
    protected void setNgayHD(String ngayHD)  {
        NgayHD = ngayHD;
    }
    protected String getTenKH( ) {
        return TenKH;
    }
    protected void setTenKH(String tenKH)  {
        TenKH = tenKH;
    }
    protected double getDonGia()  {
        return DonGia;
    protected void setDonGia(double donGia) {
        DonGia = donGia;
    {
        System.out.println("Ma Giao Hang: ");
        MaHD = in.nextInt();
        System.out.println("Ma Phong");
        Maphong = in.nextInt();
        System.out.println(Ngay Hoa Don);
        NgayHD = in.next();
        System.out.println("Ten Khach Hang");
        TenKH = in.next();
        System.out.println("Don Gia");
        DonGia = in.nextDouble();
    }
    public String toString(
    {
        return " [MaHD=" + MaHD + ", Maphong=" + Maphong + ", NgayHD=" + NgayHD + ", TenKH=" + TenKH + ", DonGia=" + DonGia;

    }
}
        
 






    
}
