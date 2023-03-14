package com.example.aula4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String[] opcoes = new String[]{"Opcao 1","Opcao 2", "Opcao 3"};
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                                android.R.layout.simple_list_item_1,
                                opcoes);
        spinner.setAdapter(adapter);
    }
    
    public void floatButtonClick(View view){
        Toast.makeText(this, "Funcionou!!!", Toast.LENGTH_SHORT).show();
    }
    public void radioClick(View view){
        String textoRadio = ((RadioButton)view).getText().toString();
        if(((RadioButton)view).isChecked()){
            Toast.makeText(this, textoRadio, Toast.LENGTH_SHORT).show();
        }
    }
}