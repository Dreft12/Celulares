package com.manillas.celulares;

import java.util.LinkedList;

public class Datos {
    private static LinkedList<Celular> lista = new LinkedList<>();

    public static void guardar(Celular c){
        lista.add(c);
    }

    public static LinkedList<Celular> mostrar(){
        return lista;
    }
}
