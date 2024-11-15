package MyTasks.klasaStudent.markAsObj;

// najpierw przechowujac obiekt a ten 2 wlasciwosci
// pozniej hashmapa

import java.util.List;
import java.util.ListIterator;

public class Student {
    String id;
    String firstName;
    String lastName;
    String faculty;
    List<Mark> marks;
    float averageMark;

    public Student(String id, String firstName,
                   String lastName, String faculty,
                   List<Mark> marks) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.faculty = faculty;
        this.marks = marks;
        this.averageMark = this.calculateAverage();
    }

    public void printMarks() {
        ListIterator<Mark> li = this.marks.listIterator();
        while(li.hasNext()) {
            Mark current = li.next();
            System.out.println(current.subject + ": " + current.value);
        }
    }

    float calculateAverage() {
        int sum = 0;
        int len = marks.size();
        for(Mark mark : marks) {
            sum += mark.value;
        }
        return (float) sum / len;
    }

    void changeMark(String subject, int value) {
        for(int i = 0; i < this.marks.size(); i++) {
            if(this.marks.get(i).subject.equals(subject)) {
                this.marks.get(i).value = value;
            }
        }
//        ListIterator<Mark> li = this.marks.listIterator();
//        while(li.hasNext()) {
//            Mark curr = li.next();
//            if(curr.subject.equals(subject)
//                curr.value = value;
//        }
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
}
