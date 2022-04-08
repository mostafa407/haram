package com.example.mostafamohamed.haram;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class Main4Activity extends AppCompatActivity {

    EditText user ,pass, phone;
    Button create;
    RadioButton male, female;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        user=findViewById(R.id.editText);
        phone=findViewById(R.id.editText3);
        pass=findViewById(R.id.editText2);
        create=findViewById(R.id.button6);
        male=findViewById(R.id.radioButton);
        female=findViewById(R.id.radioButton2);
    }
    public void create(View view) {

        user.getText( ).toString( ).trim();
        pass.getText( ).toString( ).trim();
        phone.getText( ).toString( ).trim();


            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }

    }
