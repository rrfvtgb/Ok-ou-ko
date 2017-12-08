package com.example.julien.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.julien.myapplication.JavaApplication4.*;

public class MainActivity extends AppCompatActivity {


    private TextView text;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        text = findViewById(R.id.code);
        text.setText(initJava());

        //OK
        final Button buttongauche = findViewById(R.id.btngau);
        final Button buttondroite = findViewById(R.id.btndroi);
        final Button buttonhaut = findViewById(R.id.btnhau);
        final Button buttonbas = findViewById(R.id.btnbas);



        buttongauche.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (getReponse(text.getText().toString()) == 2)
                    Toast.makeText(getApplicationContext(), "C'est VRAI", Toast.LENGTH_LONG).show();
                else Toast.makeText(getApplicationContext(), "C'est FAUX", Toast.LENGTH_LONG).show();
                text.setText(initJava());
            }
        });

        buttondroite.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (getReponse(text.getText().toString()) == 1)
                    Toast.makeText(getApplicationContext(), "C'est VRAI", Toast.LENGTH_LONG).show();
                else Toast.makeText(getApplicationContext(), "C'est FAUX", Toast.LENGTH_LONG).show();
                text.setText(initJava());
            }
        });

        buttonhaut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (getReponse(text.getText().toString()) == 3)
                    Toast.makeText(getApplicationContext(), "C'est VRAI", Toast.LENGTH_LONG).show();
                else Toast.makeText(getApplicationContext(), "C'est FAUX", Toast.LENGTH_LONG).show();
                text.setText(initJava());
            }
        });

        buttonbas.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (getReponse(text.getText().toString()) == 4)
                    Toast.makeText(getApplicationContext(), "C'est VRAI", Toast.LENGTH_LONG).show();
                else Toast.makeText(getApplicationContext(), "C'est FAUX", Toast.LENGTH_LONG).show();
                text.setText(initJava());
            }
        });
    }

}
