package ComparatorWork.Employees;

import java.util.Comparator;
import java.util.Objects;

public class Employee implements Comparable<Employee> {
    private final String name;
    private final int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() { return name; }
    public int getSalary() { return salary; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return this.getName().equals(employee.getName()) && this.getSalary() == employee.getSalary();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee employee) {
        return this.getName().compareTo(employee.getName());
    }

    static class SalaryComparator implements Comparator<Employee> {

        @Override
        public int compare(Employee employee, Employee anotherEmployee) {
            return Integer.compare(employee.getSalary(),anotherEmployee.getSalary());
        }
    }
}
