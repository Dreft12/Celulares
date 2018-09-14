package com.manillas.celulares;

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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reportes);
        cmbRepor = (Spinner) findViewById(R.id.cmbRepor);
    }

    public void mostrar(View v){
        switch (cmbRepor.getSelectedItemPosition()){
            case 1:{
                in = new Intent(this,ListarReportes.class);
                in.putExtra("reporte", Metodos.reporteUno());
                startActivity(in);
                break;
            }
        }
    }

}
