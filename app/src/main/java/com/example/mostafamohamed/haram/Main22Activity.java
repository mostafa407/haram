package com.example.mostafamohamed.haram;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Main22Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);
    }
    public void mecca(View view){
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("geo:21.422637, 39.826051"));
        startActivity(intent);
    }
    public void lock(View view){
        Intent intent=new Intent(this ,MainActivity.class);
        startActivity(intent);



    }
    public void Manage(View view){

        Intent intent=new Intent(this ,Main3Activity.class);
        startActivity(intent);


    }
}
