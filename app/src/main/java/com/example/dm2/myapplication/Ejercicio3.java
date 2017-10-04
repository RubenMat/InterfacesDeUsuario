package com.example.dm2.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class Ejercicio3 extends AppCompatActivity {

    Button btnEncender;
    Button btnApagar;
    RelativeLayout fondo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio3);

        btnEncender=(Button)findViewById(R.id.btnAmarillo);
        btnApagar=(Button)findViewById(R.id.btnGris);
        fondo = (RelativeLayout)findViewById(R.id.Principal);
        btnEncender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fondo.setBackgroundColor(getResources().getColor(R.color.fondoAmarillo));
            }
        });

        btnApagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fondo.setBackgroundColor(getResources().getColor(R.color.fondoGris));
            }
        });
    }
}
