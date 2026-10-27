package poly.example.thiktncph63875.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import poly.example.thiktncph63875.entity.SanPham;

import static org.junit.jupiter.api.Assertions.*;

class SanPhamServiceTest {
    SanPhamService sanPhamService;

    @BeforeEach
    public void setUpBeforeEach() {
        sanPhamService = new SanPhamService();
    }

    @Test
    @DisplayName("Test valid với các tham số đúng")
    public void addSanPhamWithValid() {
        sanPhamService.addSanPham(
                new SanPham("1", "Búp bê", 100, 15, "Đồ chơi"));

        assertEquals("1", sanPhamService.findById("1").getMaSP());
    }

    @Test
    @DisplayName("Test update với các tham số đúng")
    public void updateSanPhamWithValid() {
        sanPhamService.addSanPham(
                new SanPham("1", "Búp bê", 100, 15, "Đồ chơi"));

        sanPhamService.updateSanPham(
                new SanPham("1", "Búp bê cùng gia đình", 100, 15, "Đồ chơi"));

        assertEquals("Búp bê cùng gia đình", sanPhamService.findById("1").getTenSP());
    }

    @Test
    @DisplayName("Test delete với các tham số đúng")
    public void deleteSanPhamWithValid() {
        sanPhamService.addSanPham(
                new SanPham("1", "Búp bê", 100, 15, "Đồ chơi"));

        sanPhamService.deleteSanPham("1");

        assertEquals(null, sanPhamService.findById("1"));
    }

    @Test
    @DisplayName("Test add với mã sp trông.")
    public void addSanPhamWithMaSPIsNull() {
        IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class,
                        () -> {sanPhamService.addSanPham(
                                new SanPham("", "Búp bê", 100, 15, "Đồ chơi"));
                });
        Assertions.assertEquals("Mã sản pham không được để trống!", exception.getMessage());
    }

    @Test
    @DisplayName("Test add với số lượng bé hơn 0.")
    public void addSanPhamWithSoLuongLessThanZero() {
        IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class,
                        () -> {sanPhamService.addSanPham(
                                new SanPham("1", "Búp bê", -1, 15, "Đồ chơi"));
                        });
        Assertions.assertEquals("Số lượng không được bé hơn 0!", exception.getMessage());
    }

    @Test
    @DisplayName("Test update với số lượng bé hơn 0.")
    public void updateSanPhamWithSoLuongLessThanZero() {
        sanPhamService.addSanPham(new SanPham("1", "Búp bê", 100, 15, "Đồ chơi"));

        IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class,
                        () -> {sanPhamService.updateSanPham(
                                new SanPham("1", "Búp bê", -1, 15, "Đồ chơi"));
                });

        Assertions.assertEquals("Số lượng không được bé hơn 0!", exception.getMessage());
    }
}