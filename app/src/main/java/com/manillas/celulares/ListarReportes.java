package com.manillas.celulares;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class ListarReportes extends AppCompatActivity {
    private TableLayout tabla;
    private ArrayList<Celular> celulares;
    private AlertDialog.Builder mensaje;
    @SuppressLint({"DefaultLocale", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_reportes);
        mensaje = new AlertDialog.Builder(this);
        mensaje.setTitle(R.string.errorArrayVacio);
        mensaje.setMessage(R.string.errorArrayVacio2);
        mensaje.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });

        tabla = findViewById(R.id.tabla);
        celulares= (ArrayList<Celular>) getIntent().getSerializableExtra("reporte");
        if(celulares.size() == 0){
            mensaje.show();
        }else {
            for (int i = 0; i < celulares.size(); i++) {
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
                c5.setText(String.format("%.1f", celulares.get(i).getRam()));
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
}
