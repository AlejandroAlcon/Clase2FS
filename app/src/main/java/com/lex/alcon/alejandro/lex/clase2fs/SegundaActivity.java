package com.lex.alcon.alejandro.lex.clase2fs;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    TextView txtvWe,txtvRes;
    EditText etxtNum1,etxtNum2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        txtvWe=findViewById(R.id.textViewWelcome);
        txtvRes=findViewById(R.id.textViewRes);

        etxtNum1=findViewById(R.id.editTextNum1);
        etxtNum2=findViewById(R.id.editTextNum2);

        String Nombre=getIntent().getExtras().getString("Name");
        txtvWe.setText("Bienvenido "+Nombre);
    }
    public void sumar(View view)
    {
        int a=0,b=0;
        String a1,b1;
        a1=etxtNum1.getText().toString().trim();
        b1=etxtNum2.getText().toString().trim();

        a=Integer.parseInt(a1);
        b=Integer.parseInt(b1);

        a=a+b;
        //a1=String.valueOf(a);
        txtvRes.setText(a+"");

    }
}
