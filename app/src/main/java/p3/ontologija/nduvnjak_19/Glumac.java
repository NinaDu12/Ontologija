package p3.ontologija.nduvnjak_19;

import java.io.Serializable;

public class Glumac implements Serializable {

    private int sifra;
    private String glumac;
    private String nagrada;
    private String rodjenje;
    private String zavrsio;
    private String glumi;
    private int godina;
    private int imaUloga;

    public Glumac() {
        this.sifra = sifra;
        this.glumac = glumac;
        this.nagrada = nagrada;
        this.rodjenje = rodjenje;
        this.zavrsio = zavrsio;
        this.glumi = glumi;
        this.godina = godina;
        this.imaUloga = imaUloga;
    }

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }

    public String getGlumac() {
        return glumac;
    }

    public void setGlumac(String glumac) {
        this.glumac = glumac;
    }

    public String getNagrada() {
        return nagrada;
    }

    public void setNagrada(String nagrada) {
        this.nagrada = nagrada;
    }

    public String getRodjenje() {
        return rodjenje;
    }

    public void setRodjenje(String rodjenje) {
        this.rodjenje = rodjenje;
    }

    public String getZavrsio() {
        return zavrsio;
    }

    public void setZavrsio(String zavrsio) {
        this.zavrsio = zavrsio;
    }

    public String getGlumi() {
        return glumi;
    }

    public void setGlumi(String glumi) {
        this.glumi = glumi;
    }

    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    public int getImaUloga() {
        return imaUloga;
    }

    public void setImaUloga(int imaUloga) {
        this.imaUloga = imaUloga;
    }
}
