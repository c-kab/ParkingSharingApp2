package com.example.parkingsharingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SignUpAlt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_alt);
    }

    public void clientSignUp(View view) {

        Intent intent = new Intent(this, ClientActivity.class);
        startActivity(intent);
    }

    public void ownerSignUp(View view) {
        Intent intent = new Intent(this, OwnerActivity.class);
        startActivity(intent);
    }
}
