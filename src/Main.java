//Creare una classe Student che accenti nel costruttore
// il parametro name (String) e age (Int)
//In questa classe avere i metodi pubblici per ottenere le informazioni.
//Creare un ArrayList con n elementi e stamparlo in console.
//Aggiungere 4 elementi alla collezione e stampare la collezione aggiornata in console

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Creare un ArrayList con n elementi
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Giovanni", 7));
        studentList.add(new Student("Marta", 7));
        studentList.add(new Student("Clara", 8));
        studentList.add(new Student("Ivan", 8));
        studentList.add(new Student("Marco", 6));
        studentList.add(new Student("Ilaria", 10));

        //stampa dell'ArrayList in console
        System.out.println("la lista di studenti e' la seguente:");
        for (Student student : studentList) {
            System.out.println("la lista di studenti e': " + student);
        }

        //Aggiungere 4 elementi alla collezione
        studentList.add(new Student("Jack", 7));
        studentList.add(new Student("Marie", 7));
        studentList.add(new Student("Jude", 8));
        studentList.add(new Student("Owen", 8));

        //stampare la collezione aggiornata in console
        System.out.println("Questa di seguito e' la lista aggiornata");
        for (Student student : studentList) {
            System.out.println("la lista di studenti e': " + student);
        }
    }
}