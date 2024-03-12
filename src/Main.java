//Creare una classe Student che accetti nel costruttore il parametro name (String e age Int)
//In questa classe avere i metodi pubblici per ottenere le informazioni.
//Creare un ArrayList con 12 elementi e stamparlo in console.
//Mettere in ordine la collezione e stampare il risultato

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Creare un ArrayList con 12 elementi e stamparlo in console.
        List<Student> listStudents = new ArrayList<>();

        listStudents.add(new Student("Calogero", 10));
        listStudents.add(new Student("Lisa", 24));
        listStudents.add(new Student("Luisa", 21));
        listStudents.add(new Student("Mario", 23));
        listStudents.add(new Student("Luca", 24));
        listStudents.add(new Student("A", 21));
        listStudents.add(new Student("Alex", 23));
        listStudents.add(new Student("Mauro", 24));
        listStudents.add(new Student("Bea", 21));
        listStudents.add(new Student("Caio", 23));
        listStudents.add(new Student("Maurizio", 21));
        listStudents.add(new Student("Marioooooooooo", 23));

        System.out.println("listStudents non ordinato " + listStudents);

        //Mettere in ordine la collezione e stampare il risultato

       listStudents.sort(Comparator.comparing(Student::getName));

        System.out.println("listStudents ordinato alafabetico " + listStudents);

        listStudents.sort(Comparator.comparing(Student::getAge));

        System.out.println("listStudents ordinato per eta " + listStudents);
    }
}