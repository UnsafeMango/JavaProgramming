package com.company;

public class Challenge8 {
    public static void main(String[] args) {
        final Tutor tutor = new Tutor();
        final Student student = new Student(tutor);
        tutor.setStudent(student);

        Thread tutorThread = new Thread(new Runnable() {
            @Override
            public void run() {
                tutor.studyTime();
            }
        });

        Thread studentThread = new Thread(new Runnable() {
            @Override
            public void run() {
                student.handInAssignment();
            }
        });

        tutorThread.setName("Tutor");
        studentThread.setName("Student");
        tutorThread.start();
        studentThread.start();
    }
}

class Tutor {
    private Student student;

    public synchronized void setStudent(Student student) {
        this.student = student;
    }

    public synchronized void studyTime() {

        try{
            System.out.println(Thread.currentThread().getName() +" reporting: Tutor has arrived");
            try {
                // wait for student to arrive and hand in assignment
                Thread.sleep(300);
            } finally {
                student.startStudy();
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted: Waiting for student");
        }
        System.out.println(Thread.currentThread().getName() + " reporting: Tutor is studying with student");
    }

    public synchronized void getProgressReport() {
        // get progress report
        System.out.println(Thread.currentThread().getName() + " reporting: Tutor gave progress report");
    }
}

class Student {

    private Tutor tutor;

    Student(Tutor tutor) {
        this.tutor = tutor;
    }

    public void startStudy() {
        // study
        System.out.println(Thread.currentThread().getName() + " reporting: Student is studying");
    }

    public void handInAssignment() {
        try {
            tutor.getProgressReport();
            // wait for tutor to accept assignment
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Interrupted: Student could not hand in assignment");
        } finally {
            System.out.println(Thread.currentThread().getName() + " reporting: Student handed in assignment");
        }
    }
}