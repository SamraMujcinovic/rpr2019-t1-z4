package ba.unsa.etf.rpr;

public class Artikl {
    private String naziv = "";
    private double cijena;
    private String kod = "";

    public Artikl(String naziv, double cijena, String kod) {
        this.naziv = naziv;
        this.cijena = cijena;
        this.kod = kod;
    }

    public Artikl() {
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getCijena() {
        return cijena;
    }

    public void setCijena(double cijena) {
        this.cijena = cijena;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }


    @Override
    public String toString() {
        return getNaziv() + "( " + getKod() + ") = " + getCijena() + "\n";
    }
}
