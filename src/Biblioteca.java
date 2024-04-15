public class Biblioteca {
    // Atributos
    private String nombre;
    private int librosDisponibles;
    private int librosPrestados;



    // Constructor
    public Biblioteca(String nombre, int librosDisponibles){
        this.nombre = nombre;
        this.librosDisponibles = librosDisponibles;


    }



    // Métodos

    public String getNombre(){
        return nombre;
    }

    public int getLibrosDisponibles(){
        return librosDisponibles;
    }

    public int getLibrosPrestados(){
        return librosPrestados;
    }

    public void prestarLibro(){
        librosDisponibles  = librosDisponibles  - 1;
        librosPrestados = librosPrestados + 1;
    }

    public void devolverLibro(){
        librosPrestados = librosPrestados - 1;
        librosDisponibles  = librosDisponibles  + 1;
    }

    public String toString(){

        return "Biblioteca: " + nombre + ", Libros Disponibles: " + librosDisponibles+ ", Libros Prestados: " + librosPrestados;

    }



}