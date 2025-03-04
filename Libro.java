public class Libro {
    private String titulo;
    private Autor autor;
    private int añoPublicacion;
    private String isbn;
    private boolean prestado;

    public Libro(String titulo, Autor autor, int añoPublicacion, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.isbn = isbn;
        this.prestado = true;
    }

    public String mostrarInformacion() {
        return "Título: " + titulo + ", Autor: " + autor.getNombre() + ", Año: " + añoPublicacion + 
               ", ISBN: " + isbn + ", Prestado: " + (prestado ? "Sí" : "No");
    }

    public boolean esAntiguo() {
        return (2025 - añoPublicacion) > 20;
    }

    public String toString() {
        return mostrarInformacion();
    }

    public boolean esPrestado() {
        return prestado;
    }

    public void cambiarEstadoPrestamo() {
        this.prestado = !this.prestado;
    }
    
    public String getTitulo() {
    return titulo;
    }
}
