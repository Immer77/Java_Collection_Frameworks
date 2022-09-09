package opgave3;

import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        Skole skole = new Skole("Erhvervsakademiet");
        Studerende studerende = new Studerende(21,"Aeter");
        Studerende studerende1 = new Studerende(20,"Anne");
        Studerende studerende2 = new Studerende(22,"Oliver");

        studerende.addKarakter(12);
        studerende1.addKarakter(10);
        studerende2.addKarakter(7);

        skole.addStuderende(studerende);
        skole.addStuderende(studerende1);
        skole.addStuderende(studerende2);

        TreeSet<Studerende> treeSet = new TreeSet<>(new StuderendeComparator());
        treeSet.add(studerende1);
        treeSet.add(studerende);
        treeSet.add(studerende2);
        System.out.println(treeSet + "\n");

        TreeSet<Studerende> treeSet1 = new TreeSet<>();
        treeSet1.add(studerende1);
        treeSet1.add(studerende);
        treeSet1.add(studerende2);
        System.out.println(treeSet1 + "\n");

        System.out.println(skole);
    }
}
