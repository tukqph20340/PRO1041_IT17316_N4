/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class hoadon {

    private String MaHD;
    private String MaNV;
    private String MaKH;
    private String MaDT;
    private String MaBH;
    private String MaCH;
    private String GiaTien;
    private String TongTien;
    private String TienKhachTra;
    private String tienthua;
    private String TenNguoiMua;
    private String DiaChi;
    private String SDT;
    private String TinhTrang;

    public hoadon() {

    }

    @Override
    public String toString() {
        return "hoadon{" + "MaHD=" + MaHD + ", MaNV=" + MaNV + ", MaKH=" + MaKH + ", MaDT=" + MaDT + ", MaBH=" + MaBH + ", MaCH=" + MaCH + ", GiaTien=" + GiaTien + ", TongTien=" + TongTien + ", TienKhachTra=" + TienKhachTra + ", tienthua=" + tienthua + ", TenNguoiMua=" + TenNguoiMua + ", DiaChi=" + DiaChi + ", SDT=" + SDT + ", TinhTrang=" + TinhTrang + '}';
    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public String getMaDT() {
        return MaDT;
    }

    public void setMaDT(String MaDT) {
        this.MaDT = MaDT;
    }

    public String getMaBH() {
        return MaBH;
    }

    public void setMaBH(String MaBH) {
        this.MaBH = MaBH;
    }

    public String getMaCH() {
        return MaCH;
    }

    public void setMaCH(String MaCH) {
        this.MaCH = MaCH;
    }

    public String getGiaTien() {
        return GiaTien;
    }

    public void setGiaTien(String GiaTien) {
        this.GiaTien = GiaTien;
    }

    public String getTongTien() {
        return TongTien;
    }

    public void setTongTien(String TongTien) {
        this.TongTien = TongTien;
    }

    public String getTienKhachTra() {
        return TienKhachTra;
    }

    public void setTienKhachTra(String TienKhachTra) {
        this.TienKhachTra = TienKhachTra;
    }

    public String getTienthua() {
        return tienthua;
    }

    public void setTienthua(String tienthua) {
        this.tienthua = tienthua;
    }

    public String getTenNguoiMua() {
        return TenNguoiMua;
    }

    public void setTenNguoiMua(String TenNguoiMua) {
        this.TenNguoiMua = TenNguoiMua;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(String TinhTrang) {
        this.TinhTrang = TinhTrang;
    }

    public hoadon(String MaHD, String MaNV, String MaKH, String MaDT, String MaBH, String MaCH, String GiaTien, String TongTien, String TienKhachTra, String tienthua, String TenNguoiMua, String DiaChi, String SDT, String TinhTrang) {
        this.MaHD = MaHD;
        this.MaNV = MaNV;
        this.MaKH = MaKH;
        this.MaDT = MaDT;
        this.MaBH = MaBH;
        this.MaCH = MaCH;
        this.GiaTien = GiaTien;
        this.TongTien = TongTien;
        this.TienKhachTra = TienKhachTra;
        this.tienthua = tienthua;
        this.TenNguoiMua = TenNguoiMua;
        this.DiaChi = DiaChi;
        this.SDT = SDT;
        this.TinhTrang = TinhTrang;
    }

    public Object[] toDataRow() {
        return new Object[]{MaHD, MaNV, MaKH, MaDT, MaBH, MaCH, GiaTien, TongTien, TienKhachTra, tienthua, TenNguoiMua, DiaChi, SDT, TinhTrang};
    }
}
