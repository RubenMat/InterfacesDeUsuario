package com.example.dm2.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Ejercicio4 extends AppCompatActivity {

    Button btn1;
    EditText txtLetra, txtNumeros;
    char[] letras ={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio4);

        btn1=(Button)findViewById(R.id.btnValidar);
        txtLetra=(EditText)findViewById(R.id.letra);
        txtNumeros=(EditText)findViewById(R.id.numeros);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                long numeros = Long.parseLong(txtNumeros.getText().toString());

               int indice = (int)numeros%23;
                txtLetra.setText(letras[indice]+"");
            }
        });
    }
}
