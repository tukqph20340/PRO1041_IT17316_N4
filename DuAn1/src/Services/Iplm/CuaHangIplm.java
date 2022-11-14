/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.Iplm;

import DomainModels.CuaHang;
import Repository.CuaHangRepository;
import Services.ICuaHangService;
import ViewModels.CuaHangViewModel;
import com.sun.corba.se.spi.activation.Repository;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class CuaHangIplm implements ICuaHangService {

    private CuaHangRepository repo = new CuaHangRepository();

    public CuaHangIplm() {

    }

    @Override
    public ArrayList<CuaHangViewModel> getList() {
        ArrayList<CuaHangViewModel> listCHVM = new ArrayList<>();
        ArrayList<CuaHang> listCH = repo.getlistCuaHang();
        for (CuaHang x : listCH) {
            CuaHangViewModel y = new CuaHangViewModel();
            y.setMaCH(x.getMaCH());
            y.setTen(x.getTen());
            y.setDiaChi(x.getDiaChi());
            y.setThanhPho(x.getThanhPho());
            y.setQuocGia(x.getQuocGia());
            listCHVM.add(y);
        }
        return listCHVM;
    }

    @Override
    public Boolean them(CuaHang ch) {       
        return repo.them(ch);
    }

    @Override
    public Boolean sua(CuaHang ch, String maCH) {
        return repo.sua(ch, maCH);
    }

    @Override
    public Boolean xoa(String maCH) {
        return repo.xoa(maCH);
    }

    @Override
    public ArrayList<String> getListMaCH() {
        return repo.getlistMaCH();
    }

}
