package com.manillas.celulares;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Registrar extends AppCompatActivity {
    private EditText txtMarca, txtModelo, txtColor, txtAndroid, txtRam, txtPrecio;
    private Celular c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);
        txtAndroid = findViewById(R.id.txtAndroid);
        txtMarca = findViewById(R.id.txtMarca);
        txtColor= findViewById(R.id.txtColor);
        txtModelo = findViewById(R.id.txtModelo);
        txtRam = findViewById(R.id.txtRam);
        txtPrecio = findViewById(R.id.txtPrecio);
    }

    public void guardar(View v){
        if (!txtMarca.getText().toString().isEmpty()){
            if (!txtModelo.getText().toString().isEmpty()){
                if (!txtAndroid.getText().toString().isEmpty()){
                    if (!txtPrecio.getText().toString().isEmpty()){
                        if(!txtColor.getText().toString().isEmpty()){
                            if (!txtRam.getText().toString().isEmpty()){
                                String marca = txtMarca.getText().toString(), modelo = txtModelo.getText().toString(),
                                        color = txtColor.getText().toString(), android = txtAndroid.getText().toString();
                                double ram = Double.parseDouble(txtRam.getText().toString());
                                int precio = Integer.parseInt(txtPrecio.getText().toString());
                                c = new Celular(marca, modelo, color, ram, precio, android);
                                c.guardar();
                                Toast.makeText(this, getResources().getText(R.string.exitoGuardar), Toast.LENGTH_SHORT).show();
                                borrar();
                            }
                        }
                    }
                }
            }
        }
    }

    public void limpiar(View v){
        borrar();
    }

    private void borrar(){
        txtRam.setText("");
        txtColor.setText("");
        txtPrecio.setText("");
        txtAndroid.setText("");
        txtMarca.setText("");
        txtModelo.setText("");
        txtMarca.requestFocus();
    }
}
