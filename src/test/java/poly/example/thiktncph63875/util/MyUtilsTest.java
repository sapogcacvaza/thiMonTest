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
    @DisplayName("Tính tổng các số chia hết cho 3 từ 1 đến n")
    void tinhTongCacSoChiaHetChoBa() {
        assertEquals(18, myUtils.tinhTongCacSoChiaHetChoBa(10));
    }
}