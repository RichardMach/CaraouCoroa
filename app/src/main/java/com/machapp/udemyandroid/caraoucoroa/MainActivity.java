package com.machapp.udemyandroid.caraoucoroa;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView botaoJogar;
    private String[] moedaopcao ={"cara","coroa"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botaoJogar = (ImageView) findViewById(R.id.botaoJogar);

        botaoJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this,DetalheActivity.class);

                Random aleatorio = new Random();
                int numero = aleatorio.nextInt(moedaopcao.length);

                in.putExtra("moeda",moedaopcao[numero]);
                startActivity(in);
            }
        });
    }
}
