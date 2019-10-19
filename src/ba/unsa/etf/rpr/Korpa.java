package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Korpa {
    private ArrayList<Artikl> artikliUKorpi = new ArrayList<>();
   // int brojArtikli = 0;


    public Korpa(ArrayList<Artikl> artikliUKorpi) {
        this.artikliUKorpi = artikliUKorpi;
    }

    public Korpa() {
    }

    public Artikl[] getArtikli() {
        Artikl[] artikli = artikliUKorpi.toArray(new Artikl[artikliUKorpi.size()]);
        return artikli;
    }

    public void setArtikli(ArrayList<Artikl> artikliUKorpi) {
        this.artikliUKorpi = artikliUKorpi;
    }

    public boolean dodajArtikl(Artikl a){
        if(artikliUKorpi.size() >= 50) return false;
        artikliUKorpi.add(a);
        return true;
    }

    public Artikl izbaciArtiklSaKodom(String kod){
        Artikl izbaci = new Artikl();
        for(int i = 0; i<artikliUKorpi.size();i++){
            if(artikliUKorpi.get(i).getKod().equals(kod)){
                izbaci = artikliUKorpi.get(i);
                artikliUKorpi.remove(i);
            }
        }
      //  brojArtikli--;
        return izbaci;
    }

    public void ispisiArtikleIzKorpe(){
        for(Artikl a: artikliUKorpi){
            System.out.println(a);
        }
    }

    public int dajUkupnuCijenuArtikala() {
        int suma = 0;
        for(int i = 0; i< artikliUKorpi.size(); i++){
            suma += artikliUKorpi.get(i).getCijena();
        }
        return suma;
    }
}
