package opgave2_2;

public class App {
    public static void main(String[] args) {
        Skole skole = new Skole("Erhvervsakademiet");
        Studerende studerende = new Studerende(20,"Peter");
        Studerende studerende1 = new Studerende(21,"Anne");
        Studerende studerende2 = new Studerende(22,"Oliver");

        studerende.addKarakter(12);
        studerende1.addKarakter(10);
        studerende2.addKarakter(7);

        skole.addStuderende(studerende);
        skole.addStuderende(studerende1);
        skole.addStuderende(studerende2);

        System.out.println(skole);
    }
}
