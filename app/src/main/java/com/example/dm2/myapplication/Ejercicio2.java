package com.example.dm2.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Ejercicio2 extends AppCompatActivity {

    private int res,n1,n2;
    private EditText txt1,txt2;
    private Button b;
    private TextView lblResult;
    private String operador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2);

        lblResult=(TextView)findViewById(R.id.lblResult);

        lblResult.setText(this.getString(R.string.resultado));
        txt1=(EditText)findViewById(R.id.txtField1);
        txt2=(EditText)findViewById(R.id.txtField2);
    }

    public void Operar(View v){
        System.out.println("Dentro del metodo operar");
        n1=Integer.parseInt(txt1.getText().toString());
        n2=Integer.parseInt(txt2.getText().toString());

        b=(Button)findViewById(v.getId());
        operador =b.getText().toString();

        switch(operador)
        {
            case "+":
                res=n1+n2;
                break;
            case "-":
                res=n1-n2;
                break;
            case "*":
                res=n1*n2;
                break;
            case "/":
                res=n1/n2;
                break;
        }
        lblResult.setText(this.getString(R.string.resultado) + res);
    }
}
