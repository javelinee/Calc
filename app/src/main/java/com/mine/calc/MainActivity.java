package com.mine.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button tambah, kurang, kali, bagi;
    EditText numberOne, numberTwo;
    TextView total;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tambah = (Button)findViewById(R.id.plus);
        kurang = (Button)findViewById(R.id.min);
        kali = (Button)findViewById(R.id.multi);
        bagi = (Button)findViewById(R.id.div);

        total = (TextView)findViewById(R.id.Result);

        numberOne = (EditText)findViewById(R.id.viewOne);
        numberTwo = (EditText)findViewById(R.id.viewTwo);

        tambah.setOnClickListener(this);
        kurang.setOnClickListener(this);
        kali.setOnClickListener(this);
        bagi.setOnClickListener(this);
    }

    private int firstnumber = 0;
    private int secondnumber = 0;
    private int result = 0;

    @Override
   public void onClick(View v){
       switch (v.getId()){
           case R.id.plus :
               firstnumber = Integer.parseInt(numberOne.getText().toString());
               secondnumber = Integer.parseInt(numberTwo.getText().toString());
               result = firstnumber + secondnumber;
               total.setText(Integer.toString(result));
               break;

           case R.id.min :
               firstnumber = Integer.parseInt(numberOne.getText().toString());
               secondnumber = Integer.parseInt(numberTwo.getText().toString());
               result = firstnumber - secondnumber;
               total.setText(Integer.toString(result));
               break;

           case R.id.multi :
               firstnumber = Integer.parseInt(numberOne.getText().toString());
               secondnumber = Integer.parseInt(numberTwo.getText().toString());
               result = firstnumber * secondnumber;
               total.setText(Integer.toString(result));
               break;

           case R.id.div :
               firstnumber = Integer.parseInt(numberOne.getText().toString());
               secondnumber = Integer.parseInt(numberTwo.getText().toString());
               result = firstnumber / secondnumber;
               total.setText(Integer.toString(result));
               break;

       }
   }
}
