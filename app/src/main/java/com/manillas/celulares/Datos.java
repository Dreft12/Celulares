package com.manillas.celulares;

import java.io.Serializable;
import java.util.ArrayList;

public class Datos implements Serializable {
    private static ArrayList<Celular> lista = new ArrayList<>();

    public static void guardar(Celular c){
        lista.add(c);
    }

    public static ArrayList<Celular> mostrar(){
        return lista;
    }
}
