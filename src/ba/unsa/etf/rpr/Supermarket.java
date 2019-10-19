package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Supermarket {
    private ArrayList<Artikl> artikliUSupermarketu = new ArrayList<>();
   // int brojArtikli = 0;

    public Supermarket(ArrayList<Artikl> artikliUSupermarketu) {
        this.artikliUSupermarketu = artikliUSupermarketu;
    }

    public Supermarket() {
    }

    public Artikl[] getArtikli() {
        Artikl[] artikli =  artikliUSupermarketu.toArray(new Artikl[artikliUSupermarketu.size()]);
        return artikli;
    }

    public void setArtikli(ArrayList<Artikl> artikliUSupermarketu) {
        this.artikliUSupermarketu = artikliUSupermarketu;
    }

    public Artikl izbaciArtiklSaKodom(String kod){
        Artikl izbaci = new Artikl();
        for(int i=0; i< artikliUSupermarketu.size();i++){
            if(artikliUSupermarketu.get(i).getKod().equals(kod)){
                izbaci = artikliUSupermarketu.get(i);
                artikliUSupermarketu.remove(i);
            }
        }
        //brojArtikli--;
        return izbaci;
    }

    public void dodajArtikl(Artikl a){
        if(artikliUSupermarketu.size() >= 1000) throw new IndexOutOfBoundsException("Previse artikala u supermarketu!");
        artikliUSupermarketu.add(a);
    }

    public void ispisiArtikleUSupermarketu(){
        for(Artikl a: artikliUSupermarketu){
            System.out.println(a);
        }
    }
}
