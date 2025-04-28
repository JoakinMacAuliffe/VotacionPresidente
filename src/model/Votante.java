package model;

public class Votante {

    int id;
    String nombre;
    boolean yaVoto;

    Votante(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }

    void marcarComoVotado(){
        yaVoto = true;
    }

}
