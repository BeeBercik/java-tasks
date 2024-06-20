package MyTasks.klasaStudent.usingHashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Student {
    String id;
    String firstName;
    String lastName;
    String faculty;
    HashMap<String, Integer> marks;
    float averageMark;

    public Student(String id, String firstName,
                   String lastName, String faculty,
                   HashMap<String, Integer> marks) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.faculty = faculty;
        this.marks = marks;
//        this.averageMark = this.calculateAverage();
        this.calculateAverage();
    }

    public void printMarks() {
        Iterator<Map.Entry<String, Integer>> i = marks.entrySet().iterator();
        while(i.hasNext()) {
            Map.Entry<String, Integer> element = i.next();
            String key = element.getKey();
            Integer value = element.getValue();

            System.out.println(key + ": " + value);
        }
    }

    void calculateAverage() {
        Iterator<Map.Entry<String, Integer>> i = this.marks.entrySet().iterator();
        int sum = 0;
        while(i.hasNext()) {
            Map.Entry<String, Integer> el = i.next();
            sum += el.getValue();
        }
        int len = this.marks.size();

        this.averageMark =  (float) sum / len;
    }

    void changeMark(String subject, int value) {
        for(Map.Entry<String, Integer> el : this.marks.entrySet()) {;
            if(el.getKey().equals(subject)) {
                el.setValue(value);
            }
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", faculty='" + faculty + '\'' +
                ", marks=" + marks +
                ", averageMark=" + averageMark +
                '}';
    }

    public static void main(String[] args) {
        HashMap<String, Integer> marks = new HashMap<>();
        marks.put("matma", 4);
        marks.put("polski", 5);

        Student student = new Student("1111111", "Robert", "Kania", "IT", marks);
        student.printMarks();

        student.changeMark("matma", 2);
        student.printMarks();
        student.calculateAverage();

        System.out.println(student.toString());
    }
}
