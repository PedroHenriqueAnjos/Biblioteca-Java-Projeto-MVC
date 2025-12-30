package model;

public class User {

        //Atributos
        private String name;
        private Integer id;

        //contador
        private static Integer nextId = 1;

        //construtor
        public User(String name){
            this.name = name;
            this.id = nextId;
            nextId++;
        }

        //getters
        public String getName(){
            return name;
        }
        public Integer getId(){
            return id;
        }
        //setters
        public void setName(String name){
            this.name= name;
        }

}
