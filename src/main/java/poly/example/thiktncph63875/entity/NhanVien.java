package poly.example.thiktncph63875.entity;

public class NhanVien {
    private String maNV;
    private String ten;
    private int tuoi;
    private float luong;
    private int soNamLamViec;

    public NhanVien() {
    }

    public NhanVien(String maNV, String ten, int tuoi, float luong, int soNamLamViec) {
        setMaNV(maNV);
        setTen(ten);
        setTuoi(tuoi);
        setLuong(luong);
        setSoNamLamViec(soNamLamViec);
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        if(maNV == null || maNV.isEmpty()) {
            throw new IllegalArgumentException("Mã nhân viên không được để trống!");
        }
        this.maNV = maNV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        if(ten == null || ten.isEmpty()) {
            throw new IllegalArgumentException("Mã nhân viên không được để trống!");
        }
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {

        if(tuoi <= 0) {
            throw new IllegalArgumentException("Tuổi nhân viên không được bé hơn 0!");
        }
        this.tuoi = tuoi;
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        if(luong <= 0) {
            throw new IllegalArgumentException("Lương nhân viên không được bé hơn 0!");
        }

        this.luong = luong;
    }

    public int getSoNamLamViec() {
        return soNamLamViec;
    }

    public void setSoNamLamViec(int soNamLamViec) {

        if(soNamLamViec <= 0) {
            throw new IllegalArgumentException("Số năm làm việc nhân viên không được bé hơn 0!");
        }

        this.soNamLamViec = soNamLamViec;
    }
}
