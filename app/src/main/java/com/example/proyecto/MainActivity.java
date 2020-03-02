package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Login(View v){
        EditText user = findViewById(R.id.user);
        String tag;
        Log.d( tag= "Usuario O Correo:", user.getText().toString());
        EditText pass = findViewById(R.id.pass);
        Log.d( tag= "Contraseña:", pass.getText().toString());
        Intent login2 = new Intent(this, login.class);
        startActivity(login2);
    }

    public void register(View v){
        Intent registrar1 = new Intent(this, registro1.class);
        startActivity(registrar1);
    }



    public void registerForGoogle(View v){
        Intent google = new Intent(this, google.class);
        startActivity(google);
    }
    public void registerForFacebook(View v){
        Intent facebook = new Intent(this, facebook.class);
        startActivity(facebook);
    }
    public void registerForTwitter(View v){
        Intent twitter = new Intent(this, twitter.class);
        startActivity(twitter);
    }

}
