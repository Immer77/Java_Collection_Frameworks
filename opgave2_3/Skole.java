package opgave2_3;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Skole {
    private String navn;
    private Map<Integer, Studerende> studenter = new HashMap<>(); // Ændring

    public Skole(String navn){
        this.navn = navn;
    }

    public String getNavn() {
        return navn;
    }

    public void addStuderende(int studieNr, Studerende studerende){
        if(!studenter.containsKey(studieNr)){
            studenter.put(studieNr, studerende);
        }
    }

    public void removeStuderende(int studieNr, Studerende studerende){
        if(studenter.containsKey(studieNr)){
            studenter.remove(studieNr, studerende);
        }
    }

    public double gennemsnit(){
        double result = 0;
        int counter = 0;
        for (Studerende s : studenter.values()){
            for(double k : s.getKarakterer()){
                result += k;
                counter++;
            }
        }

        return result / counter;
    }

    public Studerende findStuderende(int studieNr){
        for (Studerende s : studenter.values()){
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

