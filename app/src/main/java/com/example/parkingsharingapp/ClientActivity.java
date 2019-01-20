package com.example.parkingsharingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ClientActivity extends AppCompatActivity {

    FirebaseDatabase database = FirebaseDatabase.getInstance() ;
    DatabaseReference myRef = database.getReference() ;
    EditText getClientName, getClientMail, getClientCarModel, getClientPassword ;
    Button signUp ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client);

        getClientName = findViewById(R.id.edit_name) ;
        getClientMail = findViewById(R.id.edit_mail_sUp) ;
        getClientCarModel = findViewById(R.id.edit_car_model) ;
        getClientPassword = findViewById(R.id.edit_pwd_client) ;
        signUp = findViewById(R.id.btn_sUp_client) ;




    }

    public void clientSigningUP(View view) {

        String name = getClientName.getText().toString() ;
        String mail = getClientName.getText().toString() ;
        String carModel = getClientName.getText().toString() ;
        String passwd = getClientName.getText().toString() ;

        myRef.child("client").child("Name").setValue(name);
        myRef.child("client").child("car Model").setValue(mail);
        myRef.child("client").child("mail").setValue(carModel);
        myRef.child("client").child("password").setValue(passwd);



    }
}
