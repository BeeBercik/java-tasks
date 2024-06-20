package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

// set przechowuje unikalne elementy w liscie - jak dodasz taki co istnieje to nie dodaje go

public class CollectSet {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("robert");
        names.add("wera");
        names.add("lukasz");
        names.add("kita");

        Set<String> secik = names.stream().filter(el -> el.length() > 4).collect(Collectors.toSet());
        secik.forEach(el -> System.out.println(el));
    }
}
