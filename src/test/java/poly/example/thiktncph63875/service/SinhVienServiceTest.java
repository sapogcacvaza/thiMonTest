package poly.example.thiktncph63875.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import poly.example.thiktncph63875.entity.SinhVien;

import static org.junit.jupiter.api.Assertions.*;

class SinhVienServiceTest {
    SinhVienService sinhVienService;

    @BeforeEach
    public void setUpBeforeAll() {
        sinhVienService = new SinhVienService();
        System.out.println("Set up before all is done!");
    }

    @Test
    @DisplayName("Test add sinh vien with valid param!")
    public void addSinhVienWithValid() {
        SinhVien sinhVien = new SinhVien("1", "Nguyễn", 23, 9.8F, 5, "UPDM");
        sinhVienService.addSinhVien(sinhVien);

        Assertions.assertEquals("1", sinhVienService.getById("1").getMaSV());
    }

    @Test
    @DisplayName("Test update sinh vien with valid param!")
    public void updateSinhVienValid() {
        SinhVien sinhVien =
                new SinhVien("1", "Nguyễn", 23, 9.8F, 5, "UPDM");
        sinhVienService.addSinhVien(sinhVien);

        SinhVien sinhVienMoi =
                new SinhVien("1", "Nguyễn A", 20, 9.8F, 5, "UPDM");
        sinhVienService.updateSinhVien(sinhVienMoi);

        Assertions.assertEquals("Nguyễn A", sinhVienService.getById("1").getTen());
        Assertions.assertEquals(20, sinhVienService.getById("1").getTuoi());
    }

    @Test
    @DisplayName("Test add sinh vien with maSV is null!")
    public void addSinhVienWithMaSVNull() {
        IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class,
                        () -> sinhVienService.addSinhVien(
                                new SinhVien("", "Nguyễn A", 20, 9.8F, 5, "UPDM")));

        Assertions.assertEquals("Mã sinh viên không được để trống!", exception.getMessage());
    }

    @Test
    @DisplayName("Test add sinh vien with chuyen nganh is null!")
    public void addSinhVienWithChuyenNganhIsNull() {
        IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class,
                        () -> sinhVienService.addSinhVien(
                                new SinhVien("1", "Nguyễn A", 20, 9.8F, 5, "")));

        Assertions.assertEquals("Chuyên ngành không được để trống!", exception.getMessage());
    }
}