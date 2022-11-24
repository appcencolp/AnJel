package com.example.anjel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class inicio_cuestionario extends AppCompatActivity {

    TextView logo3;
    TextView txt2;
    TextView txt3;
    Button btncomenzar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_cuestionario);

        logo3 = findViewById(R.id.logo3);
        txt2 = findViewById(R.id.txt2);
        txt3 = findViewById(R.id.txt3);
        btncomenzar = findViewById(R.id.btncomenzar);

        btncomenzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent comenzar = new Intent(inicio_cuestionario.this,cuestionario.class);
                startActivity(comenzar);
            }
        });

    }
}