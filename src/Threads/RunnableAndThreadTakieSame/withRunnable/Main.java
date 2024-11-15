package Threads.RunnableAndThreadTakieSame.withRunnable;

class MyThread implements Runnable {
    private String name;
    private String action;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.print("Who: " + this.name + "\n");
        System.out.println("Action: " + this.action);
    }

    public void setAction(String action) {
        this.action = action;
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread student_basic = new MyThread("Student");
        student_basic.setAction("Waiting for the teacher");
        Thread student = new Thread(student_basic);
        student.start();
        Thread.sleep(2000);

        MyThread teacher_basic = new MyThread("Teacher");
        teacher_basic.setAction("Coming to the class");
        Thread teacher = new Thread(teacher_basic);
        teacher.start();
    }
}
