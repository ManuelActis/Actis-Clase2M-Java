package Ejercicio3;

public class Libro {

    private String titulo;
    private String autor;
    private String isbn;
    private String Estado;



    public Libro(){

    }

    public Libro(String titulo, String autor, String isbn)
    {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;

    }

    public String toString(Libro libro)
    {
        String ret = libro.autor + ", " + libro.titulo + ", " + libro.isbn;

        return ret;
    }

    public void Prestamo()
    {
        if(Estado == "Disponible")
        {
            this.Estado = "Prestado";
        }

    }

    public void Devolver()
    {
        this.Estado = "Disponible";
    }


}
