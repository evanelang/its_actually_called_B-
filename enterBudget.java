package com.example.tannerknabe.budgetapp_v3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class enterBudget extends AppCompatActivity {

EditText enterValueB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_budget);


        enterValueB = (EditText) findViewById(R.id.enterValueB);
    }
    public void goToCategories(View view){
        if (enterValueB.getText().toString().trim().length() == 0)
        {

        }
        else {
            Intent i = new Intent(enterBudget.this, Categories.class);
            i.putExtra("BUDGET", enterValueB.getText().toString());
            startActivity(i);
        }
    }
}
