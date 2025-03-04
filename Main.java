public class Main {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Lewis Carroll", 1, "lewis@correo.com");
        Autor autor2 = new Autor("Ray Bradbury", 2, "ray@correo.com");
        Autor autor3 = new Autor("Osamu Dazai", 3, "osamu@correo.com");

        Libro libro1 = new Libro("Alice Adventures in Wonderland", autor1, 1865, "1164738");
        Libro libro2 = new Libro("Fahrenheit 451", autor2, 1953, "1164739");
        Libro libro3 = new Libro("Indigno de ser Humano", autor3, 1949, "1164740");

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        System.out.println("Libros en la biblioteca:");
        for (Libro libro : biblioteca.getLibros()) {
            System.out.println(libro.mostrarInformacion());
        }

        libro1.cambiarEstadoPrestamo();
        libro2.cambiarEstadoPrestamo();
        libro3.cambiarEstadoPrestamo();

        System.out.println("\nEstado actualizado de los libros:");
        for (Libro libro : biblioteca.getLibros()) {
            System.out.println(libro.mostrarInformacion());
        }

        System.out.println("\nLibros prestados:");
        for (Libro libro : biblioteca.getLibros()) {
            if (libro.esPrestado()) {
                System.out.println(libro.mostrarInformacion());
            }
        }

        System.out.println("\nLibros no prestados:");
        for (Libro libro : biblioteca.getLibros()) {
            if (!libro.esPrestado()) {
                System.out.println(libro.mostrarInformacion());
            }
        }

        System.out.println("\n¿Los libros son antiguos?");
        for (Libro libro : biblioteca.getLibros()) {
            System.out.println(libro.getTitulo() + ": " + (libro.esAntiguo() ? "Sí" : "No"));
        }
    }
}
