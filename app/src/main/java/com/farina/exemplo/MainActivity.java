package com.farina.exemplo;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Toast;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast toast = Toast.makeText(getApplicationContext(),
                "A atividade foi CRIADA!!!", Toast.LENGTH_LONG);
        toast.show();
    }
    protected void onStart(){
        Toast toast = Toast.makeText(getApplicationContext(),
                "A atividade INICIOU !!!!", Toast.LENGTH_LONG);
        toast.show();
        super.onStart();
    }

    @Override
    protected void onRestart() {
        Toast toast = Toast.makeText(getApplicationContext(),
                "A atividade REINICIOU !!!!", Toast.LENGTH_LONG);
        toast.show();
        super.onRestart();
    }

    @Override
    protected void onResume() {
        Toast toast = Toast.makeText(getApplicationContext(),
                "A atividade RETORNOU !!!", Toast.LENGTH_LONG);
        toast.show();
        super.onResume();
    }

    @Override
    protected void onPause() {
        Toast toast = Toast.makeText(getApplicationContext(),
                "A atividade entrou em PAUSA !!!", Toast.LENGTH_LONG);
        toast.show();
        super.onPause();
    }

    @Override
    protected void onStop() {
        Toast toast = Toast.makeText(getApplicationContext(),
                "A atividade PAROU !!!", Toast.LENGTH_LONG);
        toast.show();
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Toast toast = Toast.makeText(getApplicationContext(),
                "A atividade ENCERROU !!!", Toast.LENGTH_LONG);
        toast.show();
        super.onDestroy();
    }
}