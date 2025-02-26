import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;

    public Biblioteca() {
        libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void mostrarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
        } else {
            System.out.println("Libros en la biblioteca:");
            for (Libro libro : libros) {
                System.out.println(libro.mostrarInformacion());
            }
        }
    }

    public void buscarLibroPorTitulo(String titulo) {
        boolean encontrado = false;
        for (Libro libro : libros) {
            if (libro.mostrarInformacion().contains(titulo)) {
                System.out.println("Libro encontrado: " + libro.mostrarInformacion());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró el libro con título: " + titulo);
        }
    }

    // Método toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Biblioteca:\n");
        if (libros.isEmpty()) {
            sb.append("No hay libros en la biblioteca.\n");
        } else {
            for (Libro libro : libros) {
                sb.append(libro.toString()).append("\n");
            }
        }
        return sb.toString();
    }
}