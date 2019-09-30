package com.lex.alcon.alejandro.lex.clase2fs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText txtvName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtvName=findViewById(R.id.editTextName);

    }
    public void enviar(View view)
    {
        String nombre=txtvName.getText().toString().trim();
        Intent intent=new Intent(this,SegundaActivity.class);
        intent.putExtra("Name",nombre);
        startActivity(intent);
    }
}
