package pkg;

import pkg.generator.GeneratedSingleton;
import pkg.interfaces.ICalculatable;

public class Student implements ICalculatable {

    private final int id;
    private final int complete;
    private final int failed;
    private final int bonus;

    public Student() {
        id = GeneratedSingleton.getInstance().index();
        complete = (int)(Math.random() * 20);
        failed = 20 - complete;
        bonus = (int)(Math.random() * 5);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", complete=" + complete +
                ", failed=" + failed +
                ", bonus=" + bonus +
                '}';
    }

    @Override
    public double calculated() {
        int result = complete - failed + 2 * bonus;
        return Math.max(result, 0);
    }
}
