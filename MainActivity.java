package com.example.alex.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        createVisibility(numCat);
    }

    TextView[] categories = {findViewById(R.id.cat1),findViewById(R.id.cat2),findViewById(R.id.cat3),findViewById(R.id.cat4),findViewById(R.id.cat5),findViewById(R.id.cat6),findViewById(R.id.cat7),findViewById(R.id.cat8),findViewById(R.id.cat9),findViewById(R.id.cat10)};
    TextView[] dollar1 = {findViewById(R.id.Sign1Cat1),findViewById(R.id.Sign1Cat2),findViewById(R.id.Sign1Cat3),findViewById(R.id.Sign1Cat4),findViewById(R.id.Sign1Cat5),findViewById(R.id.Sign1Cat6),findViewById(R.id.Sign1Cat7),findViewById(R.id.Sign1Cat8),findViewById(R.id.Sign1Cat9),findViewById(R.id.Sign1Cat10)};
    TextView[] remaining = {findViewById(R.id.Cat1Left),findViewById(R.id.Cat2Left),findViewById(R.id.Cat3Left),findViewById(R.id.Cat4Left),findViewById(R.id.Cat5Left),findViewById(R.id.Cat6Left),findViewById(R.id.Cat7Left),findViewById(R.id.Cat8Left),findViewById(R.id.Cat9Left),findViewById(R.id.Cat10Left)};
    TextView[] dollar2 = {findViewById(R.id.Sign2Cat1),findViewById(R.id.Sign2Cat2),findViewById(R.id.Sign2Cat3),findViewById(R.id.Sign2Cat4),findViewById(R.id.Sign2Cat5),findViewById(R.id.Sign2Cat6),findViewById(R.id.Sign2Cat7),findViewById(R.id.Sign2Cat8),findViewById(R.id.Sign2Cat9),findViewById(R.id.Sign2Cat10)};
    EditText[] spend = {findViewById(R.id.enterAmount1),findViewById(R.id.enterAmount2),findViewById(R.id.enterAmount3),findViewById(R.id.enterAmount4),findViewById(R.id.enterAmount5),findViewById(R.id.enterAmount6),findViewById(R.id.enterAmount7),findViewById(R.id.enterAmount8),findViewById(R.id.enterAmount9),findViewById(R.id.enterAmount10),};
    Button[] buttons = {findViewById(R.id.Spent1),findViewById(R.id.Spent2),findViewById(R.id.Spent3),findViewById(R.id.Spent4),findViewById(R.id.Spent5),findViewById(R.id.Spent6),findViewById(R.id.Spent7),findViewById(R.id.Spent8),findViewById(R.id.Spent9),findViewById(R.id.Spent10)};

    private void createVisibility(int numCat)
    {
        for (int i = 0;i<numCat;i++)
        {
            categories[i].setVisibility(View.VISIBLE);
            dollar1[i].setVisibility(View.VISIBLE);
            dollar2[i].setVisibility(View.VISIBLE);
            remaining[i].setVisibility(View.VISIBLE);
            spend[i].setVisibility(View.VISIBLE);
            buttons[i].setVisibility(View.VISIBLE);
        }
    }


    public void decrease1(View view)
    {
        TextView category = (TextView)findViewById(R.id.Cat1Left);
        int value = Integer.parseInt(category.getText().toString());
        EditText remove = (EditText)findViewById(R.id.enterAmount1);
        int spent = Integer.parseInt(remove.getText().toString());
        value = value - spent;
        category.setText(Integer.toString(value));
    }

    public void decrease2(View view)
    {
        TextView category = (TextView)findViewById(R.id.Cat2Left);
        int value = Integer.parseInt(category.getText().toString());
        EditText remove = (EditText)findViewById(R.id.enterAmount2);
        int spent = Integer.parseInt(remove.getText().toString());
        value = value - spent;
        category.setText(Integer.toString(value));
    }

    public void decrease3(View view)
    {
        TextView category = (TextView)findViewById(R.id.Cat3Left);
        int value = Integer.parseInt(category.getText().toString());
        EditText remove = (EditText)findViewById(R.id.enterAmount3);
        int spent = Integer.parseInt(remove.getText().toString());
        value = value - spent;
        category.setText(Integer.toString(value));
    }
    public void decrease4(View view)
    {
        TextView category = (TextView)findViewById(R.id.Cat4Left);
        int value = Integer.parseInt(category.getText().toString());
        EditText remove = (EditText)findViewById(R.id.enterAmount4);
        int spent = Integer.parseInt(remove.getText().toString());
        value = value - spent;
        category.setText(Integer.toString(value));
    }
    public void decrease5(View view)
    {
        TextView category = (TextView)findViewById(R.id.Cat5Left);
        int value = Integer.parseInt(category.getText().toString());
        EditText remove = (EditText)findViewById(R.id.enterAmount5);
        int spent = Integer.parseInt(remove.getText().toString());
        value = value - spent;
        category.setText(Integer.toString(value));
    }
    public void decrease6(View view)
    {
        TextView category = (TextView)findViewById(R.id.Cat6Left);
        int value = Integer.parseInt(category.getText().toString());
        EditText remove = (EditText)findViewById(R.id.enterAmount6);
        int spent = Integer.parseInt(remove.getText().toString());
        value = value - spent;
        category.setText(Integer.toString(value));
    }
    public void decrease7(View view)
    {
        TextView category = (TextView)findViewById(R.id.Cat7Left);
        int value = Integer.parseInt(category.getText().toString());
        EditText remove = (EditText)findViewById(R.id.enterAmount7);
        int spent = Integer.parseInt(remove.getText().toString());
        value = value - spent;
        category.setText(Integer.toString(value));
    }
    public void decrease8(View view)
    {
        TextView category = (TextView)findViewById(R.id.Cat8Left);
        int value = Integer.parseInt(category.getText().toString());
        EditText remove = (EditText)findViewById(R.id.enterAmount8);
        int spent = Integer.parseInt(remove.getText().toString());
        value = value - spent;
        category.setText(Integer.toString(value));
    }
    public void decrease9(View view)
    {
        TextView category = (TextView)findViewById(R.id.Cat9Left);
        int value = Integer.parseInt(category.getText().toString());
        EditText remove = (EditText)findViewById(R.id.enterAmount9);
        int spent = Integer.parseInt(remove.getText().toString());
        value = value - spent;
        category.setText(Integer.toString(value));
    }
    public void decrease10(View view)
    {
        TextView category = (TextView)findViewById(R.id.Cat10Left);
        int value = Integer.parseInt(category.getText().toString());
        EditText remove = (EditText)findViewById(R.id.enterAmount10);
        int spent = Integer.parseInt(remove.getText().toString());
        value = value - spent;
        category.setText(Integer.toString(value));
    }



}
