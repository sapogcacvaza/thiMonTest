package poly.example.thiktncph63875.util;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyUtilsTest {
    MyUtils myUtils;
    int [] arr;

    @BeforeEach
    public void setUpBeforeAll() {
        myUtils = new MyUtils();
        System.out.println("Set up before all is done!");
        arr = new int[] {1,2,3,4,5};
    }

    @Test
    @DisplayName("Tính tổng các phần tử mảng số nguyen!")
    void tinhTongMangSoNguyen() {
        assertEquals(15, myUtils.tinhTongMangSoNguyen(arr));
    }
}