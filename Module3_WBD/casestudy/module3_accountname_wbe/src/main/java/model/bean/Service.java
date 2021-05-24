package model.bean;

public class Service {
    private int iddichvu;
    private String tendichvu;
    private int dientich;
    private String chiphithue;
    private String songuoitoida;
    private int idkieuthue_dv;

    public Service() {
    }

    public Service(int iddichvu, String tendichvu, int dientich, String chiphithue, String songuoitoida, int idkieuthue_dv) {
        this.iddichvu = iddichvu;
        this.tendichvu = tendichvu;
        this.dientich = dientich;
        this.chiphithue = chiphithue;
        this.songuoitoida = songuoitoida;
        this.idkieuthue_dv = idkieuthue_dv;
    }

    public Service(String tendichvu, int dientich, String chiphithue, String songuoitoida, int idkieuthue_dv) {
        this.tendichvu = tendichvu;
        this.dientich = dientich;
        this.chiphithue = chiphithue;
        this.songuoitoida = songuoitoida;
        this.idkieuthue_dv = idkieuthue_dv;
    }

    public int getIddichvu() {
        return iddichvu;
    }

    public void setIddichvu(int iddichvu) {
        this.iddichvu = iddichvu;
    }

    public String getTendichvu() {
        return tendichvu;
    }

    public void setTendichvu(String tendichvu) {
        this.tendichvu = tendichvu;
    }

    public int getDientich() {
        return dientich;
    }

    public void setDientich(int dientich) {
        this.dientich = dientich;
    }

    public String getChiphithue() {
        return chiphithue;
    }

    public void setChiphithue(String chiphithue) {
        this.chiphithue = chiphithue;
    }

    public String getSonguoitoida() {
        return songuoitoida;
    }

    public void setSonguoitoida(String songuoitoida) {
        this.songuoitoida = songuoitoida;
    }

    public int getIdkieuthue_dv() {
        return idkieuthue_dv;
    }

    public void setIdkieuthue_dv(int idkieuthue_dv) {
        this.idkieuthue_dv = idkieuthue_dv;
    }
}
