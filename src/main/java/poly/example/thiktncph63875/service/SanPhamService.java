package poly.example.thiktncph63875.service;

import poly.example.thiktncph63875.entity.SanPham;

import java.util.ArrayList;
import java.util.List;

public class SanPhamService {
    List<SanPham> listSanPham = new ArrayList<>();

    public List<SanPham> findAll() {
        return listSanPham;
    }

    public SanPham findById(String maSP) {

        if(maSP == null || maSP.isEmpty()) {
            throw new IllegalArgumentException("Mã sản pham không được để trống!");
        }

        for(int i = 0; i < listSanPham.size(); i++) {
            if(listSanPham.get(i).getMaSP().equals(maSP)) {
                return listSanPham.get(i);
            }
        }
        return null;
    }

    public void addSanPham(SanPham sanPham) {

        if(sanPham == null) {
            throw new IllegalArgumentException("San phẩm ko được để trống!");
        }

        listSanPham.add(sanPham);
    }

    public void updateSanPham(SanPham sanPham) {

        if(sanPham == null) {
            throw new IllegalArgumentException("San phẩm ko được để trống!");
        }

        for(int i = 0; i < listSanPham.size(); i++) {
            if(listSanPham.get(i).getMaSP().equals(sanPham.getMaSP())) {
                listSanPham.set(i, sanPham);
                return;
            }
        }
    }

    public void deleteSanPham(String maSP) {

        if(maSP == null || maSP.isEmpty()) {
            throw new IllegalArgumentException("Mã sản pham không được để trống!");
        }

        for(int i = 0; i < listSanPham.size(); i++) {
            if(listSanPham.get(i).getMaSP().equals(maSP)) {
                listSanPham.remove(i);
                return;
            }
        }
    }
}
