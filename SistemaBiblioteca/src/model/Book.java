package model;

public class Book {

    //Atributos ou seja,informações armazenadas
    private String title;
    private String author;

    //Construtor
    public Book(String title,String author){
        this.title = title;
        this.author = author;
    }


    //Métodos(Getters) acessar os valores armazenados nos atributos
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }


    //Métodos(Setters) servem para alterar os valores privados dos atributos
    public void setTitle(String title){
        this.title= title;
    }

    public void setAuthor(String author){
        this.author= author;
    }


}
