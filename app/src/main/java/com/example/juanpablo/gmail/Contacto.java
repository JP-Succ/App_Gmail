package com.example.juanpablo.gmail;

/**
 * Created by Juan Pablo on 21/08/2017.
 */

public class Contacto {



    public char incial_contacto;

    public String nombre_contacto;
    public String asunto;
    public String msj;


    //constructor
    public Contacto(String nombre_contacto, String asunto, String msj){

        this.nombre_contacto = nombre_contacto;
        this.asunto = asunto;
        this.msj = msj;
    }


    public char getIncial_contacto() {
        return incial_contacto;
    }

    public void setIncial_contacto(String nombre_contacto) {
        this.incial_contacto = nombre_contacto.charAt(0);
    }

    public String getNombre_contacto() {
        return nombre_contacto;
    }

    public void setNombre_contacto(String nombre_contacto) {
        this.nombre_contacto = nombre_contacto;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getMsj() {
        return msj;
    }

    public void setMsj(String msj) {
        this.msj = msj;
    }




}
