package com.example.tannerknabe.budgetapp_v3;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.io.InputStream;
import java.io.InputStreamReader;

import static java.security.AccessController.getContext;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    };

    public void goToMain(View view){
        // Intent myIntent = new Intent(view.getContext(), )
        SharedPreferences saves = getSharedPreferences("save_data", Context.MODE_PRIVATE);
        String budgetString = saves.getString("budget", "No name defined");
        Double budget = Double.parseDouble(budgetString);
        

    };




    public void editMode(View v){
    Intent i = new Intent(Welcome.this, enterBudget.class);
        startActivity(i);
    }
}