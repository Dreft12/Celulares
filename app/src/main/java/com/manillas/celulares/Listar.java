package com.manillas.celulares;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.LinkedList;

public class Listar extends AppCompatActivity {
    private TableLayout tabla;
    private LinkedList<Celular> celulares;
    @SuppressLint({"DefaultLocale", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar);
        tabla = findViewById(R.id.tabla);
        celulares = Datos.mostrar();
        for (int i = 0; i < celulares.size(); i++){
            TableRow row = new TableRow(this);
            TextView c1 = new TextView(this);
            TextView c2 = new TextView(this);
            TextView c3 = new TextView(this);
            TextView c4 = new TextView(this);
            TextView c5 = new TextView(this);
            TextView c6 = new TextView(this);
            c1.setText(celulares.get(i).getMarca());
            c2.setText(celulares.get(i).getModelo());
            c3.setText(celulares.get(i).getColor());
            c4.setText(celulares.get(i).getAndroid());
            c5.setText(String.format("%.1f",celulares.get(i).getRam()));
            c6.setText(Integer.toString(celulares.get(i).getPrecio()));
            row.addView(c1);
            row.addView(c2);
            row.addView(c3);
            row.addView(c4);
            row.addView(c5);
            row.addView(c6);
            tabla.addView(row);
        }
    }
}
