package basebiblioteca;

public class Biblioteca {
    public static void main(String[] args) {
        {

            // A esto se le llaman objetos
            Libro libroUno = new Libro("El Principito", "Antoine de Saint-Exupéry", 96, 1943);
            Libro libroDos = new Libro("Cien años de soledad", "Gabriel García Márquez", 417, 1967);


            System.out.println("Los datos del primer libro son: ");
            libroUno.mostrarLibros();

            System.out.println("\nLos datos del segundo libro son:  ");
            libroDos.mostrarLibros();

            libroDos.setTitulo("Mil años de soledad");
            System.out.println("\nNombre del libro dos modificado por:  " + libroDos.getTitulo());

        }
    }
}

