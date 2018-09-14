package com.manillas.celulares;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Principal extends AppCompatActivity {
    private ListView lv;
    private Intent in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        lv = findViewById(R.id.lstPrincipal);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0: {
                        in = new Intent(Principal.this, Registrar.class);
                        startActivity(in);
                        break;
                    }
                    case 1: {
                        in = new Intent(Principal.this, Listar.class);
                        startActivity(in);
                        break;
                    }
                    case 2: {
                        in = new Intent(Principal.this, Reportes.class);
                        startActivity(in);
                        break;
                    }
                }
            }
        });
    }
}
