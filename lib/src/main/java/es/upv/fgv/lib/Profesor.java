package es.upv.fgv.lib;

public class Profesor extends Persona {
    private String asignaturaImpartida;

    public Profesor(String n, int e, String a) {
        super(n, e);
        this.asignaturaImpartida = a;
    }

    public String getAsignaturaImpartida() {
        return asignaturaImpartida;
    }

    public void setAsignaturaImpartida(String asignaturaImpartida) {
        this.asignaturaImpartida = asignaturaImpartida;
    }

    @Override
    public void mostrar(){
        System.out.println("Me llamo " + nombre + ", tengo " + edad + " anyos e imparto " + asignaturaImpartida);
    }
}
