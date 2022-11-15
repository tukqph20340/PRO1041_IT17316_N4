/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.hoadon;
/**
 *
 * @author Admin
 */
public interface hoadonservice {
      List<hoadon> getall();

    hoadon getone(String maDV);

    String add(hoadon hd);

    String update(hoadon hd, String MaHD);

    String delete(String MaHD);
}
