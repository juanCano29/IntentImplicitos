package com.example.juankno4.intentimplicitos;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
// que tipos de intent filter tienen en diferentes aplicaciones
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn1).setOnClickListener(this);
        findViewById(R.id.btn2).setOnClickListener(this);
        findViewById(R.id.btn3).setOnClickListener(this);
        findViewById(R.id.btn4).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1:
                  Intent it1 = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:8714609560"));
                  startActivity(it1);
                break;
            case R.id.btn2:
                  Intent it2 = new Intent(Intent.ACTION_CALL, Uri.parse("tel:8711361715"));
                  startActivity(it2);
                break;
            case R.id.btn3:
                  Intent it3 = new Intent(Intent.ACTION_VIEW,Uri.parse("https://github.com/Adolfo10/Practica5IntentImplicito/blob/master/app/src/main/res/layout/activity_main.xml"));
                  startActivity(it3);
                break;
            case R.id.btn4:
                Intent it4 = new Intent(Intent.ACTION_SEND);
                it4.putExtra("Mensaje","Juan cano");
                it4.setType("text/plain");
                // seleccionar cualquier aplicacion de lo que quiero enviar
                //aplicacion que reciba esa informacion
                startActivity(Intent.createChooser(it4,"Elija una aplicacion"));
                break;

        }

    }
}
