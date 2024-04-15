public class Estudiante {
    // Atributos
    private String nombre;
    private int edad;
    private double nota;

    // Constructor (si lo consideras necesario)
    public Estudiante(){
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;

    }


    // Métodos

    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public double getNota(){
        return nota;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setNota(double nota){
        this.nota = nota;
    }

    public String toString(){
        return "Nombre: " + nombre + ", Edad: " + edad + ", Nota: " + nota;
    }



}