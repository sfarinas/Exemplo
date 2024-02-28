package com.farina.exemplo;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    EditText editPeso;
    EditText editAltura;
    TextView textViewResultIMC;
    TextView textViewResultSituacao;
    CheckBox cbIdade;
    RadioButton rbHomem;
    RadioButton rbMulher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast toast = Toast.makeText(getApplicationContext(),
                "A atividade foi CRIADA!!!", Toast.LENGTH_LONG);
        toast.show();

        editPeso = (EditText) findViewById(R.id.editTextPeso);
        editAltura = (EditText) findViewById(R.id.editTextAltura);
        textViewResultIMC = (TextView) findViewById(R.id.textViewResultIMC);
        textViewResultSituacao = (TextView) findViewById(R.id.textViewResultSituacao);
        cbIdade = (CheckBox) findViewById(R.id.checkBoxIdade);
        rbHomem = (RadioButton) findViewById(R.id.radioButtonMasculino);
        rbMulher = (RadioButton) findViewById(R.id.radioButtonFeminino);

    }

    public void calcular (View v){
        double peso = 0, altura = 0, imc = 0;
        int idade = 0;
        int sexo = 0;
        String situacao;

        peso = Double.parseDouble(editPeso.getText().toString());
        altura = Double.parseDouble(editAltura.getText().toString());

        if (cbIdade.isChecked()){
            idade = 1;
        }
        else {
            idade = 2;
        }
        if (rbMulher.isChecked()){
            sexo = 1;
        }
        else {
            sexo = 2;
        }
        imc = peso / Math.pow(altura, 2);
        if (idade == 1){
            situacao = "Idade fora da faixa. Situacao não determinada";
        }
        else {
            if (sexo == 1){
                if (imc < 19.1){
                    situacao = "Abaixo do peso.";
                }
                else {
                    if (imc < 25.8){
                        situacao = "No peso normal.";
                    }
                    else {
                        if (imc < 27.3){
                            situacao = "Marginalmente acima do peso.";
                        }
                        else {
                            if (imc < 32.3){
                                situacao = "Acima do peso";
                            }
                            else {
                                situacao = "Obesa.";
                            }
                        }
                    }
                }
            }
            else {
                if (imc < 20.7){
                    situacao = "Abaixo do peso.";
                }
                else {
                    if (imc < 26.4){
                        situacao = "No peso normal.";
                    }
                    else {
                        if (imc < 27.8){
                            situacao = "Marginalmente acima do peso";
                        }
                        else {
                            if (imc < 31.1){
                                situacao = "Acima do peso";
                            }
                            else {
                                situacao = "Obeso";
                            }
                        }
                    }
                }

            }
        }

        textViewResultIMC.setText(String.format("%.2f", imc));
        textViewResultSituacao.setText(situacao);

    }
}