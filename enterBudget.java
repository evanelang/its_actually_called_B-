package com.example.tannerknabe.budgetapp_v3;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class enterBudget extends AppCompatActivity {

EditText enterValueB;
public static final String MY_PREFS_NAME = "savedfile";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_budget);


        enterValueB = findViewById(R.id.enterValueB);
    }
    public void goToCategories(View view){
        if (enterValueB.getText().toString().trim().length() == 0)
        {

        }
        else {
            SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE).edit();
            Intent i = new Intent(enterBudget.this, Categories.class);
            i.putExtra("BUDGET", enterValueB.getText().toString());
            editor.putString("enterValueB", enterValueB.getText().toString());
            editor.apply();
            startActivity(i);
        }
    }
}
