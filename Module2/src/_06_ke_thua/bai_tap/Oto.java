package bai_tap;

public class Oto extends Xe {
    private String hangXe;
    private int tocDo;

    public Oto() {
    }

    public Oto(int soChoNgoi, int trongLuong, String mauXe, String hangXe) {
        super(soChoNgoi, trongLuong, mauXe);
        this.hangXe = hangXe;
    }

    public Oto(int soChoNgoi, int trongLuong, String mauXe, String hangXe, int tocDo) {
        super(soChoNgoi, trongLuong, mauXe);
        this.hangXe = hangXe;
        this.tocDo = tocDo;
    }

    public String getHangXe() {
        return hangXe;
    }

    public void setHangXe(String hangXe) {
        this.hangXe = hangXe;
    }

    public int getTocDo() {
        return tocDo;
    }

    public void setTocDo(int tocDo) {
        this.tocDo = tocDo;
    }

    @Override
    public String toString() {
        return "Oto{" +
                "soChoNgoi=" + this.getSoChoNgoi() +
                ", trongLuong=" + this.getTrongLuong() +
                ", mauXe='" + this.getMauXe()  +
                "hangXe='" + hangXe + '\'' +
                ", tocDo=" + tocDo +
                '}'+ "\n" ;
    }
}
