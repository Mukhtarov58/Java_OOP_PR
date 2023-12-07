package Seminars.Sem_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // Инкапсуляция, Наследование, Полиморфизм, (Абстракция)
        Person person = new Person("Igor", 120);
        printPerson(person); // Igor - 120

        Worker worker = new Worker("Igor");
        printPerson(worker); // Igor - 120 <-> Igor - 120, 100

//        System.out.println(worker.getSalary());

        List<Person> persons = new ArrayList<>();
        persons.add(person);
        persons.add(worker);
    }

    static void printPerson(Person person) {
        System.out.println(person);
    }

}



