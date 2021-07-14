package _01_introduction_to_java.bai_tap;

public class SinhVien {
    private String ten;
    private int tuoi;
    private int diemTriet;
    private int diemKinhTeChinhTri;

    public SinhVien() {
    }

    public SinhVien(String ten, int tuoi, int diemTriet, int diemKinhTeChinhTri) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diemTriet = diemTriet;
        this.diemKinhTeChinhTri = diemKinhTeChinhTri;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getDiemTriet() {
        return diemTriet;
    }

    public void setDiemTriet(int diemTriet) {
        this.diemTriet = diemTriet;
    }

    public int getDiemKinhTeChinhTri() {
        return diemKinhTeChinhTri;
    }

    public void setDiemKinhTeChinhTri(int diemKinhTeChinhTri) {
        this.diemKinhTeChinhTri = diemKinhTeChinhTri;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", diemTriet=" + diemTriet +
                ", diemKinhTeChinhTri=" + diemKinhTeChinhTri +
                '}';
    }
}
