package de.neuefische.model;

import java.util.Arrays;

public class StudentDB {
    private Student[] students;


    public StudentDB(Student[] students) {
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Student[] list(){
        return students;
    }

    @Override
    public String toString() {
        String result= "";
        for (int i = 0; i < students.length; i++){
            result += "Name: " + students[i].getName() + ", id: " + students[i].getId() + "\n";
        }
        return result;
    }
}
