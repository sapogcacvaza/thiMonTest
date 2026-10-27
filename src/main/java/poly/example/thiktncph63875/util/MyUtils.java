package poly.example.thiktncph63875.util;

public class MyUtils {
    public int tinhTongCacSoChiaHetChoBa(int n) {
        int tong = 0;
        for (int i = 1; i <= n; i++) {
            if(i%3 == 0) {
                tong += i;
            }
        }

        return tong;
    }
}
