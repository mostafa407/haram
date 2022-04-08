package com.mostafamohamed.haram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mysong;
    EditText email,pass;
    Button login,emap;
    TextView reg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        mysong=MediaPlayer.create ( MainActivity.this,R.raw.q );
        mysong.start ();
        email=findViewById ( R.id.email );
        pass=findViewById ( R.id.pass );
        login=findViewById ( R.id.login );
        reg=findViewById ( R.id.reg );
        emap=findViewById ( R.id.button );
        emap.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:37.827500,-122.481670"));
                i.setClassName("com.google.android.apps.maps",
                        "com.google.android.maps.MapsActivity");
                startActivity(i);
            }
        } );
        login.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                String emails,epase;
                emails=email.getText ().toString ();
                epase=pass.getText ().toString ();
             if (emails.equals ( "" )){
                 Toast.makeText ( MainActivity.this,"Email Required",Toast.LENGTH_SHORT ).show ();

             }
             else if (epase.equals ( "" )){
                 Toast.makeText ( MainActivity.this,"Password Required",Toast.LENGTH_SHORT ).show ();
             }
             else {
                 //Authentication
             }
            }
        } );
        reg.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                Intent i=new Intent ( MainActivity.this,Registration.class );
                startActivity ( i );
                finish ();

            }
        } );
    }
    @Override
    protected void onPause() {
        super.onPause ( );
        mysong.release ();
    }
}