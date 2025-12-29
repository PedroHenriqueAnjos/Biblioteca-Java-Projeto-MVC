package service;

import java.util.ArrayList;
import model.User;
import model.Book;

public class Library {

    //Listas de dados
    private ArrayList<User> users;
    private ArrayList<Book> books;

    //construtores
    public Library(){
        users = new ArrayList<>();
        books = new ArrayList<>();
    }


    //metodo add
    public void addUser(String name){
       User user = new User(name);
       users.add(user);

    }

    //metodo listar
    public void listUser(){
        for (User user : users) {
            user.getName();
            user.getId();
            System.out.println("Usuario: " + user.getName() + "(" + user.getId() + ")");
        }

    }

    //================BOOKS==============
    //metodo add
    public void addBook(String title,String author){
        Book book = new Book(title,author);
        books.add(book);
    }

    //metodo listar
    public void listBook(){
        for (Book book : books){
            book.getTitle();
            book.getAuthor();
            System.out.println("Livro: " + book.getTitle() + " Autor: " + book.getAuthor());
        }
    }

}
