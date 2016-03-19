package com.example.android.animaisvenenosos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ScorpionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scorpion);
    }

    /**Método para mostrar ou esconder o o texto sobre o animal venenoso
     * se a caixa de texto estiver vazia, eu mostro, se tiver cheia, eu escondo
     */

    public void mostrarTexto(View view){
        TextView vida = (TextView) findViewById(R.id.texto_scorpion);
        if(vida.getText().equals("")){
            vida.setText(R.string.DeathStalkerScorpion);
        }else{
            vida.setText("");
        }
    }
}
