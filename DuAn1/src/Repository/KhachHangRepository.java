/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DomainModel.KhachHang;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author fptshop
 */
public class KhachHangRepository {

    public List<KhachHang> select() {
        ArrayList<KhachHang> list = new ArrayList<>();
        try {
            Connection con = DBContext.getConnection();
            String sql = "select MaKH,HoVaTen,DiaChi,Sdt,NgaySinh,ThanhPho from KhachHang";
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                String MaKH = rs.getString("MaKH");
                String HoVaTen = rs.getString("HoVaTen");
                String DiaChi = rs.getString("DiaChi");
                String Sdt = rs.getString("Sdt");
                String NgaySinh = rs.getString("NgaySinh");
                String ThanhPho = rs.getString("ThanhPho");
                KhachHang kh = new KhachHang();
                kh.setMaKH(MaKH);
                kh.setHoVaTen(HoVaTen);
                kh.setDiaChi(DiaChi);
                kh.setSdt(Sdt);
                kh.setNgaySinh(NgaySinh);
                kh.setThanhPho(ThanhPho);
                list.add(kh);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "lỗi câu select");
        }
        return list;
    }

    public List<KhachHang> select1(String makh) {
        ArrayList<KhachHang> list = new ArrayList<>();
        try {
            Connection con = DBContext.getConnection();
            String sql = "select MaKH,HoVaTen,DiaChi,Sdt,NgaySinh,ThanhPho from KhachHang where MaKH=?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, makh);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                String MaKH = rs.getString("MaKH");
                String HoVaTen = rs.getString("HoVaTen");
                String DiaChi = rs.getString("DiaChi");
                String Sdt = rs.getString("Sdt");
                String NgaySinh = rs.getString("NgaySinh");
                String ThanhPho = rs.getString("ThanhPho");
                KhachHang kh = new KhachHang();
                kh.setMaKH(MaKH);
                kh.setHoVaTen(HoVaTen);
                kh.setDiaChi(DiaChi);
                kh.setSdt(Sdt);
                kh.setNgaySinh(NgaySinh);
                kh.setThanhPho(ThanhPho);
                list.add(kh);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "lỗi câu select");
        }
        return list;
    }

    public List<KhachHang> insert(String MaKH, String HoVaTen, String DiaChi, String Sdt, String NgaySinh, String ThanhPho) {
        ArrayList<KhachHang> list = new ArrayList<>();
        try {
            Connection con = DBContext.getConnection();
            String sql = "insert KhachHang(MaKH,HoVaTen,DiaChi,Sdt,NgaySinh,ThanhPho)values(?,?,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, MaKH);
            st.setString(2, HoVaTen);
            st.setString(3, DiaChi);
            st.setString(4, Sdt);
            st.setString(5, NgaySinh);
            st.setString(6, ThanhPho);
            st.executeUpdate();
            KhachHang kh = new KhachHang();
            kh.setMaKH(MaKH);
            kh.setHoVaTen(HoVaTen);
            kh.setDiaChi(DiaChi);
            kh.setSdt(Sdt);
            kh.setNgaySinh(NgaySinh);
            kh.setThanhPho(ThanhPho);
            list.add(kh);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Mã khách hàng đã tồn tại vui lòng nhập mã khác");
            
        }
        return list;
    }

    public List<KhachHang> update(String MaKH, String HoVaTen, String DiaChi, String Sdt, String NgaySinh, String ThanhPho) {
        ArrayList<KhachHang> list = new ArrayList<>();
        try {
            Connection con = DBContext.getConnection();
            String sql = "update KhachHang set HoVaTen=?,DiaChi=?,Sdt=?,NgaySinh=?,ThanhPho=? where MaKH=?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(6, MaKH);
            st.setString(1, HoVaTen);
            st.setString(2, DiaChi);
            st.setString(3, Sdt);
            st.setString(4, NgaySinh);
            st.setString(5, ThanhPho);
            st.executeUpdate();
            KhachHang kh = new KhachHang();
            kh.setMaKH(MaKH);
            kh.setHoVaTen(HoVaTen);
            kh.setDiaChi(DiaChi);
            kh.setSdt(Sdt);
            kh.setNgaySinh(NgaySinh);
            kh.setThanhPho(ThanhPho);
            list.add(kh);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "lỗi câu update");
        }
        return list;

    }
     public List<KhachHang> delete(String MaKH) {
        ArrayList<KhachHang> list = new ArrayList<>();
        try {
            Connection con = DBContext.getConnection();
            String sql = "delete from KhachHang where MaKH=?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, MaKH);
            st.executeUpdate();
            KhachHang kh = new KhachHang();
            kh.setMaKH(MaKH);
            list.add(kh);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "lỗi câu delete");
        }
        return list;

    }
    
}
