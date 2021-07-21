package bai_tap;

public class XeMay extends Xe {
    private int gia;

    public XeMay() {
    }

    public XeMay(int soChoNgoi, int trongLuong, String mauXe, int gia) {
        super(soChoNgoi, trongLuong, mauXe);
        this.gia = gia;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "XeMay{" +
                "soChoNgoi=" + this.getSoChoNgoi() +
                ", trongLuong=" + this.getTrongLuong() +
                ", mauXe='" + this.getMauXe()  +
                "gia=" + gia +
                '}' + "\n" ;
    }
}
