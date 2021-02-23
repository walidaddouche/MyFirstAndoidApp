package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button buttonmultiply;
    Button buttondivide;
    Button buttonsub;
    Button buttonadd;
    EditText result;
    int compteur = 0 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.buttonadd = findViewById(R.id.buttonadd);
        this.result = findViewById(R.id.result);
        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compteur ++;
                System.out.println(compteur);
                result.setText(compteur);
            }
        });

            }


}
