package Complarable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Student student0 = new Student("Kien", 30, "HaNoi");
        Student student1 = new Student("hai", 20, "HaNoi");
        Student student2 = new Student("Bao", 23, "HaiPhong");

        List<Student> students = new ArrayList<Student>();
        students.add(student0);
        students.add(student1);
        students.add(student2);
        Collections.sort(students);
        for(Student student : students){
            System.out.println(student.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(students,ageComparator);
        System.out.println("So sanh theo tuoi");
        for(Student student : students){
            System.out.println(student.toString());
        }
    }

}
