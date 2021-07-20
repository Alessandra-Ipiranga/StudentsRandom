package de.neuefische.model;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Peter", 42);

        Student student2 = new Student("Max", 43);
        Student[] students = {student,student2};
        StudentDB studdb = new StudentDB(students);
        Student stud = studdb.randomStudent(students);
        System.out.println(stud);
        /*
        String var = student.toString();
        System.out.println(var);
        */

    }
}
