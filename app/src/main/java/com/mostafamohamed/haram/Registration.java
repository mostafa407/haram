package com.mostafamohamed.haram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Registration extends AppCompatActivity {
    EditText name, email, pass, conpass;
    Button reg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_registration );
        name=findViewById ( R.id.eName );
        email=findViewById ( R.id.eMail );
        pass=findViewById ( R.id.Pass );
        conpass=findViewById ( R.id.conPass );
        reg=findViewById ( R.id.Register );
        reg.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                String ename,mail, ppass, copass;
                ename=name.getText ().toString ();
                mail=email.getText ().toString ();
                ppass=pass.getText ().toString ();
                copass=conpass.getText ().toString ();

                if (ename.equals ( "" )){
                    Toast.makeText ( Registration.this,"Name Required",Toast.LENGTH_SHORT ).show ();
                }else if (mail.equals ( "" )){
                    Toast.makeText ( Registration.this,"Email Required",Toast.LENGTH_SHORT ).show ();
                }else if (ppass.equals ( "" )){
                    Toast.makeText ( Registration.this,"Password Required",Toast.LENGTH_SHORT ).show ();
                }else if (copass.equals ( "" )){
                    Toast.makeText ( Registration.this,"Confirm Password",Toast.LENGTH_SHORT ).show ();
                }
                else if (!copass.equals ( "pass" )){
                    Toast.makeText ( Registration.this,"Confirm Mismatch",Toast.LENGTH_SHORT ).show ();
                }else {
                    //Authentication
                }
            }
        } );
    }
}