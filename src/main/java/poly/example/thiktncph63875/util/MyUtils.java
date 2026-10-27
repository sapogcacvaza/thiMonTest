package poly.example.thiktncph63875.util;

public class MyUtils {
    public int tinhTongSoKyTuCuaMangChuoi(String [] arr) {
        int tong = 0;
        for(int i = 0; i < arr.length; i++) {
            tong += arr[i].length();
        }
        return tong;
    }

    public int tinhTichCuaHaiSoNguyen(int a, int b) {
        return a - b;
    }
}
