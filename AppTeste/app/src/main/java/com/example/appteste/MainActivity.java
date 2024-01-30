package com.example.appteste;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private EditText editTextNome, editTextDisciplina,
            editTextNota;


    private Button buttonAdd, buttonGerar, buttonConsumir;


    private List<Estudante> lista;


    private TextView textViewResultado;


    private String retorno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNome = findViewById(R.id.editTextNome);
        editTextDisciplina = findViewById(R.id.editTextDisciplina);
        editTextNota = findViewById(R.id.editTextNota);
        textViewResultado = findViewById(R.id.textViewResultado);
        buttonAdd = findViewById(R.id.buttonAdd);
        buttonGerar = findViewById(R.id.buttonGerar);
        buttonConsumir = findViewById(R.id.buttonConsumir);


        lista = new ArrayList<>();
    }

    public void criarLista(View v) {


        lista.add(new Estudante(editTextNome.getText().toString(),
                editTextDisciplina.getText().toString(),
                Integer.parseInt(editTextNota.getText().toString())));


        Toast.makeText(MainActivity.this, "item inserido", Toast.LENGTH_SHORT)
                .show();


    }//


    public String criarJSON(List<Estudante> dados) {
        JSONArray jsonArray = new JSONArray();
        for (int i = 0; i < dados.size(); i++) {
            JSONObject jsonObject = new JSONObject();


            try {


                jsonObject.put("nomeEstudante", dados.get(i).getNome());
                jsonObject.put("disciplinaEstudante", dados.get(i).getDisciplina());
                jsonObject.put("notaEstudante", dados.get(i).getNota());
                jsonArray.put(jsonObject);


            } catch (JSONException e) {
                e.printStackTrace();
            }
        }//for


        return "{estudantes:" + jsonArray.toString() + "}";


    }///method






}//class


