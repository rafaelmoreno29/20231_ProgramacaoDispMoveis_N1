package com.example.aula1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("onCreate","Entrou no método onCreate");

        textHello = (TextView) findViewById(R.id.textHello);
        textHello.setText("Olá, Rafael Moreno");

        AutoCompleteTextView textView = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        String[] countries = getResources().getStringArray(R.array.paises_array);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, countries);
        textView.setAdapter(adapter);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("onStart","Entrou no método onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("onResume","Entrou no método onResume");

    }
    public void btnCalcularClick(View v){
        Toast.makeText(this, "CLICK!!!", Toast.LENGTH_SHORT).show();
    }
}