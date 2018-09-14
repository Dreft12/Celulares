package com.manillas.celulares;

import java.util.LinkedList;

public class Metodos {
    private LinkedList<Celular> lista = Datos.mostrar();
    public LinkedList<Celular> reporteUno(){
        LinkedList<Celular> temp = new LinkedList<>();
        for (int i = 0; i< lista.size(); i++){
            if (lista.get(i).getMarca().equalsIgnoreCase("Samsung") && lista.get(i).getColor().equalsIgnoreCase("Negro")){
                temp.add(lista.get(i));
            }
        }
        return lista;
    }
}
