package com.example.dm2.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Ejercicio1 extends AppCompatActivity {

    private int n1,n2,result;
    private Button btnSumar;
    private EditText txt1,txt2;
    private TextView lblResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio1);

        btnSumar =(Button)findViewById(R.id.btnSumar);
        txt1=(EditText)findViewById(R.id.txtField1);
        txt2=(EditText)findViewById(R.id.txtField2);
        lblResult=(TextView)findViewById(R.id.lblResult);

        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=Integer.parseInt(txt1.getText().toString());
                n2 = Integer.parseInt(txt2.getText().toString());
                System.out.println(n1);
                result=n1+n2;
                lblResult.setText("La suma es: " + result);
            }
        });

    }
}
