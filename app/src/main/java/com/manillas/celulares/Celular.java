package com.manillas.celulares;

import java.io.Serializable;

public class Celular implements Serializable {
    private String marca;
    private String color;
    private String modelo;
    private double ram;
    private int precio;
    private String android;

    public Celular(String marca, String modelo, String color, double ram, int precio, String android) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.ram = ram;
        this.precio = precio;
        this.android = android;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRam() {
        return ram;
    }

    public void setRam(double ram) {
        this.ram = ram;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getAndroid() {
        return android;
    }

    public void setAndroid(String android) {
        this.android = android;
    }

    public void guardar(){
        Datos.guardar(this);
    }
}
