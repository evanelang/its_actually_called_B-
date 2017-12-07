package com.example.tannerknabe.budgetapp_v3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class Categories extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);}
    int numCat = 1;

    public void change1(View view){
        LinearLayout two = findViewById(R.id.two);
        two.setVisibility(View.VISIBLE);
        Button b1 = findViewById(R.id.b1);
        b1.setVisibility(View.INVISIBLE);
        numCat++;
    }

    public void change2(View view){
        LinearLayout three = findViewById(R.id.three);
        three.setVisibility(View.VISIBLE);
        Button b2 = findViewById(R.id.b2);
        b2.setVisibility(View.INVISIBLE);
        numCat++;
    }

    public void change3(View view){
        LinearLayout four = findViewById(R.id.four);
        four.setVisibility(View.VISIBLE);
        Button b3 = findViewById(R.id.b3);
        b3.setVisibility(View.INVISIBLE);
        numCat++;
    }

    public void change4(View view){
        LinearLayout five = findViewById(R.id.five);
        five.setVisibility(View.VISIBLE);
        Button b4 = findViewById(R.id.b4);
        b4.setVisibility(View.INVISIBLE);
        numCat++;
    }

    public void change5(View view){
        LinearLayout six = findViewById(R.id.six);
        six.setVisibility(View.VISIBLE);
        Button b5 = findViewById(R.id.b5);
        b5.setVisibility(View.INVISIBLE);
        numCat++;
    }

    public void change6(View view){
        LinearLayout seven = findViewById(R.id.seven);
        seven.setVisibility(View.VISIBLE);
        Button b6 = findViewById(R.id.b6);
        b6.setVisibility(View.INVISIBLE);
        numCat++;
    }

    public void change7(View view){
        LinearLayout eight = findViewById(R.id.eight);
        eight.setVisibility(View.VISIBLE);
        Button b7 = findViewById(R.id.b7);
        b7.setVisibility(View.INVISIBLE);
        numCat++;
    }

    public void change8(View view){
        LinearLayout nine = findViewById(R.id.nine);
        nine.setVisibility(View.VISIBLE);
        Button b8 = findViewById(R.id.b8);
        b8.setVisibility(View.INVISIBLE);
        numCat++;
    }

    public void change9(View view){
        LinearLayout ten = findViewById(R.id.ten);
        ten.setVisibility(View.VISIBLE);
        Button b9 = findViewById(R.id.b9);
        b9.setVisibility(View.INVISIBLE);
        numCat++;
    }

    EditText cat1 = (EditText)findViewById(R.id.cat1);
    String name1 = cat1.getText().toString();
    EditText percent1 = (EditText)findViewById(R.id.percent1);
    String perc1 = percent1.getText().toString();

    EditText cat2 = (EditText)findViewById(R.id.cat2);
    String name2 = cat2.getText().toString();
    EditText percent2 = (EditText)findViewById(R.id.percent2);
    String perc2 = percent2.getText().toString();

    EditText cat3 = (EditText)findViewById(R.id.cat3);
    String name3 = cat3.getText().toString();
    EditText percent3 = (EditText)findViewById(R.id.percent3);
    String perc3 = percent3.getText().toString();

    EditText cat4 = (EditText)findViewById(R.id.cat4);
    String name4 = cat4.getText().toString();
    EditText percent4 = (EditText)findViewById(R.id.percent4);
    String perc4 = percent4.getText().toString();

    EditText cat5 = (EditText)findViewById(R.id.cat5);
    String name5 = cat5.getText().toString();
    EditText percent5 = (EditText)findViewById(R.id.percent5);
    String perc5 = percent5.getText().toString();

    EditText cat6 = (EditText)findViewById(R.id.cat6);
    String name6 = cat6.getText().toString();
    EditText percent6 = (EditText)findViewById(R.id.percent6);
    String perc6 = percent6.getText().toString();

    EditText cat7 = (EditText)findViewById(R.id.cat7);
    String name7 = cat7.getText().toString();
    EditText percent7 = (EditText)findViewById(R.id.percent7);
    String perc7 = percent7.getText().toString();

    EditText cat8 = (EditText)findViewById(R.id.cat8);
    String name8 = cat8.getText().toString();
    EditText percent8 = (EditText)findViewById(R.id.percent8);
    String perc8 = percent8.getText().toString();

    EditText cat9 = (EditText)findViewById(R.id.cat9);
    String name9 = cat9.getText().toString();
    EditText percent9 = (EditText)findViewById(R.id.percent9);
    String perc9 = percent9.getText().toString();

    EditText cat10 = (EditText)findViewById(R.id.cat10);
    String name10 = cat10.getText().toString();
    EditText percent10 = (EditText)findViewById(R.id.percent10);
    String perc10 = percent10.getText().toString();

    public void  goToFour(View view){

    }


}

