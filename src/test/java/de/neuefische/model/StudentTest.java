package de.neuefische.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    @DisplayName("Name cannot be empty!")
    public void nameTest() {
        //GIVEN
        String name = "";
        //WHEN
        Student student = new Student();
        student.setName(name);
        String actual = student.getName();
        //THEN
        assertEquals(name, actual);
    }

    @Test
    @DisplayName("Age cannot be negative!")
    public void ageTest() {
        //GIVEN
        int age = -42;
        //WHEN
        Student student = new Student();
        student.setAge(age);
        int actual = student.getAge();
        //THEN
        assertEquals(age, actual);
    }

    @Test
    @DisplayName("Matriukations numere cannot be empty!")
    public void matriculationNumberTest() {
        //GIVEN
        String matricultionNumber = "";
        //WHEN
        Student student = new Student();
        student.setMatricutionNumber(matricultionNumber);
        String actual = student.getMatriculationNumber();
        //THEN
        assertEquals(matricultionNumber, actual);
    }

    @Test
    @DisplayName("Students with the same name are equal")
    public void studentsAreEqualTest() {
        //GIVEN
        Student student = new Student("Jonas", 24, "957864");
        Student student1 = new Student("Jonas", 24, "957864");
        //WHEN
        boolean actual = student.equals(student1);
        //THEN
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Students with different name are not equal")
    public void studentsAreDefferentTest() {
        //GIVEN
        Student student = new Student("Jonas", 24, "957864");
        Student student1 = new Student("Peter", 24, "957864");
        //WHEN
        boolean actual = student.equals(student1);
        //THEN
        assertFalse(actual);
    }

}