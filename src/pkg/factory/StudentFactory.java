package pkg.factory;

import pkg.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentFactory {
    public static Student getStudent() { // this is never used in the code, but I added it anyway
        return new Student();
    }

    public static List<Student> getStudents(int n) {
        List<Student> temp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            temp.add(new Student());
        }

        return temp;
    }
}
