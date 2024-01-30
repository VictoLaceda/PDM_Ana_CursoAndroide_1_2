package com.example.appteste;

import static android.app.ProgressDialog.show;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;

public class Segunda extends AppCompatActivity {
    private String dadosJSON;
    private ListView listView;
    private List<Estudante> lista;
    private ArrayAdapter<Estudante> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        dadosJSON = getIntent().getStringExtra("dados");
        Toast.makeText(Segunda.this),dadosJSON, Toast.LENGTH_LONG).show();
        listView = findViewById(R.id.listaViewDados);
        lista = consumirJSON();
        adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,
                lista);
        listView.setAdapter(adapter);


    }//method


    private List<Estudante> consumirJSON(){
        List<Estudante> listaEstudantes = null;


        if(dadosJSON!=null){
            listaEstudantes = new ArrayList<>();
            try {
                JSONArray jsonObject = null;
                JSONArray jsonArray = jsonObject.getJSONArray("estudantes");




            } catch (JSONException e) {
                e.printStackTrace();
            }//try






        }//if


    }//










}//
