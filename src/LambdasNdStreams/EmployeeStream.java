package LambdasNdStreams;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeeStream {

    public static void main(String[] args) {
        Employee [] employees = {new Employee("Zeddy","Isu",200.0,"IT"),
                new Employee("Helen","Isu",300.0,"IT"),
                new Employee("Sammy","Isu",400.0,"Engr"),
                new Employee("Faith","Isu",200.0,"Medic"),
                new Employee("Adam","Johnson",603.0,"Staff"),
                new Employee("Mary","Oluchi",700,"Medic")
        };
        List<Employee> list = new ArrayList<>(Arrays.asList(employees));
        Predicate<Employee> twoAndAbove = employee -> (employee.getSalary() > 200 && employee.getSalary() <= 700);
        Function<Employee,String> firstName = Employee::getFirstName;
        Function<Employee,String> lastName = Employee::getLastName;
        Comparator<Employee> lastThenFirst = Comparator.comparing(lastName).thenComparing(firstName);
        list.stream()
                .filter(twoAndAbove)
                .sorted(lastThenFirst.reversed())
                .forEach(System.out::println);

         list.stream()
                .map(Employee::getDepartment)
                .distinct()
                .sorted()
                .forEach(System.out::println);
        System.out.printf("%nEmployees by department: %n");
        System.out.println();
        Map<String,List<Employee>> groupByDept = list.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        groupByDept.forEach((department,employeesInDepartment)->{
            System.out.printf("%n%S%n",department);
            employeesInDepartment.forEach(employee -> System.out.printf("%s%n",employee));
        });

    }
}
