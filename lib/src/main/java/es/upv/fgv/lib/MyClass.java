package es.upv.fgv.lib;
import java.util.ArrayList;


public class MyClass {
    public static void main(String[] args) {
/*
        ArrayList<String> b = new ArrayList<>();
        b.add("Hola ");
        b.add("Mundo");

        for (int i=0; i<b.size(); i++) {
            System.out.print(b.get(i));
        }

        System.out.println();

        for (String i : b) {
            System.out.print(i);
        }

        System.out.println();

        for (String i : b) {
            System.out.print(i.toUpperCase());
        }
        */

    ArrayList<Persona> p = new ArrayList<>();
    p.add(new Persona("Ferran", 21));
    for(Persona i:p){
        i.mostrar();
    }

    Alumno a = new Alumno("Ferran", 21, 0);
    a.mostrar();

    } //main()
}
