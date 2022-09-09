package opgave3;

import java.util.Comparator;

public class StuderendeComparator implements Comparator<Studerende> {
    @Override
    public int compare(Studerende o1, Studerende o2) {
        int comp = o1.getNavn().compareTo(o2.getNavn());
        return comp;
    }
}
