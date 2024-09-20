package basebiblioteca;

public class Libro {
    String autor;
    int numeroPaginas;
    int ano;

    //Declarar un constructor + parametros del constructor  lo que esta enel parentensis son atributos
    //Los atributos se deben declarar con como las variables
    public Libro(String titulo, String autor, int numeroPaginas, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.ano = ano;
    }

    String titulo;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }


    //El método GET imprime (llamar) lo que esta guardado  (los metodos GET se deben declarar por cada variable)
    // El método SET (los metodos GET se deben declarar por cada variable)


//Mostar datos persona

    public void mostrarLibros() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Numero de páginas: " + numeroPaginas);
        System.out.println("Año: " + ano);


    }
}
