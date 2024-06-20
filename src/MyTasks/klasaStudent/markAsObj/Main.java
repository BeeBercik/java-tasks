package MyTasks.klasaStudent.markAsObj;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[1];

        List<Mark> marks = new ArrayList<>();
        marks.add(new Mark("biologia", 3));
        marks.add(new Mark("historia", 2));
        students[0] = new Student("1111111", "Robert", "Kania", "IT", marks);

        System.out.println(students[0].toString());
        students[0].printMarks();
        students[0].changeMark("biologia", 6);
        students[0].printMarks();
    }
}
