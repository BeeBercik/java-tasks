package Collections.Iterators;

import java.util.*;

public class hashMapArrayIn {
    public static void main(String[] args) {
        HashMap<Integer, ArrayList<String>> groups = new HashMap<>();

        ArrayList<String> students1 = new ArrayList<>();
        students1.add("robert");
        students1.add("wera");
        groups.put(1, students1);

        ArrayList<String> students2 = new ArrayList<>();
        students2.add("kitka");
        students2.add("piego");
        groups.put(2, students2);

        Iterator<Map.Entry<Integer, ArrayList<String>>> iter = groups.entrySet().iterator();
        while(iter.hasNext()) {
            Map.Entry<Integer, ArrayList<String>> curr = iter.next();
            Integer key = curr.getKey();
            System.out.println(key);
            ListIterator<String> inIter = curr.getValue().listIterator();
            while(inIter.hasNext()) {
                String name = inIter.next();
                System.out.println(name);
            }
        }

        System.out.println("-------------");

        for(Map.Entry<Integer, ArrayList<String>> el : groups.entrySet()) {
            Integer key = el.getKey();
            System.out.println(key);
            for(String name : el.getValue()) {
                System.out.println(name);
            }
        }



        System.out.println("-------------");

        HashMap<String, Integer> cos = new HashMap<>();
        cos.put("robert", 22);
        cos.put("weronika", 23);

        Iterator<Map.Entry<String, Integer>> i = cos.entrySet().iterator();
        while(i.hasNext()) {
            Map.Entry<String, Integer> curr = i.next();
            String name = curr.getKey();
            Integer age = curr.getValue();
            System.out.println(name + " - " + age);
        }

        for(Map.Entry<String, Integer> el : cos.entrySet()) {
            String name = el.getKey();
            Integer age = el.getValue();
            System.out.println(name + ", " + age);
        }
    }
}
