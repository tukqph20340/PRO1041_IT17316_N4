/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sevice;

import DomainModel.KhachHang;
import Repository.KhachHangRepository;
import SeviceITF.KhachHangItf;
import ViewModel.KhachHangView;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author fptshop
 */
public class KhachHangSevice implements KhachHangItf {

    private KhachHangRepository khlist = new KhachHangRepository();

    public List<KhachHangView> select() {
        try {
            List<KhachHang> kh = khlist.select();
            List<KhachHangView> list = new ArrayList<>();
            for (KhachHang khachHang : kh) {
                KhachHangView k1 = new KhachHangView(
                        khachHang.getMaKH(),
                        khachHang.getHoVaTen(),
                        khachHang.getDiaChi(),
                        khachHang.getSdt(),
                        khachHang.getNgaySinh(),
                        khachHang.getThanhPho()
                );
                list.add(k1);
            }
            return list;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "lỗi sevice");
            return null;
        }

    }

    @Override
    public List<KhachHang> select1(String MaKh) {
        try {
            JOptionPane.showMessageDialog(null, "Đã hiện thông tin cần tìm");
            return khlist.select1(MaKh);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<KhachHang> fina() {
        try {
            return khlist.select();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<KhachHang> delete(String MaKh) {
        try {
            JOptionPane.showMessageDialog(null, "Xóa thành công");
            return khlist.delete(MaKh);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<KhachHang> insert(String MaKH, String HoVaTen, String DiaChi, String Sdt, String NgaySinh, String ThanhPho) {
        try {
            JOptionPane.showMessageDialog(null, "Thêm thành công");
            return khlist.insert(MaKH, HoVaTen, DiaChi, Sdt, NgaySinh, ThanhPho);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<KhachHang> update(String MaKH, String HoVaTen, String DiaChi, String Sdt, String NgaySinh, String ThanhPho) {
        try {
            JOptionPane.showMessageDialog(null, "Sửa thành công");
            return khlist.update(MaKH, HoVaTen, DiaChi, Sdt, NgaySinh, ThanhPho);
        } catch (Exception e) {
            return null;
        }
    }

}
