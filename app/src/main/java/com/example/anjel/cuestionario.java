package com.example.anjel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class cuestionario extends AppCompatActivity {

    TextView tv1,tv2;
    RadioGroup grupoRadiospreguntas;
    RadioButton rbP1,rbP2,rbP3,rbP4;
    Button btnSiguiente;
    int contadorPregunta = 1;
    int notaFinal = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuestionario);
        tv1 = findViewById(R.id.tv1);

        rbP1 = findViewById(R.id.rbP1);
        rbP2 = findViewById(R.id.rbP2);
        rbP3 = findViewById(R.id.rbP3);
        rbP4 = findViewById(R.id.rbP4);
        grupoRadiospreguntas = findViewById(R.id.grupoRadiospreguntas);
        btnSiguiente = findViewById(R.id.btnSiguiente);



        tv1.setText("A continuación, señale cuál de las afirmaciones de cada grupo describe mejor cómo se ha sentido durante esta última semana, incluido el día de hoy");
        rbP1.setText("No me siento triste");
        rbP2.setText("Me siento triste");
        rbP3.setText("Me siento triste continuamente y no puedo dejar de estarlo");
        rbP4.setText("Me siento tan triste o tan desgraciado que no puedo soportarlo");

        btnSiguiente.setEnabled(false);


        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                evaluarRespuestas();
                contadorPregunta++;
                imprimirPreguntas();
            }
        });
    }

    public void onRadioButtonClicked(View view) {
        if (rbP1.isChecked()|| rbP2.isChecked()||rbP3.isChecked()||rbP4.isChecked()){
            btnSiguiente.setEnabled(true);
        }
    }

    public void evaluarRespuestas(){
        if (contadorPregunta==1) {
            if (rbP2.isChecked()) {
                notaFinal += 1;
            }
            if (rbP3.isChecked()) {
                notaFinal += 2;
            }
            if (rbP4.isChecked()) {
                notaFinal += 3;
            }
        }
        if (contadorPregunta==2) {
            if (rbP2.isChecked()) {
                notaFinal += 1;
            }
            if (rbP3.isChecked()) {
                notaFinal += 2;
            }
            if (rbP4.isChecked()) {
                notaFinal += 3;
            }
        }
        if (contadorPregunta==3) {
            if (rbP2.isChecked()) {
                notaFinal += 1;
            }
            if (rbP3.isChecked()) {
                notaFinal += 2;
            }
            if (rbP4.isChecked()) {
                notaFinal += 3;
            }
        }
        if (contadorPregunta==4) {
            if (rbP2.isChecked()) {
                notaFinal += 1;
            }
            if (rbP3.isChecked()) {
                notaFinal += 2;
            }
            if (rbP4.isChecked()) {
                notaFinal += 3;
            }
        }
        if (contadorPregunta==5) {
            if (rbP2.isChecked()) {
                notaFinal += 1;
            }
            if (rbP3.isChecked()) {
                notaFinal += 2;
            }
            if (rbP4.isChecked()) {
                notaFinal += 3;
            }
        }
        if (contadorPregunta==6) {
            if (rbP2.isChecked()) {
                notaFinal += 1;
            }
            if (rbP3.isChecked()) {
                notaFinal += 2;
            }
            if (rbP4.isChecked()) {
                notaFinal += 3;
            }
        }
        if (contadorPregunta==7) {
            if (rbP2.isChecked()) {
                notaFinal += 1;
            }
            if (rbP3.isChecked()) {
                notaFinal += 2;
            }
            if (rbP4.isChecked()) {
                notaFinal += 3;
            }
        }
        if (contadorPregunta==8) {
            if (rbP2.isChecked()) {
                notaFinal += 1;
            }
            if (rbP3.isChecked()) {
                notaFinal += 2;
            }
            if (rbP4.isChecked()) {
                notaFinal += 3;
            }
        }
        if (contadorPregunta==9) {
            if (rbP2.isChecked()) {
                notaFinal += 1;
            }
            if (rbP3.isChecked()) {
                notaFinal += 2;
            }
            if (rbP4.isChecked()) {
                notaFinal += 3;
            }
        }
        if (contadorPregunta==10) {
            if (rbP2.isChecked()) {
                notaFinal += 1;
            }
            if (rbP3.isChecked()) {
                notaFinal += 2;
            }
            if (rbP4.isChecked()) {
                notaFinal += 3;
            }
        }
        if (contadorPregunta==11) {
            if (rbP2.isChecked()) {
                notaFinal += 1;
            }
            if (rbP3.isChecked()) {
                notaFinal += 2;
            }
            if (rbP4.isChecked()) {
                notaFinal += 3;
            }
        }
        if (contadorPregunta==12) {
            if (rbP2.isChecked()) {
                notaFinal += 1;
            }
            if (rbP3.isChecked()) {
                notaFinal += 2;
            }
            if (rbP4.isChecked()) {
                notaFinal += 3;
            }
        }
        if (contadorPregunta==13) {
            if (rbP2.isChecked()) {
                notaFinal += 1;
            }
            if (rbP3.isChecked()) {
                notaFinal += 2;
            }
            if (rbP4.isChecked()) {
                notaFinal += 3;
            }
        }
        if (contadorPregunta==14) {
            if (rbP2.isChecked()) {
                notaFinal += 1;
            }
            if (rbP3.isChecked()) {
                notaFinal += 2;
            }
            if (rbP4.isChecked()) {
                notaFinal += 3;
            }
        }
        if (contadorPregunta==15) {
            if (rbP2.isChecked()) {
                notaFinal += 1;
            }
            if (rbP3.isChecked()) {
                notaFinal += 2;
            }
            if (rbP4.isChecked()) {
                notaFinal += 3;
            }
        }
        if (contadorPregunta==16) {
            if (rbP2.isChecked()) {
                notaFinal += 1;
            }
            if (rbP3.isChecked()) {
                notaFinal += 2;
            }
            if (rbP4.isChecked()) {
                notaFinal += 3;
            }
        }
        if (contadorPregunta==17) {
            if (rbP2.isChecked()) {
                notaFinal += 1;
            }
            if (rbP3.isChecked()) {
                notaFinal += 2;
            }
            if (rbP4.isChecked()) {
                notaFinal += 3;
            }
        }
        if (contadorPregunta==18) {
            if (rbP2.isChecked()) {
                notaFinal += 1;
            }
            if (rbP3.isChecked()) {
                notaFinal += 2;
            }
            if (rbP4.isChecked()) {
                notaFinal += 3;
            }
        }
        if (contadorPregunta==19) {
            if (rbP2.isChecked()) {
                notaFinal += 1;
            }
            if (rbP3.isChecked()) {
                notaFinal += 2;
            }
            if (rbP4.isChecked()) {
                notaFinal += 3;
            }
        }
        if (contadorPregunta==20) {
            if (rbP2.isChecked()) {
                notaFinal += 1;
            }
            if (rbP3.isChecked()) {
                notaFinal += 2;
            }
            if (rbP4.isChecked()) {
                notaFinal += 3;
            }
        }
        if (contadorPregunta==21) {
            if (rbP2.isChecked()) {
                notaFinal += 1;
            }
            if (rbP3.isChecked()) {
                notaFinal += 2;
            }
            if (rbP4.isChecked()) {
                notaFinal += 3;
            }
        }
    }

    public void imprimirPreguntas(){
        if (contadorPregunta==2){
            grupoRadiospreguntas.clearCheck();
            tv1.setText("A continuación, señale cuál de las afirmaciones de cada grupo describe mejor cómo se ha sentido durante esta última semana, incluido el día de hoy");

            rbP1.setText("No estoy desalentado respecto de mi futuro");
            rbP2.setText("Me siento más desalentado respecto de mi futuro que lo que solía estarlo");
            rbP3.setText("No espero que las cosas funcionen para mí");
            rbP4.setText("Siento que no hay esperanza para mi futuro y que sólo puede empeorar");
            btnSiguiente.setEnabled(false);
        }
        if (contadorPregunta==3){
            grupoRadiospreguntas.clearCheck();
            tv1.setText("A continuación, señale cuál de las afirmaciones de cada grupo describe mejor cómo se ha sentido durante esta última semana, incluido el día de hoy");
            rbP1.setText("No me siento como un fracasado");
            rbP2.setText("He fracasado más de lo que hubiera debido");
            rbP3.setText("Cuando miro hacia atrás veo muchos fracasos");
            rbP4.setText("Siento que como persona soy un fracaso total");
            btnSiguiente.setEnabled(false);
        }
        if (contadorPregunta==4){
            grupoRadiospreguntas.clearCheck();
            tv1.setText("A continuación, señale cuál de las afirmaciones de cada grupo describe mejor cómo se ha sentido durante esta última semana, incluido el día de hoy");
            rbP1.setText("Obtengo tanto placer como siempre por las cosas de las que disfruto");
            rbP2.setText("No disfruto tanto de las cosas como solía hacerlo");
            rbP3.setText("Obtengo muy poco placer de las cosas de las que solía disfrutar");
            rbP4.setText("No puedo obtener ningún placer de las cosas de las que solía disfrutar");
            btnSiguiente.setEnabled(false);
        }
        if (contadorPregunta==5){
            grupoRadiospreguntas.clearCheck();
            tv1.setText("A continuación, señale cuál de las afirmaciones de cada grupo describe mejor cómo se ha sentido durante esta última semana, incluido el día de hoy");
            rbP1.setText("No me siento particularmente culpable");
            rbP2.setText("Me siento culpable respecto de varias cosas que he hecho o que debería haber hecho");
            rbP3.setText("Me siento bastante culpable la mayor parte del tiempo");
            rbP4.setText("Me siento culpable todo el tiempo");
            btnSiguiente.setEnabled(false);
        }
        if (contadorPregunta==6){
            grupoRadiospreguntas.clearCheck();
            tv1.setText("A continuación, señale cuál de las afirmaciones de cada grupo describe mejor cómo se ha sentido durante esta última semana, incluido el día de hoy");
            rbP1.setText("No siento que estoy siendo castigado");
            rbP2.setText("Siento que tal vez pueda ser castigado");
            rbP3.setText("Espero ser castigado");
            rbP4.setText("Siento que estoy siendo castigado");
            btnSiguiente.setEnabled(false);
        }
        if (contadorPregunta==7){
            grupoRadiospreguntas.clearCheck();
            tv1.setText("A continuación, señale cuál de las afirmaciones de cada grupo describe mejor cómo se ha sentido durante esta última semana, incluido el día de hoy");
            rbP1.setText("Siento acerca de mí lo mismo que siempre");
            rbP2.setText("He perdido la confianza en mí mismo");
            rbP3.setText("Estoy decepcionado conmigo mismo");
            rbP4.setText("No me gusto a mí mismo");
            btnSiguiente.setEnabled(false);
        }
        if (contadorPregunta==8){
            grupoRadiospreguntas.clearCheck();
            tv1.setText("A continuación, señale cuál de las afirmaciones de cada grupo describe mejor cómo se ha sentido durante esta última semana, incluido el día de hoy");
            rbP1.setText("No me critico ni me culpo más de lo habitual");
            rbP2.setText("Estoy más crítico conmigo mismo de lo que solía estarlo");
            rbP3.setText("Me critico a mí mismo por todos mis errores");
            rbP4.setText("Me culpo a mí mismo por todo lo malo que sucede");
            btnSiguiente.setEnabled(false);
        }
        if (contadorPregunta==9){
            grupoRadiospreguntas.clearCheck();
            tv1.setText("A continuación, señale cuál de las afirmaciones de cada grupo describe mejor cómo se ha sentido durante esta última semana, incluido el día de hoy");
            rbP1.setText("No tengo ningún pensamiento de matarme");
            rbP2.setText("He tenido pensamientos de matarme, pero no lo haría");
            rbP3.setText("Querría matarme");
            rbP4.setText("Me mataría si tuviera la oportunidad de hacerlo");
            btnSiguiente.setEnabled(false);
        }
        if (contadorPregunta==10){
            grupoRadiospreguntas.clearCheck();
            tv1.setText("A continuación, señale cuál de las afirmaciones de cada grupo describe mejor cómo se ha sentido durante esta última semana, incluido el día de hoy");
            rbP1.setText("No lloro más de lo que solía hacerlo");
            rbP2.setText("Lloro más de lo que solía hacerlo");
            rbP3.setText("Lloro por cualquier pequeñez");
            rbP4.setText("Siento ganas de llorar pero no puedo");
            btnSiguiente.setEnabled(false);
        }
        if (contadorPregunta==11){
            grupoRadiospreguntas.clearCheck();
            tv1.setText("A continuación, señale cuál de las afirmaciones de cada grupo describe mejor cómo se ha sentido durante esta última semana, incluido el día de hoy");
            rbP1.setText("No estoy más inquieto o tenso que lo habitual");
            rbP2.setText("Me siento más inquieto o tenso que lo habitual");
            rbP3.setText("Estoy tan inquieto o agitado que me es difícil quedarme quieto");
            rbP4.setText("Estoy tan inquieto o agitado que tengo que estar siempre en movimiento o haciendo algo");
            btnSiguiente.setEnabled(false);
        }
        if (contadorPregunta==12){
            grupoRadiospreguntas.clearCheck();
            tv1.setText("A continuación, señale cuál de las afirmaciones de cada grupo describe mejor cómo se ha sentido durante esta última semana, incluido el día de hoy");
            rbP1.setText(" No he perdido el interés en otras actividades o personas");
            rbP2.setText("Estoy menos interesado que antes en otras personas o cosas");
            rbP3.setText("He perdido casi todo el interés en otras personas o cosas");
            rbP4.setText("Me es difícil interesarme por algo");
            btnSiguiente.setEnabled(false);
        }
        if (contadorPregunta==13){
            grupoRadiospreguntas.clearCheck();
            tv1.setText("A continuación, señale cuál de las afirmaciones de cada grupo describe mejor cómo se ha sentido durante esta última semana, incluido el día de hoy");
            rbP1.setText("Tomo mis decisiones tan bien como siempre");
            rbP2.setText("Me resulta más difícil que de costumbre tomar decisiones");
            rbP3.setText("Encuentro mucha más dificultad que antes para tomar decisiones");
            rbP4.setText("Tengo problemas para tomar cualquier decisión");
            btnSiguiente.setEnabled(false);
        }
        if (contadorPregunta==14){
            grupoRadiospreguntas.clearCheck();
            tv1.setText("A continuación, señale cuál de las afirmaciones de cada grupo describe mejor cómo se ha sentido durante esta última semana, incluido el día de hoy");
            rbP1.setText("No siento que yo no sea valioso");
            rbP2.setText("No me considero a mí mismo tan valioso útil como solía considerarme");
            rbP3.setText("Me siento menos valioso cuando me comparocon otros");
            rbP4.setText("Siento que no valgo nada");
            btnSiguiente.setEnabled(false);
        }
        if (contadorPregunta==15){
            grupoRadiospreguntas.clearCheck();
            tv1.setText("A continuación, señale cuál de las afirmaciones de cada grupo describe mejor cómo se ha sentido durante esta última semana, incluido el día de hoy");
            rbP1.setText("Tengo tanta energía como siempre");
            rbP2.setText("Tengo menos energía que la que solía tener");
            rbP3.setText("No tengo suficiente energía para hacer demasiado");
            rbP4.setText("No tengo energía suficiente para hacer nada");
            btnSiguiente.setEnabled(false);
        }
        if (contadorPregunta==16){
            grupoRadiospreguntas.clearCheck();
            tv1.setText("A continuación, señale cuál de las afirmaciones de cada grupo describe mejor cómo se ha sentido durante esta última semana, incluido el día de hoy");
            rbP1.setText("No he experimentado ningún cambio en mis hábitos de sueño");
            rbP2.setText("Duermo un poco más de lo habitual \nDuermo un poco menos que lo habitual");
            rbP3.setText("Duermo mucho más de lo habitual \nDuermo mucho menos que lo habitual");
            rbP4.setText("Duermo la mayor parte del día \nMe despierto 1-2 horas más temprano y no puedo volver a dormirme");
            btnSiguiente.setEnabled(false);
        }
        if (contadorPregunta==17){
            grupoRadiospreguntas.clearCheck();
            tv1.setText("A continuación, señale cuál de las afirmaciones de cada grupo describe mejor cómo se ha sentido durante esta última semana, incluido el día de hoy");
            rbP1.setText("No estoy más irritable que lo habitual");
            rbP2.setText("Estoy más irritable que lo habitual");
            rbP3.setText("Estoy mucho más irritable que lo habitual");
            rbP4.setText("Estoy irritable todo el tiempo");
            btnSiguiente.setEnabled(false);
        }
        if (contadorPregunta==18){
            grupoRadiospreguntas.clearCheck();
            tv1.setText("A continuación, señale cuál de las afirmaciones de cada grupo describe mejor cómo se ha sentido durante esta última semana, incluido el día de hoy");
            rbP1.setText("No he experimentado ningún cambio en mi apetito");
            rbP2.setText("Mi apetito es un poco menor que lo habitual \nMi apetito es un poco mayor que lo habitual");
            rbP3.setText("Mi apetito es mucho menor que antes \nMi apetito es mucho mayor que lo habitual");
            rbP4.setText("No tengo en apetito en absoluto \nQuiero comer todo el tiempo");
            btnSiguiente.setEnabled(false);
        }
        if (contadorPregunta==19){
            grupoRadiospreguntas.clearCheck();
            tv1.setText("A continuación, señale cuál de las afirmaciones de cada grupo describe mejor cómo se ha sentido durante esta última semana, incluido el día de hoy");
            rbP1.setText("Puedo concentrarme tan bien como siempre");
            rbP2.setText("No puedo concentrarme tan bien como habitualmente ");
            rbP3.setText("Me es difícil mantener la mente en algo por mucho tiempo");
            rbP4.setText("Encuentro que no puedo concentrarme en nada");
            btnSiguiente.setEnabled(false);
        }
        if (contadorPregunta==20){
            grupoRadiospreguntas.clearCheck();
            tv1.setText("A continuación, señale cuál de las afirmaciones de cada grupo describe mejor cómo se ha sentido durante esta última semana, incluido el día de hoy");
            rbP1.setText("No estoy más cansado o fatigado que lo habitual");
            rbP2.setText("Me fatigo o me canso más fácilmente que lohabitual");
            rbP3.setText("Estoy demasiado fatigado o cansado para hacer muchas de las cosas que solía hacer");
            rbP4.setText("Estoy demasiado fatigado o cansado para hacer la mayoría de las cosas que solía hacer");
            btnSiguiente.setEnabled(false);
        }
        if (contadorPregunta==21) {

            grupoRadiospreguntas.clearCheck();
            tv1.setText("A continuación, señale cuál de las afirmaciones de cada grupo describe mejor cómo se ha sentido durante esta última semana, incluido el día de hoy");
            rbP1.setText("No he notado ningún cambio reciente en mi interés por el sexo");
            rbP2.setText("Estoy menos interesado en el sexo de lo que solía estarlo");
            rbP3.setText("Ahora estoy mucho menos interesado en el sexo");
            rbP4.setText("He perdido completamente el interés en el sexo");
            btnSiguiente.setText("Terminar");
            btnSiguiente.setEnabled(false);

            if(notaFinal >= 0 && notaFinal <= 13 ){

                btnSiguiente.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent Terminar = new Intent(cuestionario.this,bajo.class);
                        startActivity(Terminar);
                    }
                });
            }
            if(notaFinal > 13 && notaFinal <= 19 ){

                btnSiguiente.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent Terminar = new Intent(cuestionario.this,medio.class);
                        startActivity(Terminar);
                    }
                });
            }
            if(notaFinal > 19 && notaFinal <= 28 ){

                btnSiguiente.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent Terminar = new Intent(cuestionario.this,intermedio.class);
                        startActivity(Terminar);
                    }
                });
            }
            if(notaFinal >= 29 && notaFinal <= 63 ){

                btnSiguiente.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent Terminar = new Intent(cuestionario.this,alto.class);
                        startActivity(Terminar);
                    }
                });
            }


    }

    }

}