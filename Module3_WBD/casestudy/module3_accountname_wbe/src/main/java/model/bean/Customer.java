package model.bean;

public class Customer {
    private int idKhachHang;
    private String hoten;
    private String ngaySinh;
    private String cmnd;
    private String sdt;
    private String email;
    private String diaChi;
    private  int  idLoaiKhach_kh;

    public Customer() {
    }

    public Customer(int idKhachHang, String hoten, String ngaySinh, String cmnd, String sdt,
                    String email, String diaChi, int idLoaiKhach_kh) {
        this.idKhachHang = idKhachHang;
        this.hoten = hoten;
        this.ngaySinh = ngaySinh;
        this.cmnd = cmnd;
        this.sdt = sdt;
        this.email = email;
        this.diaChi = diaChi;
        this.idLoaiKhach_kh = idLoaiKhach_kh;
    }

    public Customer(int idKhachHang, String hoten, String ngaySinh, String cmnd, String sdt, String email, String diaChi) {
        this.idKhachHang = idKhachHang;
        this.hoten = hoten;
        this.ngaySinh = ngaySinh;
        this.cmnd = cmnd;
        this.sdt = sdt;
        this.email = email;
        this.diaChi = diaChi;
    }

    public int getIdKhachHang(int idKhachhang) {
        return idKhachHang;
    }

    public void setIdKhachHang(int idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getIdLoaiKhach_kh() {
        return idLoaiKhach_kh;
    }

    public void setIdLoaiKhach_kh(int idLoaiKhach_kh) {
        this.idLoaiKhach_kh = idLoaiKhach_kh;
    }
}
