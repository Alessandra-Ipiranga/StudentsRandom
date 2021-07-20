package de.neuefische.model;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Peter", 42);

        String var = student.toString();
        System.out.println(var);
    }
}
