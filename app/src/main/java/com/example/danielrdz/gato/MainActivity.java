package com.example.danielrdz.gato;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button jugar;
    TextView tempo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jugar = findViewById(R.id.jugar);
        tempo = findViewById(R.id.temporizador);

        jugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                new CountDownTimer(10000, 1000)
                {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        tempo.setText("El juego comienza en: " + millisUntilFinished / 1000);
                    }
                    @Override
                    public void onFinish() {
                        Intent segunda = new Intent(v.getContext(), segundo.class);
                        startActivityForResult(segunda, 0);
                        finish();
                    }
                }.start();
            }
        });
    }
}
