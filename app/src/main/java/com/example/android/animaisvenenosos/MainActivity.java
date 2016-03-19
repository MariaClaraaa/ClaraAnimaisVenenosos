package com.example.android.animaisvenenosos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //métodos para acessar as telas dos animais

    public void irPraAguaViva(View view) {
        Intent intent = new Intent(this, AguaVivaActivity.class);
        startActivity(intent);
    }

    public void irPraCobra(View view) {
        Intent intent = new Intent(this, CobraActivity.class);
        startActivity(intent);
    }
    public void irPraCaracol(View view) {
        Intent intent = new Intent(this, CaracolActivity.class);
        startActivity(intent);
    }
    public void irProPolvo(View view) {
        Intent intent = new Intent(this, PolvoActivity.class);
        startActivity(intent);
    }
    public void irProScorpion(View view) {
        Intent intent = new Intent(this, ScorpionActivity.class);
        startActivity(intent);
    }
    public void irPraReferencia(View view) {
        Intent intent = new Intent(this, ReferenciasActivity.class);
        startActivity(intent);
    }
}
