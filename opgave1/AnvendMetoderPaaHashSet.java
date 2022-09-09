package opgave1;

import java.util.HashSet;

public class AnvendMetoderPaaHashSet {
    public static void main(String[] args) {
        // 1.1
        HashSet<Integer> amount = new HashSet<>();
        // 1.2
        amount.add(34);
        amount.add(12);
        amount.add(23);
        amount.add(45);
        amount.add(67);
        amount.add(34);
        amount.add(98);

        // 1.3 Printer ikke dubliketter
        System.out.println(amount);

        // 1.4
        amount.add(23);

        // 1.5
        System.out.println(amount);

        // 1.6
        amount.remove(67);

        // 1.7
        System.out.println(amount);

        // 1.8
        if(amount.contains(23)){
            System.out.println("Amount indeholder 23");
        }

        // 1.9
        System.out.println(amount.size());
    }

}
