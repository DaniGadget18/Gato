package com.example.danielrdz.gato;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class segundo extends AppCompatActivity implements View.OnClickListener {


    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9, btnsalir, btnvolver;
    int turno, contador;
    String letra;
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
        ganador = findViewById(R.id.ganador);
        btnsalir = findViewById(R.id.Salirapp);
        btnvolver = findViewById(R.id.reset);


        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnsalir.setOnClickListener(this);
        btnvolver.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.reset){
            ganador.setEnabled(true);
            ganador.setText("");
            btn1.setEnabled(true);
            btn1.setText("");
            btn2.setEnabled(true);
            btn2.setText("");
            btn3.setEnabled(true);
            btn3.setText("");
            btn4.setEnabled(true);
            btn4.setText("");
            btn5.setEnabled(true);
            btn5.setText("");
            btn6.setEnabled(true);
            btn6.setText("");
            btn7.setEnabled(true);
            btn7.setText("");
            btn8.setEnabled(true);
            btn8.setText("");
            btn9.setEnabled(true);
            btn9.setText("");
        }
        if (v.getId() == R.id.Salirapp){
            System.exit(0);
        }

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
        else if (v.getId()==R.id.boton9){
            btn9.setText(letra+"");
            btn9.setEnabled(false);
        }

        ganador(letra);



    }

    public void ganador (char letra){
        if (btn1.getText().toString().equals(letra+"")&btn2.getText().toString().equals(letra+"")&btn3.getText().toString().equals(letra+"")){
            ganador.setText("El ganador es: "+letra);
            ganador.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
        }
        else if(btn4.getText().toString().equals(letra+"")&btn5.getText().toString().equals(letra+"")&btn6.getText().toString().equals(letra+"")){
            ganador.setText("El ganador es: "+letra);
            ganador.setEnabled(false);
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
        }
        else if(btn7.getText().toString().equals(letra+"")&btn8.getText().toString().equals(letra+"")&btn9.getText().toString().equals(letra+"")){
            ganador.setText("El ganador es: "+letra);
            ganador.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
        }
        else if(btn1.getText().toString().equals(letra+"")&btn5.getText().toString().equals(letra+"")&btn9.getText().toString().equals(letra+"")){
            ganador.setText("El ganador es: "+letra);
            ganador.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
        }
        else if(btn3.getText().toString().equals(letra+"")&btn5.getText().toString().equals(letra+"")&btn7.getText().toString().equals(letra+"")){
            ganador.setText("El ganador es: "+letra);
            ganador.setEnabled(false);
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn4.setEnabled(false);
            btn6.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
        }
        else if(btn1.getText().toString().equals(letra+"")&btn4.getText().toString().equals(letra+"")&btn7.getText().toString().equals(letra+"")){
            ganador.setText("El ganador es: "+letra);
            ganador.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
        }
        else if(btn2.getText().toString().equals(letra+"")&btn5.getText().toString().equals(letra+"")&btn8.getText().toString().equals(letra+"")){
            ganador.setText("El ganador es: "+letra);
            ganador.setEnabled(false);
            btn1.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn9.setEnabled(false);
        }
        else if(btn3.getText().toString().equals(letra+"")&btn6.getText().toString().equals(letra+"")&btn9.getText().toString().equals(letra+"")){
            ganador.setText("El ganador es: "+letra);
            ganador.setEnabled(false);
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
        }
    }
}
