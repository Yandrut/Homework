package ComparatorWork.Students;

import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparable<Student> {
    private final String name;
    private final int grade;

    public Student (String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public int getGrade () {
        return grade;
    }
    public String getName () {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return this.getGrade() == student.getGrade() && this.getName().equals(student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, grade);
    }

    @Override
    public int compareTo(Student student) {
        return Integer.compare(this.getGrade(), student.getGrade());
    }

    static class NameComparator implements Comparator<Student> {

        @Override
        public int compare(Student student, Student anotherStudent) {
            return student.getName().compareTo(anotherStudent.getName());
        }
    }
}
