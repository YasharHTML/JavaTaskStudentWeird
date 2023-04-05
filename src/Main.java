import pkg.Student;
import pkg.calculator.Calculator;
import pkg.factory.StudentFactory;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = StudentFactory.getStudents(100);
        for (Student student:
                students) {
            System.out.println(student.toString());
            System.out.println(student.calculated());
        }

        Calculator calculator = new Calculator(students);
        System.out.println(calculator.calculated());
    }
}