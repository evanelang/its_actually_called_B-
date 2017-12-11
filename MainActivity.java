package com.example.tannerknabe.budgetapp_v3;



        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;
        import android.content.SharedPreferences;

public class MainActivity extends AppCompatActivity {

    public static final String MY_PREFS_NAME = "savedfile";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int numCat = getIntent().getIntExtra("numCat",0);
        System.out.println("hey");

        if (numCat == 0)
        {
            System.out.println("1");
            SharedPreferences prefs = getSharedPreferences(MY_PREFS_NAME, 0);
            numCat = prefs.getInt("numCat", 0);
            String[] name_array = new String[numCat];
            String[] amt_remaining = new String[numCat];
            for(int i = 0;i<numCat;i++) {
                name_array[i] = prefs.getString("name"+Integer.toString(i), "xyz");
                amt_remaining[i] = prefs.getString("amt_remaining_"+Integer.toString(i), "xyz");
                System.out.println(amt_remaining[i]);
            }
            createfromload(numCat, amt_remaining, name_array);

        }
        else {
            System.out.println("2");
            String[] amt_remaining = new String[numCat];
            createVisibility(numCat, amt_remaining);
        }

    }



    @Override
    protected void onStop() {
        super.onStop();


    }

    private void createfromload(int numCat, String[] amt_remaining, String[] names)
    {
        TextView[] categories = {findViewById(R.id.cat1),findViewById(R.id.cat2),findViewById(R.id.cat3),findViewById(R.id.cat4),findViewById(R.id.cat5),findViewById(R.id.cat6),findViewById(R.id.cat7),findViewById(R.id.cat8),findViewById(R.id.cat9),findViewById(R.id.cat10)};
        TextView[] dollar1 = {findViewById(R.id.Sign1Cat1),findViewById(R.id.Sign1Cat2),findViewById(R.id.Sign1Cat3),findViewById(R.id.Sign1Cat4),findViewById(R.id.Sign1Cat5),findViewById(R.id.Sign1Cat6),findViewById(R.id.Sign1Cat7),findViewById(R.id.Sign1Cat8),findViewById(R.id.Sign1Cat9),findViewById(R.id.Sign1Cat10)};
        TextView[] remaining = {findViewById(R.id.Cat1Left),findViewById(R.id.Cat2Left),findViewById(R.id.Cat3Left),findViewById(R.id.Cat4Left),findViewById(R.id.Cat5Left),findViewById(R.id.Cat6Left),findViewById(R.id.Cat7Left),findViewById(R.id.Cat8Left),findViewById(R.id.Cat9Left),findViewById(R.id.Cat10Left)};
        TextView[] dollar2 = {findViewById(R.id.Sign2Cat1),findViewById(R.id.Sign2Cat2),findViewById(R.id.Sign2Cat3),findViewById(R.id.Sign2Cat4),findViewById(R.id.Sign2Cat5),findViewById(R.id.Sign2Cat6),findViewById(R.id.Sign2Cat7),findViewById(R.id.Sign2Cat8),findViewById(R.id.Sign2Cat9),findViewById(R.id.Sign2Cat10)};
        EditText[] spend = {findViewById(R.id.enterAmount1),findViewById(R.id.enterAmount2),findViewById(R.id.enterAmount3),findViewById(R.id.enterAmount4),findViewById(R.id.enterAmount5),findViewById(R.id.enterAmount6),findViewById(R.id.enterAmount7),findViewById(R.id.enterAmount8),findViewById(R.id.enterAmount9),findViewById(R.id.enterAmount10),};
        Button[] buttons = {findViewById(R.id.Spent1),findViewById(R.id.Spent2),findViewById(R.id.Spent3),findViewById(R.id.Spent4),findViewById(R.id.Spent5),findViewById(R.id.Spent6),findViewById(R.id.Spent7),findViewById(R.id.Spent8),findViewById(R.id.Spent9),findViewById(R.id.Spent10)};
        for (int i = 0;i< numCat;i++)
        {
            categories[i].setVisibility(View.VISIBLE);
            categories[i].setText(names[i]);
            dollar1[i].setVisibility(View.VISIBLE);
            dollar2[i].setVisibility(View.VISIBLE);
            remaining[i].setVisibility(View.VISIBLE);
            remaining[i].setText(amt_remaining[i]);
            spend[i].setVisibility(View.VISIBLE);
            buttons[i].setVisibility(View.VISIBLE);
        }
    }

    private void createVisibility(int numCat, String[] amt_remaining)
    {
        TextView[] categories = {findViewById(R.id.cat1),findViewById(R.id.cat2),findViewById(R.id.cat3),findViewById(R.id.cat4),findViewById(R.id.cat5),findViewById(R.id.cat6),findViewById(R.id.cat7),findViewById(R.id.cat8),findViewById(R.id.cat9),findViewById(R.id.cat10)};
        TextView[] dollar1 = {findViewById(R.id.Sign1Cat1),findViewById(R.id.Sign1Cat2),findViewById(R.id.Sign1Cat3),findViewById(R.id.Sign1Cat4),findViewById(R.id.Sign1Cat5),findViewById(R.id.Sign1Cat6),findViewById(R.id.Sign1Cat7),findViewById(R.id.Sign1Cat8),findViewById(R.id.Sign1Cat9),findViewById(R.id.Sign1Cat10)};
        TextView[] remaining = {findViewById(R.id.Cat1Left),findViewById(R.id.Cat2Left),findViewById(R.id.Cat3Left),findViewById(R.id.Cat4Left),findViewById(R.id.Cat5Left),findViewById(R.id.Cat6Left),findViewById(R.id.Cat7Left),findViewById(R.id.Cat8Left),findViewById(R.id.Cat9Left),findViewById(R.id.Cat10Left)};
        TextView[] dollar2 = {findViewById(R.id.Sign2Cat1),findViewById(R.id.Sign2Cat2),findViewById(R.id.Sign2Cat3),findViewById(R.id.Sign2Cat4),findViewById(R.id.Sign2Cat5),findViewById(R.id.Sign2Cat6),findViewById(R.id.Sign2Cat7),findViewById(R.id.Sign2Cat8),findViewById(R.id.Sign2Cat9),findViewById(R.id.Sign2Cat10)};
        EditText[] spend = {findViewById(R.id.enterAmount1),findViewById(R.id.enterAmount2),findViewById(R.id.enterAmount3),findViewById(R.id.enterAmount4),findViewById(R.id.enterAmount5),findViewById(R.id.enterAmount6),findViewById(R.id.enterAmount7),findViewById(R.id.enterAmount8),findViewById(R.id.enterAmount9),findViewById(R.id.enterAmount10),};
        Button[] buttons = {findViewById(R.id.Spent1),findViewById(R.id.Spent2),findViewById(R.id.Spent3),findViewById(R.id.Spent4),findViewById(R.id.Spent5),findViewById(R.id.Spent6),findViewById(R.id.Spent7),findViewById(R.id.Spent8),findViewById(R.id.Spent9),findViewById(R.id.Spent10)};
        double budgetTotal = getIntent().getDoubleExtra("budget",0);
        String[] name_array = getIntent().getStringArrayExtra("name_array");
        String[] percent_array = getIntent().getStringArrayExtra("percent_array");
        Double[] doub_percent= {0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0};
        double pctsum = 0;
        SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE).edit();
        for(int i = 0;i<numCat;i++) {
            doub_percent[i] = Double.parseDouble(percent_array[i]);
            pctsum += doub_percent[i];
        }
        for(int i = 0;i<numCat;i++){
            amt_remaining[i] = Double.toString(Math.round(((doub_percent[i]/pctsum)*budgetTotal)*100.0)/100.0);
            editor.putString("amt_remaining_" + i, amt_remaining[i]);
        }
        for (int i = 0;i<numCat;i++)
        {
            categories[i].setVisibility(View.VISIBLE);
            categories[i].setText(name_array[i]);
            dollar1[i].setVisibility(View.VISIBLE);
            dollar2[i].setVisibility(View.VISIBLE);
            remaining[i].setVisibility(View.VISIBLE);
            remaining[i].setText(amt_remaining[i]);
            spend[i].setVisibility(View.VISIBLE);
            buttons[i].setVisibility(View.VISIBLE);
        }
    }


    public void decrease1(View view)
    {
        TextView category = (TextView)findViewById(R.id.Cat1Left);
        double value = Double.parseDouble(category.getText().toString());
        EditText remove = (EditText)findViewById(R.id.enterAmount1);
        double spent = Double.parseDouble(remove.getText().toString());
        value = value - spent;
        category.setText(Double.toString(Math.round(value*100.0)/100.0));
    }

    public void decrease2(View view)
    {
        TextView category = (TextView)findViewById(R.id.Cat2Left);
        double value =  Double.parseDouble(category.getText().toString());
        EditText remove = (EditText)findViewById(R.id.enterAmount2);
        double spent =  Double.parseDouble(remove.getText().toString());
        value = value - spent;
        category.setText(Double.toString(Math.round(value*100.0)/100.0));
    }

    public void decrease3(View view)
    {
        TextView category = (TextView)findViewById(R.id.Cat3Left);
        double value =  Double.parseDouble(category.getText().toString());
        EditText remove = (EditText)findViewById(R.id.enterAmount3);
        double spent =  Double.parseDouble(remove.getText().toString());
        value = value - spent;
        category.setText(Double.toString(Math.round(value*100.0)/100.0));
    }
    public void decrease4(View view)
    {
        TextView category = (TextView)findViewById(R.id.Cat4Left);
        double value =  Double.parseDouble(category.getText().toString());
        EditText remove = (EditText)findViewById(R.id.enterAmount4);
        double spent =  Double.parseDouble(remove.getText().toString());
        value = value - spent;
        category.setText(Double.toString(Math.round(value*100.0)/100.0));
    }
    public void decrease5(View view)
    {
        TextView category = (TextView)findViewById(R.id.Cat5Left);
        double value =  Double.parseDouble(category.getText().toString());
        EditText remove = (EditText)findViewById(R.id.enterAmount5);
        double spent =  Double.parseDouble(remove.getText().toString());
        value = value - spent;
        category.setText(Double.toString(Math.round(value*100.0)/100.0));
    }
    public void decrease6(View view)
    {
        TextView category = (TextView)findViewById(R.id.Cat6Left);
        double value =  Double.parseDouble(category.getText().toString());
        EditText remove = (EditText)findViewById(R.id.enterAmount6);
        double spent =  Double.parseDouble(remove.getText().toString());
        value = value - spent;
        category.setText(Double.toString(Math.round(value*100.0)/100.0));
    }
    public void decrease7(View view)
    {
        TextView category = (TextView)findViewById(R.id.Cat7Left);
        double value =  Double.parseDouble(category.getText().toString());
        EditText remove = (EditText)findViewById(R.id.enterAmount7);
        double spent =  Double.parseDouble(remove.getText().toString());
        value = value - spent;
        category.setText(Double.toString(Math.round(value*100.0)/100.0));
    }
    public void decrease8(View view)
    {
        TextView category = (TextView)findViewById(R.id.Cat8Left);
        double value =  Double.parseDouble(category.getText().toString());
        EditText remove = (EditText)findViewById(R.id.enterAmount8);
        double spent =  Double.parseDouble(remove.getText().toString());
        value = value - spent;
        category.setText(Double.toString(Math.round(value*100.0)/100.0));
    }
    public void decrease9(View view)
    {
        TextView category = (TextView)findViewById(R.id.Cat9Left);
        double value =  Double.parseDouble(category.getText().toString());
        EditText remove = (EditText)findViewById(R.id.enterAmount9);
        double spent =  Double.parseDouble(remove.getText().toString());
        value = value - spent;
        category.setText(Double.toString(Math.round(value*100.0)/100.0));
    }
    public void decrease10(View view)
    {
        TextView category = (TextView)findViewById(R.id.Cat10Left);
        double value =  Double.parseDouble(category.getText().toString());
        EditText remove = (EditText)findViewById(R.id.enterAmount10);
        double spent =  Double.parseDouble(remove.getText().toString());
        value = value - spent;
        category.setText(Double.toString(Math.round(value*100.0)/100.0));
    }

    public void saveData(View view)
    {
        SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE).edit();
        int numCat = getIntent().getIntExtra("numCat",1);
        TextView[] remaining = {findViewById(R.id.Cat1Left),findViewById(R.id.Cat2Left),findViewById(R.id.Cat3Left),findViewById(R.id.Cat4Left),findViewById(R.id.Cat5Left),findViewById(R.id.Cat6Left),findViewById(R.id.Cat7Left),findViewById(R.id.Cat8Left),findViewById(R.id.Cat9Left),findViewById(R.id.Cat10Left)};
        for(int i = 0;i<numCat;i++){
            editor.putString("amt_remaining_"+Integer.toString(i), remaining[i].getText().toString());
            editor.commit();
            System.out.println("amt_remaining_"+Integer.toString(i));
            SharedPreferences prefs = getSharedPreferences(MY_PREFS_NAME, 0);
            System.out.println(prefs.getString("amt_remaining_1", "xyz"));
        }
    }

}