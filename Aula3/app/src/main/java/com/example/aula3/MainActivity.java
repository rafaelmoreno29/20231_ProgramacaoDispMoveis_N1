package com.example.aula3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editFim;
    AutoCompleteTextView autoCompletePaises;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editFim = (EditText) findViewById(R.id.editTextFim);
        autoCompletePaises = (AutoCompleteTextView)
                                findViewById(R.id.autoCompletePaises);

        String[] paises = getResources().getStringArray(R.array.paises_array);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                                    android.R.layout.simple_list_item_1,
                                    paises);
        autoCompletePaises.setAdapter(adapter);

        editFim.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                boolean retorno = false;
                if(i == EditorInfo.IME_ACTION_DONE){
                    retorno = true;
                    Toast.makeText(MainActivity.this, "FINALIZOU!!!",
                            Toast.LENGTH_SHORT).show();
                }
                return retorno;
            }
        });
    }
}