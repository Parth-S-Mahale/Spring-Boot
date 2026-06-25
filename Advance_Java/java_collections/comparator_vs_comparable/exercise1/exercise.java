package Advance_Java.java_collections.comparator_vs_comparable.exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class exercise {
    public static void main(String[] args) {
        Comparator<Student> com = (i, j) -> i.age > j.age ? 1 : -1;

        List<Student> studs = new ArrayList<>();

        studs.add(new Student(21, "Parth"));
        studs.add(new Student(12, "Rahul"));
        studs.add(new Student(17, "John"));
        studs.add(new Student(6, "Jay"));

        Collections.sort(studs, com);

        for(Student s : studs) {
            System.out.println(s);
        }
    }
}

/* class Student implements Comparable<Student>{ */
class Student {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Students{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    /* public int compareTo(Student that) {
        if (this.age > that.age) {
            return 1;
        } else {
            return -1;
        }
    } */
}