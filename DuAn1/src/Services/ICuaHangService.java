/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import DomainModels.CuaHang;
import ViewModels.CuaHangViewModel;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public interface ICuaHangService {

    ArrayList<CuaHangViewModel> getList();

    Boolean them(CuaHang ch);

    Boolean sua(CuaHang ch, String maCH);

    Boolean xoa(String maCH);
    
    ArrayList<String> getListMaCH();
}
