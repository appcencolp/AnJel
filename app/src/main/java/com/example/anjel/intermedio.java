package com.example.anjel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class intermedio extends AppCompatActivity {

    ImageView imageView5;
    TextView textView;
    Button btnSiguiente2;
    Button btnSiguiente3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intermedio);

        imageView5 = findViewById(R.id.imageView5);
        textView = findViewById(R.id.textView);
        btnSiguiente2 = findViewById(R.id.btnSiguiente2);
        btnSiguiente3 = findViewById(R.id.btnSiguiente3);

        btnSiguiente3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(intermedio.this, cuestionario.class);
                startActivity(i);
            }
        });

    }
}
