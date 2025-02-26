public class Libro {
    private String titulo;
    private String autor;
    private int añoPublicacion;
    private String isbn;

    public Libro(String titulo, String autor, int añoPublicacion, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.isbn = isbn;
    }

    public String mostrarInformacion() {
        return "Título: " + titulo + ", Autor: " + autor + ", Año: " + añoPublicacion + ", ISBN: " + isbn;
    }

    public boolean esAntiguo() {
        return (2023 - añoPublicacion) > 20; // Asumiendo que el año actual es 2023
    }

    // Método toString
    @Override
    public String toString() {
        return "Libro [Título: " + titulo + ", Autor: " + autor + ", Año: " + añoPublicacion + ", ISBN: " + isbn + "]";
    }
}