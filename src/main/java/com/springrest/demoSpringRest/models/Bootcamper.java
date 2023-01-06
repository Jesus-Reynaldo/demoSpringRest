package com.springrest.demoSpringRest.models;
//POJO -> Plain old java object
public class Bootcamper {
    private String nombre;
    private Double valor;
    public Bootcamper() { }
    public Bootcamper(String nombre) { this.nombre = nombre; this.valor =Math.random();}

    public Bootcamper(String nombre, Double valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) { this.nombre = nombre; }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
