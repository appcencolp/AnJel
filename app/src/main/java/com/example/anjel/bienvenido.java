package com.example.anjel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class bienvenido extends AppCompatActivity {

    TextView logo2;
    TextView txtterminos;
    Button Continuar;
    CheckBox btx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenido);

        logo2 = findViewById(R.id.logo2);
        txtterminos = findViewById(R.id.txtterminos);
        txtterminos.setMovementMethod(new ScrollingMovementMethod());

        btx = findViewById(R.id.btx);
        Continuar = findViewById(R.id.Continuar);
        Continuar.setEnabled(false);

        btx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btx.isChecked() ==(true)){
                    Continuar.setEnabled(true);

                } else {
                    Continuar.setEnabled(false);
                }
            }
        });

        Continuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent continuar = new Intent(bienvenido.this,inicio_cuestionario.class);
                startActivity(continuar);
            }
        });


    }
}

