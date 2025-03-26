package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class FindMaximumSalaryFromDepartment {

    public static Map<String, Employee> getHighestSalaryByDept(List<Employee> employees) {
        Map<String, Employee> highestSalaries = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparing(Employee::getSalary)), Optional::get)
                        ));
        return highestSalaries;
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", 70000, "IT"),
                new Employee(2, "Bob", 80000, "HR"),
                new Employee(3, "Charlie", 75000, "IT"),
                new Employee(4, "David", 65000, "Finance"),
                new Employee(5, "Eve", 90000, "HR")
        );


        Map<String, Employee> highestSalaries = getHighestSalaryByDept(employees);
        highestSalaries.forEach((dept, emp) ->
                System.out.println(dept + " -> " + emp));

        List<String> empNames = employees.stream()
                .filter(e-> e.getSalary() > 40000)
                .map(Employee::getName)
                .toList();

        System.out.println("List of employees having salaries more than 40K :: " + empNames);


        List<Employee> empDescending = employees.stream()
                        .sorted(Comparator.comparing(Employee::getSalary).reversed()).toList();
        System.out.println("List of Employees sorted by descending order of their salary :: " + empDescending);

        Optional<Employee> minSalary = employees.stream()
                .collect(Collectors.minBy(Comparator.comparing(Employee::getSalary)));
        System.out.println("min " +minSalary);

        String employeeNames = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.joining(", ", "[", "]"));

        System.out.println("Employee Names: " + employeeNames);
    }


    static class Employee {

        public Employee(int id, String name, double salary, String department) {
            this.id = id;
            this.name = name;
            this.salary = salary;
            this.department = department;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        int id;
        String name;
        double salary;
        String department;

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", salary=" + salary +
                    ", department='" + department + '\'' +
                    '}';
        }
    }
}