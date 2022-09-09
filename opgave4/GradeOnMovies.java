package opgave4;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.*;

public class GradeOnMovies {

    private static final DecimalFormat df  = new DecimalFormat("0.0");

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("./l39-CollectionsFramework/src/opgave4/filmKarakterer"));
        Map<String, ArrayList<String>> movieGrades = new HashMap<>();
        int numberOfLines = scanner.nextInt();
        System.out.println("Antal karakterer givet " + numberOfLines);


        while (scanner.hasNext()) {
            String key = scanner.nextLine();
            ArrayList<String> list;
            if (!key.equalsIgnoreCase("")) {
                if (movieGrades.containsKey(key)) {
                    list = movieGrades.get(key);
                    list.add(scanner.nextLine());
                } else {
                    list = new ArrayList<>();
                    list.add(scanner.nextLine());
                    movieGrades.put(key, list);
                }
           }
        }
        for (Map.Entry<String, ArrayList<String>> entry : movieGrades.entrySet()) {
            double averageGrade = 0;
            int counter = 0;
            for (String s : entry.getValue()) {
                averageGrade += Integer.parseInt(s);
                counter++;
            }
            System.out.printf(entry.getKey() + " Fik " + counter + " Anmeldelser og " + df.format(averageGrade / counter) + " gennemsnit\n");
        }

    }
}
