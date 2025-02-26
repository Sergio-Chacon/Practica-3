public class Main {
    public static void main(String[] args) {
        // Crear libros
        Libro libro1 = new Libro("Alice Adventures in Wonderland", "Lewis Carroll", 1865, "1164738");
        Libro libro2 = new Libro("Fahrenheit 451", "Ray Bradbury", 1953, "1164739");
        Libro libro3 = new Libro("Indigno de ser Humano", "Osamu Dazai", 1949, "1164740");

        // Crear biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Agregar libros a la biblioteca
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        // Mostrar todos los libros usando toString()
        System.out.println(biblioteca.toString());

        // Buscar un libro por título
        biblioteca.buscarLibroPorTitulo("Alice Adventures in Wonderland");

        // Verificar si un libro es antiguo
        System.out.println("¿Es antiguo? " + libro1.esAntiguo());

        // Buscar otro libro por título
        biblioteca.buscarLibroPorTitulo("Fahrenheit 451");

        // Verificar si otro libro es antiguo
        System.out.println("¿Es antiguo? " + libro2.esAntiguo());

        // Buscar otro libro por título
        biblioteca.buscarLibroPorTitulo("Indigno de ser Humano");

        // Verificar si otro libro es antiguo
        System.out.println("¿Es antiguo? " + libro3.esAntiguo());
    }
}