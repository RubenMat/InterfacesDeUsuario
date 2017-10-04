package com.example.dm2.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.ToggleButton;

public class Ejercicio6 extends AppCompatActivity {

    private Switch switchCamara1, switchLuz1;
    private ToggleButton tglCamara, tglLuz;
    private ImageView imgCamara1, imgCamara2, imgLuz1, imgLuz2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio6);

        switchCamara1=(Switch)findViewById(R.id.switch1);
        switchLuz1=(Switch)findViewById(R.id.switch2);
        tglCamara=(ToggleButton)findViewById(R.id.tglCamara);
        tglLuz=(ToggleButton)findViewById(R.id.tglLuz);

        imgCamara1=(ImageView)findViewById(R.id.imgCamara1);
        imgCamara2=(ImageView)findViewById(R.id.imgCamara2);
        imgLuz1=(ImageView)findViewById(R.id.imgLuz1);
        imgLuz2=(ImageView)findViewById(R.id.imgLuz2);

        imgCamara1.setImageResource(R.drawable.camara);
        imgCamara2.setImageResource(R.drawable.camara);
        imgLuz1.setImageResource(R.drawable.apagada);
        imgLuz2.setImageResource(R.drawable.apagada);

        switchCamara1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switchCamara1.isChecked())
                    imgCamara1.setVisibility(View.VISIBLE);
                else
                    imgCamara1.setVisibility(View.INVISIBLE);
            }
        });

        tglCamara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tglCamara.isChecked())
                    imgCamara2.setVisibility(View.VISIBLE);
                else
                    imgCamara2.setVisibility(View.INVISIBLE);
            }
        });

        switchLuz1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switchLuz1.isChecked())
                    imgLuz1.setImageResource(R.drawable.encendida);
                else
                    imgLuz1.setImageResource(R.drawable.apagada);
            }
        });

        tglLuz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tglLuz.isChecked())
                    imgLuz2.setImageResource(R.drawable.encendida);
                else
                    imgLuz2.setImageResource(R.drawable.apagada);
            }
        });
    }
}
