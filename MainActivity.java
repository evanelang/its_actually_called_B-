package com.example.tannerknabe.budgetapp_v2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    public void change1(View view){
        LinearLayout two = findViewById(R.id.two);
        two.setVisibility(View.VISIBLE);
        Button b1 = findViewById(R.id.b1);
        b1.setVisibility(View.INVISIBLE);
    }

    public void change2(View view){
        LinearLayout three = findViewById(R.id.three);
        three.setVisibility(View.VISIBLE);
        Button b2 = findViewById(R.id.b2);
        b2.setVisibility(View.INVISIBLE);
    }

    public void change3(View view){
        LinearLayout four = findViewById(R.id.four);
        four.setVisibility(View.VISIBLE);
        Button b3 = findViewById(R.id.b3);
        b3.setVisibility(View.INVISIBLE);
    }

    public void change4(View view){
        LinearLayout five = findViewById(R.id.five);
        five.setVisibility(View.VISIBLE);
        Button b4 = findViewById(R.id.b4);
        b4.setVisibility(View.INVISIBLE);
    }

    public void change5(View view){
        LinearLayout six = findViewById(R.id.six);
        six.setVisibility(View.VISIBLE);
        Button b5 = findViewById(R.id.b5);
        b5.setVisibility(View.INVISIBLE);
    }

    public void change6(View view){
        LinearLayout seven = findViewById(R.id.seven);
        seven.setVisibility(View.VISIBLE);
        Button b6 = findViewById(R.id.b6);
        b6.setVisibility(View.INVISIBLE);
    }

    public void change7(View view){
        LinearLayout eight = findViewById(R.id.eight);
        eight.setVisibility(View.VISIBLE);
        Button b7 = findViewById(R.id.b7);
        b7.setVisibility(View.INVISIBLE);
    }

    public void change8(View view){
        LinearLayout nine = findViewById(R.id.nine);
        nine.setVisibility(View.VISIBLE);
        Button b8 = findViewById(R.id.b8);
        b8.setVisibility(View.INVISIBLE);
    }

    public void change9(View view){
        LinearLayout ten = findViewById(R.id.ten);
        ten.setVisibility(View.VISIBLE);
        Button b9 = findViewById(R.id.b9);
        b9.setVisibility(View.INVISIBLE);
    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enter_cat);
    }
}
