package es.upv.fgv.lib;

public class Persona {
    protected String nombre;
    protected int edad;

    public Persona(String n, int e) {
        this.nombre = n;
        this.edad = e;
    }

    public void mostrar() {
        System.out.println("Me llamo " + nombre + " y tengo " + edad + " anyos");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }



}
