package com.manillas.celulares;

import java.io.Serializable;
import java.util.ArrayList;

public class Metodos implements Serializable{
    private static ArrayList<Celular> lista = Datos.mostrar();
    public static ArrayList<Celular> reporteUno(){
        ArrayList<Celular> temp = new ArrayList<>();
        for (int i = 0; i< lista.size(); i++){
            if (lista.get(i).getMarca().equalsIgnoreCase("Samsung") && lista.get(i).getColor().equalsIgnoreCase("Negro")){
                temp.add(lista.get(i));
            }
        }
        return temp;
    }
}
