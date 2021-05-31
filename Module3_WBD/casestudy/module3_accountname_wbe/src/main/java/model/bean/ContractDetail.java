package model.bean;

public class ContractDetail {
    private int idhopdongchitiet;
    private int soluong;
    private int iddichvudikem_hdct;
    private  int idhopdong_hdct;

    public ContractDetail(int idhopdongchitiet, int soluong, int iddichvudikem_hdct, int idhopdong_hdct) {
        this.idhopdongchitiet = idhopdongchitiet;
        this.soluong = soluong;
        this.iddichvudikem_hdct = iddichvudikem_hdct;
        this.idhopdong_hdct = idhopdong_hdct;
    }

    public ContractDetail(int soluong, int iddichvudikem_hdct, int idhopdong_hdct) {
        this.soluong = soluong;
        this.iddichvudikem_hdct = iddichvudikem_hdct;
        this.idhopdong_hdct = idhopdong_hdct;
    }

    public int getIdhopdongchitiet() {
        return idhopdongchitiet;
    }

    public void setIdhopdongchitiet(int idhopdongchitiet) {
        this.idhopdongchitiet = idhopdongchitiet;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public int getIddichvudikem_hdct() {
        return iddichvudikem_hdct;
    }

    public void setIddichvudikem_hdct(int iddichvudikem_hdct) {
        this.iddichvudikem_hdct = iddichvudikem_hdct;
    }

    public int getIdhopdong_hdct() {
        return idhopdong_hdct;
    }

    public void setIdhopdong_hdct(int idhopdong_hdct) {
        this.idhopdong_hdct = idhopdong_hdct;
    }
}
