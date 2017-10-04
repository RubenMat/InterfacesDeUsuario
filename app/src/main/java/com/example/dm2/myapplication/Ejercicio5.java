package com.example.dm2.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Ejercicio5 extends AppCompatActivity implements View.OnClickListener {

    private ImageView imagen;
    private Button btn1,btn2,btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio5);



        imagen=(ImageView)findViewById(R.id.logo);
        btn1=(Button)findViewById(R.id.btnYahoo);
        btn2=(Button)findViewById(R.id.btnBing);
        btn3=(Button)findViewById(R.id.btnGoogle);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imagen.setImageResource(R.drawable.yahoo);
            }
        });
        btn2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        imagen.setImageResource(R.drawable.bing);
    }

    public void imagenGoogle(View v) {
        imagen.setImageResource(R.drawable.google);

    }
}
