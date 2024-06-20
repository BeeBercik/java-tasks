package MyTasks.fileJCollections;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

public class Main {
    int numberOfClasses(HashMap<String, ArrayList<String>> students) {
        return students.size();
    }

    LinkedList<String> studentAttendingClasses(String classCode, HashMap<String, ArrayList<String>> students) {
        LinkedList<String> names = new LinkedList<>();
//        metoda get() uzyskuje arrayliste pod danym kluczem i po niej listuje
        students.get(classCode).forEach(name -> names.add(name));
        Collections.sort(names);

        return names;
    }

    int bigClasses(int limit, HashMap<String, ArrayList<String>> students) {
//        .values() zwraca kolekcje elementow/wartosci przechowywanych, pomija klucze
        int count = (int) students.values().stream().filter(el -> el.size() > limit).count();

        return count;
    }

    int classNumber(String student, HashMap<String, ArrayList<String>> students) {
        int count = (int) students.values().stream().filter(names -> names.contains(student)).count();

        return count;
    }

    LinkedList<String> classList(String student, HashMap<String, ArrayList<String>> students) {
        LinkedList<String> names = new LinkedList<>();
        students.forEach((subject, listName) -> {
            if(listName.contains(student)) names.add(subject);
        });

        return names;
    }

    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> students = new HashMap<>();

        String filePath = "files\\students.txt";
        try {
            BufferedReader in = new BufferedReader(new FileReader(filePath));
            String line;

            while((line = in.readLine()) != null) {
                String subject = String.valueOf(line.charAt(line.length() - 1));
                String name = line.substring(0, line.length() - 1);

                if(!students.containsKey(subject)) {
                    students.put(subject, new ArrayList<>());
                }
                students.get(subject).add(name);
            }
        } catch(FileNotFoundException e) {
            System.out.println("Nie znaleziono pliku!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        students.forEach((name, lista) -> {
            System.out.println(name);
            lista.forEach(innerName -> System.out.println(innerName));
            System.out.println();
        });

        Main main = new Main();
        System.out.println("Jest " + main.numberOfClasses(students) + " przedmiotow");
//
        String sub = "M";
        LinkedList<String> subjectNames = main.studentAttendingClasses(sub, students);
        System.out.println("Na przedmiot " + sub + " chodza:");
        for(String name : subjectNames) System.out.println("-" + name);
//
        int limit = 1;
        int count = main.bigClasses(limit, students);
        System.out.println("Jest " + count + " zajec, z >" + limit + " studentami");
//
        String name = "weronika";
        int studentClasses = main.classNumber(name, students);
        System.out.println(name + " chodzi na " + studentClasses + " zajec");
//
        name = "robert";
        LinkedList<String> classesList = main.classList(name, students);
        System.out.print(name + " chodzi na: ");
        for(String classes : classesList) {
            System.out.print(classes + " ");
        }

    }
}
