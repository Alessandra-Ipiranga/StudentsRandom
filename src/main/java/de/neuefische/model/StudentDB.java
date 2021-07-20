package de.neuefische.model;


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
    public Student randomStudent(Student[] students){
        int arrayLength = students.length;
        int randomNumber = (int)(Math.random() * arrayLength) ;
        return students[randomNumber];
    }
    public Student[] add(Student student){
        Student[] newArray = new Student[students.length +1];
        for (int i = 0; i < students.length;i++){
            newArray[i] = students[i];
        }
        newArray[students.length ] = student;
        students = newArray;
        return students;
    }
    public Student[] remove(Student student){
        Student[] newArray = new Student[students.length - 1];
        int j = 0;
        for(int i = 0; i < students.length;i++){
           if  (!students[i].equals(student)){
               newArray[j] = students[i];
               j++;
            }
        }
        return newArray;
    }

}
