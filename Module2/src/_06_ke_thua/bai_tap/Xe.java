package bai_tap;

public  abstract class Xe {
    private int soChoNgoi;
    private  int trongLuong;
    private String mauXe;

    public Xe() {
    }

    public Xe(int soChoNgoi, int trongLuong, String mauXe) {
        this.soChoNgoi = soChoNgoi;
        this.trongLuong = trongLuong;
        this.mauXe = mauXe;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public int getTrongLuong() {
        return trongLuong;
    }

    public void setTrongLuong(int trongLuong) {
        this.trongLuong = trongLuong;
    }

    public String getMauXe() {
        return mauXe;
    }

    public void setMauXe(String mauXe) {
        this.mauXe = mauXe;
    }

    @Override
    public String toString() {
        return "Xe{" +
                "soChoNgoi=" + soChoNgoi +
                ", trongLuong=" + trongLuong +
                ", mauXe='" + mauXe + '\'' +
                '}';
    }
}
