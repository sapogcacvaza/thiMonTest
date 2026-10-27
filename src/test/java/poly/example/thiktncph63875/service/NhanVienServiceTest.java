package poly.example.thiktncph63875.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import poly.example.thiktncph63875.entity.NhanVien;

import static org.junit.jupiter.api.Assertions.*;

class NhanVienServiceTest {
    NhanVienService nhanVienService;

    @BeforeEach
    public void setUpBeforeEach() {
        nhanVienService = new NhanVienService();
    }

    @Test
    @DisplayName("Test update nhân viên cùng tham số đúng.")
    public void updateNhanVienWithValid() {
        NhanVien nhanVien = new NhanVien("1", "Nguyễn", 25, 1200000f, 5);
        nhanVienService.addNhanVien(nhanVien);

        NhanVien nhanVienMoi = new NhanVien("1", "Nguyễn Văn A", 25, 1200000f, 5);
        nhanVienService.updateNhanVien(nhanVienMoi);

        assertEquals("Nguyễn Văn A", nhanVienService.getById("1").getTen());
    }

    @Test
    @DisplayName("Test thêm nhân viên với đối tượng null.")
    public void addNhanVienWithNhanVienEqualsNull() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> {nhanVienService.addNhanVien(null);
        });
        assertEquals("Nhân viên không được để trống!", exception.getMessage());
    }

    @Test
    @DisplayName("Test update nhân viên với đối tượng null.")
    public void updateNhanVienWithNhanVienEqualsNull() {
        NhanVien nhanVien = new NhanVien("1", "Nguyễn", 25, 1200000f, 5);
        nhanVienService.addNhanVien(nhanVien);

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> {nhanVienService.updateNhanVien(null);
                });
        assertEquals("Nhân viên không được để trống!", exception.getMessage());
    }

    @Test
    @DisplayName("Test thêm nhân viên với mã là null.")
    public void addNhanVienWithMaNVEqualsNull() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> {nhanVienService.addNhanVien(
                        new NhanVien("", "Nguyễn", 25, 1200000f, 5));
                });
        assertEquals("Mã nhân viên không được để trống!", exception.getMessage());
    }

    @Test
    @DisplayName("Test thêm nhân viên tuoi bé hơn 0 là null.")
    public void addNhanVienWithTuoiLessThanZero() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> {nhanVienService.addNhanVien(
                        new NhanVien("1", "Nguyễn", -1, 1200000f, 5));
                });
        assertEquals("Tuổi nhân viên không được bé hơn 0!", exception.getMessage());
    }

    @Test
    @DisplayName("Test thêm nhân viên lương bé hơn 0 là null.")
    public void addNhanVienWithLuongLessThanZero() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> {nhanVienService.addNhanVien(
                        new NhanVien("1", "Nguyễn", 25, -0.1f, 5));
                });
        assertEquals("Lương nhân viên không được bé hơn 0!", exception.getMessage());
    }

    @Test
    @DisplayName("Test thêm nhân viên số năm làm việc bé hơn 0 là null.")
    public void addNhanVienWithSoNamLamViecLessThanZero() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> {nhanVienService.addNhanVien(
                        new NhanVien("1", "Nguyễn", 25, 12000000f, -1));
                });
        assertEquals("Số năm làm việc nhân viên không được bé hơn 0!", exception.getMessage());
    }
}