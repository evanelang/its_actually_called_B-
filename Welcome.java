package com.example.tannerknabe.budgetapp_v2;


        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }
   /* public void goToMain(View view){
        Intent myIntent = new Intent(view.getContext(), )
    }

    */


    public void editMode(View view){

                startActivity(new Intent(Welcome.this,enterBudget.class));
    }
}