package LambdasNdStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class EmployeeStream {

    public static void main(String[] args) {
        Employee [] employees = {new Employee("Zeddy","Isu",200.0,"IT"),
                new Employee("Helen","Isu",300.0,"IT"),
                new Employee("Sammy","Isu",400.0,"Engr"),
                new Employee("Faith","Isu",200.0,"Medic")
        };
        List<Employee> list = new ArrayList<>(Arrays.asList(employees));
        Predicate<Employee> twoAndAbove = employee -> (employee.getSalary() > 200 && employee.getSalary() <= 400);
        list.stream()
                .filter(twoAndAbove)
                .sorted(Comparator.comparing(Employee::getSalary))
                .forEach(System.out::println);
    }
}
