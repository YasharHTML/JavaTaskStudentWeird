package pkg.calculator;

import pkg.Student;
import pkg.interfaces.ICalculatable;

import java.util.List;

public class Calculator implements ICalculatable {
    private final List<Student> students;
    public Calculator(List<Student> students) {
        this.students = students;
    }

    @Override
    public double calculated() {
        double result = students.stream().mapToDouble(Student::calculated).sum();
        return result / students.size();
    }
}
