package poly.example.thiktncph63875.util;

public class MyUtils {


    public int tinhTongMangSoNguyen(int [] arrays) {
        int tong = 0;
        for(int i = 0; i < arrays.length; i++) {
            tong += arrays[i];
        }
        return tong;
    }
}
