package es.upv.fgv.lib;

public class Alumno extends Persona {
    private int suspensos;

    public Alumno(String n, int e, int s) {
        super(n, e);
        this.suspensos = s;
    }

    public int getSuspensos() {
        return suspensos;
    }

    public void setSuspensos(int suspensos) {
        this.suspensos = suspensos;
    }

    @Override
    public void mostrar(){
        System.out.println("Me llamo " + nombre + ", y he suspendido " + suspensos);
    }
}
