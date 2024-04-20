package day26_statics.studentTasks;

import day26_statics.studentTasks.Student;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentsGroup {

    public String groupName;

    public int groupId;

    public ArrayList<Student> students = new ArrayList<>();

    public StudentsGroup(String groupName, int groupId) {

        this.groupName = groupName;
        this.groupId = groupId;
        // students = new ArrayList<>(); // size : 0

    }

    public void addStudent(Student student) {
        students.add(student);
    }// Takes one student object, and adds it to the arraylist of students

    public void addStudent(Student[] students) {
        this.students.addAll(Arrays.asList(students));
    }// Takes one array of students, and adds the array of students to the arraylist of students


}
