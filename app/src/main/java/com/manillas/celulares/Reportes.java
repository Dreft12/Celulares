package com.manillas.celulares;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

public class Reportes extends AppCompatActivity {
    private Spinner cmbRepor;
    private Intent in;
    private AlertDialog.Builder mensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reportes);
        cmbRepor = (Spinner) findViewById(R.id.cmbRepor);
        mensaje = new AlertDialog.Builder(this);
        mensaje.setTitle(getResources().getString(R.string.reporCuatro));
        mensaje.setPositiveButton(getResources().getText(R.string.ok), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface mensaje, int id) {

            }
        });
    }

    public void mostrar(View v){
        switch (cmbRepor.getSelectedItemPosition()){
            case 1:{
                in = new Intent(this,ListarReportes.class);
                in.putExtra("reporte", Metodos.reporteUno());
                startActivity(in);
                break;
            }
            case 2:{
                in = new Intent(this,ListarReportes.class);
                in.putExtra("reporte", Metodos.reporteDos());
                startActivity(in);
                break;
            }
            case 4:{
                mensaje.setMessage(getResources().getString(R.string.reporCuatroMensaje) + Metodos.reporteCuatro());
                mensaje.show();
                break;
            }
        }
    }
}
