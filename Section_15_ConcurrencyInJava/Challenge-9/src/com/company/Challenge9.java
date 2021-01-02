package com.company;

public class Challenge9 {
    public static void main(String[] args) {
        final NewTutor tutor = new NewTutor();
        final NewStudent student = new NewStudent(tutor);
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

        tutorThread.start();
        studentThread.start();
    }
}

class NewTutor {
    private NewStudent student;

    public void setStudent(NewStudent student) {
        this.student = student;
    }

    public void studyTime() {

        synchronized (this) {
            System.out.println("Tutor has arrived");
            synchronized (student) {
                try {
                    // wait for student to arrive
                    this.wait();
                } catch (InterruptedException e) {

                }
                student.startStudy();
                System.out.println("Tutor is studying with student");
            }
        }
    }

    // wait() and notifyAll() methods must be called within synchronized blocks. To call wait on an object, a thread must be holding the object's
    // lock. When it calls wait, it releases the lock

    public void getProgressReport() {
        // get progress report
        System.out.println("Tutor gave progress report");
    }
}

class NewStudent {

    private NewTutor tutor;

    NewStudent(NewTutor tutor) {
        this.tutor = tutor;
    }

    public void startStudy() {
        // study
        System.out.println("Student is studying");
    }

    public void handInAssignment() {
        synchronized (tutor) {
            tutor.getProgressReport();
                System.out.println("Student handed in assignment");
                tutor.notifyAll();
        }
    }
}