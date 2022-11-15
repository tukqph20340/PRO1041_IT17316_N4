/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package SeviceITF;

import DomainModel.KhachHang;
import ViewModel.KhachHangView;
import java.util.List;

/**
 *
 * @author fptshop
 */
public interface KhachHangItf {
   public List<KhachHangView> select();
   public List<KhachHang> select1(String MaKh);
   public List<KhachHang> fina();
   public List<KhachHang> insert(String MaKH, String HoVaTen, String DiaChi, String Sdt, String NgaySinh, String ThanhPho);
   public List<KhachHang> update(String MaKH, String HoVaTen, String DiaChi, String Sdt, String NgaySinh, String ThanhPho);
   public List<KhachHang> delete(String MaKh);
   
}
