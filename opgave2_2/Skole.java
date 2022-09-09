package opgave2_2;


import java.util.HashSet;

import java.util.Set;

public class Skole {
    private String navn;
    private Set<Studerende> studenter = new HashSet<>(); // Ændring

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

