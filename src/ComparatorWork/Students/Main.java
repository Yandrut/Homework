package ComparatorWork.Students;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student vasa = new Student("Vasa", 11);
        Student vala = new Student("Vala", 12);
        Student valentin = new Student("Valentin", 1);
        Student bob = new Student("Bob", 2);
        Student nick = new Student("Nick", 5);
        Student chris = new Student("Chris", 7);
        Student fred = new Student("Fred", 9);

        List<Student> arrayList = new ArrayList<>();
        arrayList.add(new Student("Andrew",12));
        arrayList.add(new Student("Anna",11));
        arrayList.add(new Student("Anton",7));
        arrayList.add(vala);
        arrayList.add(valentin);
        arrayList.add(bob);
        arrayList.add(nick);
        arrayList.add(fred);
        arrayList.add(chris);
        arrayList.add(vasa);

        Collections.sort(arrayList);
        for (Student student : arrayList) {
            System.out.println(student);
        }
        System.out.println();

        arrayList.sort(new Student.NameComparator());
        for (Student student : arrayList) {
            System.out.println(student);
        }
    }
}
// Завдання 1. Відсортуйте список студентів
//
//Створіть клас Студент з полями ім'я (String) та оцінка (int).
// Реалізуйте інтерфейс Comparable в цьому класі, щоб ви могли відсортувати список студентів за оцінкою.
// Також використайте Comparator для сортування за ім'ям.