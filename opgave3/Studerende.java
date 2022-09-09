package opgave3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Studerende implements Comparable<Studerende> {
    private int studieNr;
    private String navn;
    private List<Integer> karakterer = new ArrayList<>();

    public Studerende(int studieNr, String navn){
        this.studieNr = studieNr;
        this.navn = navn;
    }

    public int getStudieNr() {
        return studieNr;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void addKarakter(int karakter){
        karakterer.add(karakter);
    }

    public List<Integer> getKarakterer() {
        return new ArrayList<>(karakterer);
    }

    @Override
    public String toString(){
        return "Navn: " + navn + " StudieNr: " + studieNr + " Karakterer: " + karakterer;
    }

    @Override
    public int compareTo(Studerende o) {
        int comp = 0;
        if(this.studieNr < o.studieNr){
            comp = -1;
        }else{
            comp = 1;
        }
        return comp;
    }
}
