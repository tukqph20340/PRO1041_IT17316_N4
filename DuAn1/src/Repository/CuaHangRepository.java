/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import DomainModels.CuaHang;
import Utilities.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class CuaHangRepository {

    private DBConnection db;

    public ArrayList<CuaHang> getlistCuaHang() {
        ArrayList<CuaHang> list = new ArrayList<>();
        String sql = "select * from CuaHang";
        try (Connection con = db.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                CuaHang x = new CuaHang();
                x.setMaCH(rs.getString(1));
                x.setTen(rs.getString(2));
                x.setDiaChi(rs.getString(3));
                x.setThanhPho(rs.getString(4));
                x.setQuocGia(rs.getString(5));

                list.add(x);
            }
        } catch (Exception e) {
            e.printStackTrace();
            e.getMessage();
        }
        return list;
    }
    
    public ArrayList<String> getlistMaCH() {
        ArrayList<String> list = new ArrayList<>();
        String sql = "select MaCH from CuaHang";
        try (Connection con = db.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String x=rs.getString(1);                
                list.add(x);
            }
        } catch (Exception e) {
            e.printStackTrace();
            e.getMessage();
        }
        return list;
    }

    public Boolean them(CuaHang x) {
        String sql = "insert into CuaHang (MaCH,Ten,DiaChi,ThanhPho,QuocGia)values (?,?,?,?,?)";
        try (Connection con = db.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, x.getMaCH());
            ps.setObject(2, x.getTen());
            ps.setObject(3, x.getDiaChi());
            ps.setObject(4, x.getThanhPho());
            ps.setObject(5, x.getQuocGia());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public Boolean sua(CuaHang x, String maCH) {
        String sql = "update CuaHang set Ten=?, DiaChi=?, ThanhPho=?, QuocGia=? where MaCH=?";
        try (Connection con = db.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {         
            ps.setObject(1, x.getTen());
            ps.setObject(2, x.getDiaChi());
            ps.setObject(3, x.getThanhPho());
            ps.setObject(4, x.getQuocGia());
            ps.setObject(5, maCH);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public Boolean xoa(String maCH) {
        String sql = "delete CuaHang where MaCH=?";
        try (Connection con = db.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, maCH);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
