import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class StudentManager {
    private Map<String, List<String>> classMap;

    public StudentManager() {
        classMap = new HashMap<>();
    }

    public void loadDataFromFile(String filePath) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            for (String line : lines) {
                String[] parts = line.split(" ");
                String student = parts[0];
                String classCode = parts[1];

                classMap.computeIfAbsent(classCode, k -> new ArrayList<>()).add(student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int numberOfClasses() {
        return classMap.size();
    }

    public LinkedList<String> studentsAttendingClass(String classCode) {
        List<String> students = classMap.getOrDefault(classCode, Collections.emptyList());
        Collections.sort(students);
        return new LinkedList<>(students);
    }

    public int bigClasses(int limit) {
        return (int) classMap.values().stream().filter(students -> students.size() > limit).count();
    }

    public LinkedList<String> bigClassesList(int limit) {
        return classMap.entrySet().stream()
                .filter(entry -> entry.getValue().size() > limit)
                .map(Map.Entry::getKey)
                .collect(LinkedList::new, LinkedList::add, LinkedList::addAll);
    }

    public int classNumber(String student) {
        return (int) classMap.values().stream().filter(students -> students.contains(student)).count();
    }

    public LinkedList<String> classList(String student) {
        return classMap.entrySet().stream()
                .filter(entry -> entry.getValue().contains(student))
                .map(Map.Entry::getKey)
                .collect(LinkedList::new, LinkedList::add, LinkedList::addAll);
    }

    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        studentManager.loadDataFromFile("students.txt");

        System.out.println("Number of classes: " + studentManager.numberOfClasses());

        String classCodeToCheck = "C39";
        System.out.println("Students attending class " + classCodeToCheck + ": " +
                studentManager.studentsAttendingClass(classCodeToCheck));

        int limit = 2;
        System.out.println("Number of big classes (more than " + limit + " students): " +
                studentManager.bigClasses(limit));

        System.out.println("List of big classes (more than " + limit + " students): " +
                studentManager.bigClassesList(limit));

        String studentToCheck = "Jake";
        System.out.println("Number of classes attended by " + studentToCheck + ": " +
                studentManager.classNumber(studentToCheck));

        System.out.println("List of classes attended by " + studentToCheck + ": " +
                studentManager.classList(studentToCheck));
    }
}
