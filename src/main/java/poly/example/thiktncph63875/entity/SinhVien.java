package poly.example.thiktncph63875.entity;

public class SinhVien {
    private String maSV;
    private String ten;
    private int tuoi;
    private float diemTrungBinh;
    private int kyHoc;
    private String chuyenNganh;

    public SinhVien() {
    }

    public SinhVien(String maSV, String ten, int tuoi, float diemTrungBinh, int kyHoc, String chuyenNganh) {
        setMaSV(maSV);
        setTen(ten);
        setTuoi(tuoi);
        setDiemTrungBinh(diemTrungBinh);
        setKyHoc(kyHoc);
        setChuyenNganh(chuyenNganh);
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        if(maSV == null || maSV.isEmpty()) {
            throw new IllegalArgumentException("Mã sinh viên không được để trống!");
        }
        this.maSV = maSV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        if(ten == null || ten.isEmpty()) {
            throw new IllegalArgumentException("Tên sinh viên không được để trống!");
        }
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        if(tuoi == 0 || tuoi < 0) {
            throw new IllegalArgumentException("Tuôi sinh viên phải lớn 0!");
        }

        this.tuoi = tuoi;
    }

    public float getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(float diemTrungBinh) {
        if(diemTrungBinh < 0 || diemTrungBinh > 10) {
            throw new IllegalArgumentException("Điểm phải lớn 0 và bé hơn 10!");
        }
        this.diemTrungBinh = diemTrungBinh;
    }

    public int getKyHoc() {
        return kyHoc;
    }

    public void setKyHoc(int kyHoc) {
        if(kyHoc < 1 || kyHoc > 8) {
            throw new IllegalArgumentException("Kỳ học sinh viên phải lớn 1 và bé hơn 8!");
        }

        this.kyHoc = kyHoc;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        if(chuyenNganh == null || chuyenNganh.isEmpty()) {
            throw new IllegalArgumentException("Chuyên ngành không được để trống!");
        }

        this.chuyenNganh = chuyenNganh;
    }
}
