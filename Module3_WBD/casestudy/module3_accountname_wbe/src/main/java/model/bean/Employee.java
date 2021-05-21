package model.bean;

public class Employee {
    private int idNhanVien;
    private String hoTen;
    private String ngaySinh;
    private String cmnd;
    private String luong;
    private String sdt;
    private String email;
    private int idVitri_nv;
    private int idTrinhDo_nv;
    private int idBoPhan_nv;
    public Employee() {
    }

    public Employee(int idNhanVien, String hoTen, String ngaySinh, String cmnd, String luong, String sdt,
                    String email, int idVitri_nv, int idTrinhDo_nv, int idBoPhan_nv) {
        this.idNhanVien = idNhanVien;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.cmnd = cmnd;
        this.luong = luong;
        this.sdt = sdt;
        this.email = email;
        this.idVitri_nv = idVitri_nv;
        this.idTrinhDo_nv = idTrinhDo_nv;
        this.idBoPhan_nv = idBoPhan_nv;
    }

    public Employee(int idNhanVien, String hoTen, String ngaySinh, String cmnd, String luong, String sdt, String email) {
        this.idNhanVien = idNhanVien;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.cmnd = cmnd;
        this.luong = luong;
        this.sdt = sdt;
        this.email = email;
    }

    public int getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(int idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
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

    public String getLuong() {
        return luong;
    }

    public void setLuong(String luong) {
        this.luong = luong;
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

    public int getIdVitri_nv() {
        return idVitri_nv;
    }

    public void setIdVitri_nv(int idVitri_nv) {
        this.idVitri_nv = idVitri_nv;
    }

    public int getIdTrinhDo_nv() {
        return idTrinhDo_nv;
    }

    public void setIdTrinhDo_nv(int idTrinhDo_nv) {
        this.idTrinhDo_nv = idTrinhDo_nv;
    }

    public int getIdBoPhan_nv() {
        return idBoPhan_nv;
    }

    public void setIdBoPhan_nv(int idBoPhan_nv) {
        this.idBoPhan_nv = idBoPhan_nv;
    }
}
