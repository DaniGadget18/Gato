package com.example.danielrdz.gato;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class segundo extends AppCompatActivity implements View.OnClickListener {


    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    int turno, contador;
    EditText ganador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_segundo);
        btn1 = findViewById(R.id.boton1);
        btn2 = findViewById(R.id.boton2);
        btn3 = findViewById(R.id.boton3);
        btn4 = findViewById(R.id.boton4);
        btn5 = findViewById(R.id.boton5);
        btn6 = findViewById(R.id.boton6);
        btn7 = findViewById(R.id.boton7);
        btn8 = findViewById(R.id.boton8);
        btn9 = findViewById(R.id.boton9);


        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        contador++;
        turno = contador%2;

        if (turno==1){
            imprimirXO('x',v);
        }

        else{
            imprimirXO('O',v);
        }

    }

    public void imprimirXO(char letra, View v){
        if (v.getId()== R.id.boton1){
            btn1.setText(letra+"");
            btn1.setEnabled(false);
        }
        else if (v.getId()==R.id.boton2){
            btn2.setText(letra+"");
            btn2.setEnabled(false);
        }
        else if (v.getId()==R.id.boton3){
            btn3.setText(letra+"");
            btn3.setEnabled(false);
        }
        else if (v.getId()==R.id.boton4){
            btn4.setText(letra+"");
            btn4.setEnabled(false);
        }
        else if (v.getId()==R.id.boton5){
            btn5.setText(letra+"");
            btn5.setEnabled(false);
        }
        else if (v.getId()==R.id.boton6){
            btn6.setText(letra+"");
            btn6.setEnabled(false);
        }
        else if (v.getId()==R.id.boton7){
            btn7.setText(letra+"");
            btn7.setEnabled(false);
        }
        else if (v.getId()==R.id.boton8){
            btn8.setText(letra+"");
            btn8.setEnabled(false);
        }
        else{
            btn9.setText(letra+"");
            btn9.setEnabled(false);
        }

    }
}
