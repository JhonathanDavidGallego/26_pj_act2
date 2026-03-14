package com.example;

public class Libro {

    private String titulo;
    private String autor;
    private int paginas;

    //Constructor vacio
    public Libro() {
        this.titulo = "Desconocido";
        this.autor = "Anonimo";
        this.paginas = 0;

    }

    //constructor con titulo y autor
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = 0;
    }

    //Constructor completo
    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    // Metodo mostrar detalles 
    public void mostrarDetalles() {
        System.out.println("Libro: " + titulo + " | Autor: " + autor + " | paginas: " + paginas);
    }
}
