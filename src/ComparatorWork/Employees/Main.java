package ComparatorWork.Employees;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static <E> void iterate(Set<E> set) {
        for (E element : set) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Set<Employee> employeeSet = new TreeSet<>();
        employeeSet.add(new Employee("Andrew",100000));
        employeeSet.add(new Employee("Michael",200000));
        employeeSet.add(new Employee("Nick",5000));
        employeeSet.add(new Employee("Taras",150000));
        employeeSet.add(new Employee("George",250000));

        System.out.println("Default comparable by Name: ");
        iterate(employeeSet);

        Set<Employee> setSortedBySalary = new TreeSet<>(new Employee.SalaryComparator());
        setSortedBySalary.addAll(employeeSet);
        System.out.println("\n Employees sorted by Salary:");
        iterate(setSortedBySalary);

    }
}
