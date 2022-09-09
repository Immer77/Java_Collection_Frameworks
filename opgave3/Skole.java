package opgave3;

import java.util.ArrayList;
import java.util.List;

public class Skole {
    private String navn;
    private List<Studerende> studenter = new ArrayList<>();

    public Skole(String navn){
        this.navn = navn;
    }

    public String getNavn() {
        return navn;
    }

    public void addStuderende(Studerende studerende){
        if(!studenter.contains(studerende)){
            studenter.add(studerende);
        }
    }

    public void removeStuderende(Studerende studerende){
        if(studenter.contains(studerende)){
            studenter.remove(studerende);
        }
    }

    public double gennemsnit(){
        double result = 0;
        int counter = 0;
        for (Studerende s : studenter){
            for(double k : s.getKarakterer()){
                result += k;
                counter++;
            }
        }

        return result / counter;
    }

    public Studerende findStuderende(int studieNr){
        for (Studerende s : studenter){
            if(s.getStudieNr() == studieNr){
                return s;
            }
        }

        return null;
    }

    @Override
    public String toString(){
        return "Navn på skole: " + navn + " Antal studerende: " + studenter.size() + " Gennemsnits karakter på skolen " + gennemsnit();
    }
}

