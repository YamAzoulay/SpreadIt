package com.example.betaversionyam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    boolean isRegistered = false;
    Intent t;
    boolean stayConnect;

    public static FirebaseAuth refAuth = FirebaseAuth.getInstance();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t=new Intent(this,regAndLoginActivity.class);
        startActivity(t);
    }

    public void move(View view) {
    }
}