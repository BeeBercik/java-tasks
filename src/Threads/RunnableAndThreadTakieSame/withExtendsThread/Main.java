package ZONE.test;

class MyThread extends Thread {
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
        MyThread student = new MyThread("student");
        student.setAction("Waiting for the teacher");
        student.start();
        Thread.sleep(2000);

        MyThread teacher = new MyThread("Teacher");
        teacher.setAction("Coming to the class");
        teacher.start();
    }
}
