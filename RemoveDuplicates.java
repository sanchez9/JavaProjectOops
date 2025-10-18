package octProjectSteph;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicates {

    public static void main(String[] args) {

        // 10. How can you remove all duplicates from ArrayList?

        List<String> duplicates = new ArrayList<>();
        duplicates.add("Stephanie");
        duplicates.add("Reyna");
        duplicates.add("Srikanth");
        duplicates.add("Angelina");
        duplicates.add("Srikanth");
        duplicates.add("Stephanie");
        duplicates.add("Pooja");
        duplicates.add("Reyna");

        LinkedHashSet<String> set = new LinkedHashSet<>(duplicates);

        List<String> newList = new ArrayList<>(set);

        System.out.println(newList);

    }
}

//submitted by Stephanie Sanchez
