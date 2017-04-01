package com.jrpascual.semana3c3;

/**
 * Created by Eversor on 30/03/2017.
 */

public class Mascota {
    private String nombre;
    private int contador;
    private int foto;

    public Mascota(String nombre,int foto,  int contador){
        this.nombre = nombre;
        this.foto = foto;
        this.contador = contador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
