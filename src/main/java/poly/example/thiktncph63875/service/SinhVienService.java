package poly.example.thiktncph63875.service;

import poly.example.thiktncph63875.entity.SinhVien;

import java.util.ArrayList;
import java.util.List;

public class SinhVienService {
    List<SinhVien> listSinhVien = new ArrayList<>();

    public void addSinhVien (SinhVien sinhVien) {
        if(sinhVien == null) {
            throw new IllegalArgumentException("Sinh viên không được null!");
        }
        listSinhVien.add(sinhVien);
    }


    public void updateSinhVien (SinhVien sinhVien) {
        if(sinhVien == null) {
            throw new IllegalArgumentException("Sinh viên không được null!");
        }

        for(int i = 0; i < listSinhVien.size(); i++) {
            if(listSinhVien.get(i).getMaSV().equals(sinhVien.getMaSV())) {
                listSinhVien.set(i, sinhVien);
                return;
            }
        }
    }

    public SinhVien getById (String maSV) {
        for(int i = 0; i < listSinhVien.size(); i++) {
            if(listSinhVien.get(i).getMaSV().equals(maSV)) {
                return listSinhVien.get(i);
            }
        }
        return null;
    }
}
