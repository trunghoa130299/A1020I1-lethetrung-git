package model.bean;

public class Contract {
    private int idhopdong;
    private String ngaylamhopdong;
    private String ngayketthuc;
    private int tiendatcoc;
    private int tongtien;
    private int idnhanvien_hd;
    private int idkhachhang_hd;
    private int iddichvu_hd;

    public Contract() {
    }

    public Contract(int idhopdong, String ngaylamhopdong,
                    String ngayketthuc, int tiendatcoc, int tongtien, int idnhanvien_hd, int idkhachhang_hd, int iddichvu_hd) {
        this.idhopdong = idhopdong;
        this.ngaylamhopdong = ngaylamhopdong;
        this.ngayketthuc = ngayketthuc;
        this.tiendatcoc = tiendatcoc;
        this.tongtien = tongtien;
        this.idnhanvien_hd = idnhanvien_hd;
        this.idkhachhang_hd = idkhachhang_hd;
        this.iddichvu_hd = iddichvu_hd;
    }

    public int getIdhopdong() {
        return idhopdong;
    }

    public void setIdhopdong(int idhopdong) {
        this.idhopdong = idhopdong;
    }

    public String getNgaylamhopdong() {
        return ngaylamhopdong;
    }

    public void setNgaylamhopdong(String ngaylamhopdong) {
        this.ngaylamhopdong = ngaylamhopdong;
    }

    public String getNgayketthuc() {
        return ngayketthuc;
    }

    public void setNgayketthuc(String ngayketthuc) {
        this.ngayketthuc = ngayketthuc;
    }

    public int getTiendatcoc() {
        return tiendatcoc;
    }

    public void setTiendatcoc(int tiendatcoc) {
        this.tiendatcoc = tiendatcoc;
    }

    public int getTongtien() {
        return tongtien;
    }

    public void setTongtien(int tongtien) {
        this.tongtien = tongtien;
    }

    public int getIdnhanvien_hd() {
        return idnhanvien_hd;
    }

    public void setIdnhanvien_hd(int idnhanvien_hd) {
        this.idnhanvien_hd = idnhanvien_hd;
    }

    public int getIdkhachhang_hd() {
        return idkhachhang_hd;
    }

    public void setIdkhachhang_hd(int idkhachhang_hd) {
        this.idkhachhang_hd = idkhachhang_hd;
    }

    public int getIddichvu_hd() {
        return iddichvu_hd;
    }

    public void setIddichvu_hd(int iddichvu_hd) {
        this.iddichvu_hd = iddichvu_hd;
    }
}
