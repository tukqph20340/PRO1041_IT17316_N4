/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repostory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.hoadon;

/**
 *
 * @author Admin
 */
public class hoadonrepostory {

    public List<hoadon> getall() {

        String query = "select * From HoaDon";

        try (Connection con = SQLserverconnection.getConnection();
                PreparedStatement ps = con.prepareStatement(query);) {

            ResultSet rs = ps.executeQuery();

            List<hoadon> listDongVat = new ArrayList<>();

            while (rs.next()) {
                hoadon hd = new hoadon(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14));
                listDongVat.add(hd);
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public hoadon getone(String maKH) {
        String query = "select * from HoaDon where MaHD = ?";
        try (Connection con = SQLserverconnection.getConnection();
                PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, maKH);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                hoadon hd = new hoadon(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14));
                return hd;
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public boolean add(hoadon hd) {
        String query = "INSERT INTO [dbo].[HoaDon]\n"
                + "           ([MaHD]\n"
                + "           ,[MaNV]\n"
                + "           ,[MaKH]\n"
                + "           ,[MaDT]\n"
                + "           ,[MaBH]\n"
                + "           ,[MaCH]\n"
                + "           ,[GiaTien]\n"
                + "           ,[TongTien]\n"
                + "           ,[TienKhachTra]\n"
                + "           ,[TienThua]\n"
                + "           ,[TenNguoiMua]\n"
                + "           ,[DiaChi]\n"
                + "           ,[Sdt]\n"
                + "           ,[TinhTrang])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        int check = 0;
        try (Connection con = SQLserverconnection.getConnection();
                PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, hd.getMaHD());
            ps.setObject(2, hd.getMaNV());
            ps.setObject(3, hd.getMaKH());
            ps.setObject(4, hd.getMaDT());
            ps.setObject(5, hd.getMaBH());
            ps.setObject(6, hd.getMaCH());
            ps.setObject(7, hd.getGiaTien());
            ps.setObject(8, hd.getTongTien());
            ps.setObject(9, hd.getTienKhachTra());
            ps.setObject(10, hd.getTienthua());
            ps.setObject(11, hd.getTenNguoiMua());
            ps.setObject(12, hd.getDiaChi());
            ps.setObject(13, hd.getSDT());
            ps.setObject(14, hd.getTinhTrang());
            check = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean delete(String maDV) {
        String query = "DELETE FROM [dbo].[HoaDon]\n"
                + "      WHERE MaHD =?";
        int check = 0;
        try (Connection con = SQLserverconnection.getConnection();
                PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, maDV);
            check = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean update(hoadon hd, String MaHD) {
        String query = "UPDATE [dbo].[HoaDon]\n"
                + "   SET [MaHD] =?\n"
                + "      ,[MaNV] =?\n"
                + "      ,[MaKH] =?\n"
                + "      ,[MaDT] =?\n"
                + "      ,[MaBH] =?\n"
                + "      ,[MaCH] =?\n"
                + "      ,[GiaTien] =?\n"
                + "      ,[TongTien] =?\n"
                + "      ,[TienKhachTra] =?\n"
                + "      ,[TienThua] =?\n"
                + "      ,[TenNguoiMua] = ?\n"
                + "      ,[DiaChi] = ?\n"
                + "      ,[Sdt] =?\n"
                + "      ,[TinhTrang] =?\n"
                + " WHERE MaHD = ?";
        int check = 0;
        try (Connection con = SQLserverconnection.getConnection();
                PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, hd.getMaHD());
            ps.setObject(2, hd.getMaNV());
            ps.setObject(3, hd.getMaKH());
            ps.setObject(4, hd.getMaDT());
            ps.setObject(5, hd.getMaBH());
            ps.setObject(6, hd.getMaCH());
            ps.setObject(7, hd.getGiaTien());
            ps.setObject(8, hd.getTongTien());
            ps.setObject(9, hd.getTienKhachTra());
            ps.setObject(10, hd.getTienthua());
            ps.setObject(11, hd.getTenNguoiMua());
            ps.setObject(12, hd.getDiaChi());
            ps.setObject(13, hd.getSDT());
            ps.setObject(14, hd.getTinhTrang());
            check = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public static void main(String[] args) {
//        List<DongVat> lists = new DongVatrepostory().getall();
//        for (DongVat dv : lists) {
//            System.out.println(dv.toString());
//       }
        hoadon hd = new hoadon("01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14");
        boolean add = new hoadonrepostory().add(hd);

        System.out.println(add);
    }
}
