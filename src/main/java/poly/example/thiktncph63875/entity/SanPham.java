package poly.example.thiktncph63875.entity;

public class SanPham {
    private String maSP;
    private String tenSP;
    private int soLuong;
    private double donGia;
    private String loaiSP;

    public SanPham() {
    }

    public SanPham(String maSP, String tenSP, int soLuong, double donGia, String loaiSP) {
        setMaSP(maSP);
        setTenSP(tenSP);
        setSoLuong(soLuong);
        setDonGia(donGia);
        setLoaiSP(loaiSP);
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        if(maSP == null || maSP.isEmpty()) {
            throw new IllegalArgumentException("Mã sản pham không được để trống!");
        }
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        if(tenSP == null || tenSP.isEmpty()) {
            throw new IllegalArgumentException("Tên sản pham không được để trống!");
        }
        this.tenSP = tenSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        if(soLuong < 0) {
            throw new IllegalArgumentException("Số lượng không được bé hơn 0!");
        }
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        if(donGia < 0) {
            throw new IllegalArgumentException("Đơn giá không được bé hơn 0!");
        }
        this.donGia = donGia;
    }

    public String getLoaiSP() {
        return loaiSP;
    }

    public void setLoaiSP(String loaiSP) {
        if(loaiSP == null || loaiSP.isEmpty()) {
            throw new IllegalArgumentException("Loại sản pham không được để trống!");
        }
        this.loaiSP = loaiSP;
    }
}
