/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package impl;

import model.hoadon;
import java.util.List;
import repostory.hoadonrepostory;
import service.hoadonservice;

/**
 *
 * @author Admin
 */
public class hoadonserviceimpl implements hoadonservice{

    private hoadonrepostory hoadonrepostory = new hoadonrepostory();

    @Override
    public List<hoadon> getall() {
        return hoadonrepostory.getall();
    }

    @Override
    public hoadon getone(String maDV) {
        return hoadonrepostory.getone(maDV);
    }

    @Override
    public String add(hoadon hd) {
        if (hd.getMaHD().isEmpty()) {
            return "Ma HD trong";
        }
        if (hd.getMaKH().isEmpty()) {
            return "ten HD trong";
        }
        boolean aadhoadon = hoadonrepostory.add(hd);
        if (aadhoadon) {
            return "add thanh cong";
        } else {
            return "add khong thanh cong";
        }
    }

    @Override
    public String update(hoadon hd, String MaHD) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String delete(String MaHD) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
