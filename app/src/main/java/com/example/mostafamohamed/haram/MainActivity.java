package com.example.mostafamohamed.haram;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    EditText username;
    EditText password;
    Button Login;
    private FirebaseAuth mAuth;

    public MainActivity(FirebaseAuth mAuth) {
        this.mAuth = mAuth;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        Login = findViewById(R.id.button);



    }
    public void Login(View view){
        if((username.getText().toString().equals("admin"))&&(password.getText().toString().equals("1234"))){


            Intent intent = new Intent(this, Main22Activity.class);
            startActivity(intent);
            Toast.makeText(this, "login", Toast.LENGTH_LONG).show();



        }else {
            Toast.makeText(this, "required", Toast.LENGTH_LONG).show();
    }}

    public void reg(View view){
        Intent intent=new Intent(this,Main4Activity.class);
        startActivity(intent);


    }


}