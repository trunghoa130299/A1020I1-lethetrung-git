package model.bean;

public class UserService {
    private int idkhachhang;
    private String hoten;
    private int idhopdong;
    private  int idhopdongchitiet;
    private String tendichvudikem;

    public UserService(int idkhachhang, String hoten, int idhopdong, int idhopdongchitiet, String tendichvudikem) {
        this.idkhachhang = idkhachhang;
        this.hoten = hoten;
        this.idhopdong = idhopdong;
        this.idhopdongchitiet = idhopdongchitiet;
        this.tendichvudikem = tendichvudikem;
    }

    public UserService() {
    }

    public int getIdkhachhang() {
        return idkhachhang;
    }

    public void setIdkhachhang(int idkhachhang) {
        this.idkhachhang = idkhachhang;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getIdhopdong() {
        return idhopdong;
    }

    public void setIdhopdong(int idhopdong) {
        this.idhopdong = idhopdong;
    }

    public int getIdhopdongchitiet() {
        return idhopdongchitiet;
    }

    public void setIdhopdongchitiet(int idhopdongchitiet) {
        this.idhopdongchitiet = idhopdongchitiet;
    }

    public String getTendichvudikem() {
        return tendichvudikem;
    }

    public void setTendichvudikem(String tendichvudikem) {
        this.tendichvudikem = tendichvudikem;
    }
}
