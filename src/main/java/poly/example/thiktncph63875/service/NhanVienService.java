package poly.example.thiktncph63875.service;

import poly.example.thiktncph63875.entity.NhanVien;

import java.util.ArrayList;
import java.util.List;

public class NhanVienService {
    List<NhanVien> listNhanVien = new ArrayList<>();

    public void addNhanVien(NhanVien nhanVien) {
        if(nhanVien == null) {
            throw new IllegalArgumentException("Nhân viên không được để trống!");
        }

        listNhanVien.add(nhanVien);
    }

    public NhanVien getById(String maNV) {
        if(maNV == null || maNV.isEmpty()) {
            throw new IllegalArgumentException("Mã nhân viên không được để trống!");
        }

        for(int i = 0; i < listNhanVien.size(); i++) {
            if(listNhanVien.get(i).getMaNV().equals(maNV)) {
                return listNhanVien.get(i);
            }
        }

        return null;
    }

    public void updateNhanVien(NhanVien nhanVien) {
        if(nhanVien == null) {
            throw new IllegalArgumentException("Nhân viên không được để trống!");
        }

        for(int i = 0; i < listNhanVien.size(); i++) {
            if(listNhanVien.get(i).getMaNV().equals(nhanVien.getMaNV())) {
                listNhanVien.set(i, nhanVien);
                return;
            }
        }
    }
}
