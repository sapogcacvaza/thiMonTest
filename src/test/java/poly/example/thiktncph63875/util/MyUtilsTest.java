package poly.example.thiktncph63875.util;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyUtilsTest {
    MyUtils myUtils;

    @BeforeEach
    public void setUpBeforeEach() {
        myUtils = new MyUtils();
    }

    @Test
    @DisplayName("Tinh tong so ky tu cua mang chuoi ")
    void tinhTongSoKyTuCuaMangChuoi() {
        String arr[] = new String[] {"Long", "Nam", "Cường"};
        assertEquals(12, myUtils.tinhTongSoKyTuCuaMangChuoi(arr));
    }

    @Test
    @DisplayName("Tinh tong so ky tu cua mang chuoi ")
    void tinhTichCuaHaiSoNguyen() {
        assertEquals(9, myUtils.tinhTichCuaHaiSoNguyen(2, -7));
    }
}