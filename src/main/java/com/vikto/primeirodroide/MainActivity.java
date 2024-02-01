package com.vikto.primeirodroide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textViewhello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this,"on",Toast.LENGTH_LONG).show();
        textViewhello=findViewById(R.id.goku);
        // FIND VIEW ID - pegar o componente da view do Android pelo id e colocar em uma variável no Java
        // R.ID.nome escrito no Android dois pontos ID

        Toast.makeText(MainActivity.this,"OnCreate",Toast.LENGTH_LONG).show();
        //
    }



    public void chamarTela(View v){
        // CHAMAR TELA METODO VIEW -
        Intent it = new Intent(MainActivity.this, Segunda.class);
        // INTENT -
        // .THIS -
        // .CLASS -
        startActivity(it);
        //
    }




    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(MainActivity.this,"OnStart",Toast.LENGTH_LONG).show();
        //
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(MainActivity.this,"OnResume",Toast.LENGTH_LONG).show();
        //
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(MainActivity.this,"OnPause",Toast.LENGTH_LONG).show();
        //
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(MainActivity.this,"OnStop",Toast.LENGTH_LONG).show();
        //
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(MainActivity.this,"OnDestroy",Toast.LENGTH_LONG).show();
        //
    }
}