package com.machapp.udemyandroid.caraoucoroa;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class DetalheActivity extends AppCompatActivity {

    private ImageView botaoJogar;
    private ImageView imageMoeda;
    private String moeda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);
        botaoJogar = (ImageView) findViewById(R.id.botaoVoltar);
        imageMoeda = (ImageView) findViewById(R.id.imageMoeda);


        Bundle extra = getIntent().getExtras();
        if( extra!= null ) {

            moeda = extra.getString("moeda");

            if( moeda.equals("cara")){
                imageMoeda.setImageDrawable( ContextCompat.getDrawable(this,R.drawable.moeda_cara ));
            }else {
                imageMoeda.setImageDrawable( ContextCompat.getDrawable(this,R.drawable.moeda_coroa ));
            }
        }else {
            Toast.makeText(this,"ERRO Zé Mané",Toast.LENGTH_LONG);
        }


        botaoJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //finish();
                startActivity( new Intent(DetalheActivity.this,MainActivity.class) );
            }
        });
    }
}
