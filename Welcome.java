package com.example.tannerknabe.budgetapp_v3;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.InputStream;
import java.io.InputStreamReader;

import static java.security.AccessController.getContext;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int already_saved = 1;
        SharedPreferences prefs = getSharedPreferences("savedfile", MODE_PRIVATE);
        int x = prefs.getInt("already_saved",0);


        setContentView(R.layout.activity_welcome);

        SharedPreferences.Editor editor = getSharedPreferences("savedfile", MODE_PRIVATE).edit();
        editor.putInt("already_saved", already_saved);
    }

    public void hideButton()
    {
        Button toMain = findViewById(R.id.buttonView);
        toMain.setVisibility(View.INVISIBLE);
    }

    public void goToMain(View view){



            Intent myIntent = new Intent(Welcome.this, MainActivity.class);
            SharedPreferences saves = getSharedPreferences("savedfile", Context.MODE_PRIVATE);
            String budgetString = saves.getString("budget", "No name defined");
         //   Double budget = Double.parseDouble(budgetString);
            startActivity(myIntent);



    }




    public void editMode(View v){
    Intent i = new Intent(Welcome.this, enterBudget.class);
        startActivity(i);
    }
}