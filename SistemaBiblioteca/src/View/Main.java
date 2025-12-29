package View;

import service.Library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner  = new Scanner(System.in);
        Library service = new Library();

        System.out.println("====================================");
        System.out.println("        BIBLIOTECA JAVA");
        System.out.println("====================================");
        System.out.println("1 - Cadastrar Usuário");
        System.out.println("2 - Listar Usuários");
        System.out.println("3 - Cadastrar Livro");
        System.out.println("4 - Listar Livros");
        System.out.println("0 - Sair");
        System.out.println("====================================");
        System.out.print("Escolha uma opção: ");
        var userChoice = scanner.next();
        scanner.nextLine();

        while (!userChoice.equals("0")){
            switch (userChoice){
                case "1":
                    System.out.println("Digite o seu nome :");
                    String name = scanner.nextLine();
                    service.addUser(name);
                break;

                case "2":
                    System.out.println("Os usuários disponíveis são: ");
                    service.listUser();
                break;

                case "3":
                    System.out.println("Digite o nome do livro que deseja adicionar :");
                    String title = scanner.nextLine();
                    System.out.println("Digite o nome do autor desse livro :");
                    String author = scanner.nextLine();
                    service.addBook(title, author);
                break;

                case "4":
                    System.out.println("Os livros disponíveis são: ");
                    service.listBook();
                break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
            System.out.println("====================================");
            System.out.println("1 - Cadastrar Usuário");
            System.out.println("2 - Listar Usuários");
            System.out.println("3 - Cadastrar Livro");
            System.out.println("4 - Listar Livros");
            System.out.println("0 - Sair");
            System.out.println("====================================");
            System.out.print("Escolha uma opção: ");
            userChoice = scanner.next();
            scanner.nextLine();
        }


    }
}