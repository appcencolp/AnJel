package com.example.anjel;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.util.Timer;
import java.util.TimerTask;

import android.os.Bundle;

public class splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        TimerTask tarea = new  TimerTask(){
            @Override
            public void run() {
                Intent intent = new Intent(splash.this, bienvenido.class);
                startActivity(intent);
                finish();

            }
        };
        Timer tiempo = new Timer();
        tiempo.schedule(tarea, 4000);

    }
}