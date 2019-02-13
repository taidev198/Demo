package com.example.basiccalculatorapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator_layout);

        textView = findViewById(R.id.textView);

    }



    public void sin(View view) {
    }

    public void cos(View view) {
    }

    public void tan(View view) {
    }

    public void cot(View view) {
    }

    public void rand(View view) {
    }

    public void ce(View view) {
        if(textView.getText().length() >0){
            if(textView.getText().length() ==1)
                textView.setText("0");
                else
            textView.setText(textView.getText().subSequence(0, textView.getText().length()-1));
        }
    }

    public void ac(View view) {
    }

    public void seven(View view) {
        if (textView.getText().toString().equals("0"))
            textView.setText("7");
        else{
            if(textView.getText().length() < 10)
            textView.setText(textView.getText().toString() +"7");
        }

    }
    public void four(View view) {
        if (textView.getText().toString().equals("0"))
            textView.setText("4");
        else{
            if(textView.getText().length() < 10)
            textView.setText(textView.getText().toString() +"4");
        }

    }

    public void five(View view) {
        if (textView.getText().toString().equals("0"))
            textView.setText("5");
        else{
            if(textView.getText().length() < 10)
            textView.setText(textView.getText().toString() +"5");
        }

    }

    public void divide(View view) {
    }

    public void eight(View view) {
        if (textView.getText().toString().equals("0"))
            textView.setText("8");
        else{
            if(textView.getText().length() < 10)
            textView.setText(textView.getText().toString() +"8");
        }

    }

    public void nine(View view) {
        if (textView.getText().toString().equals("0"))
            textView.setText("9");
        else{
            if(textView.getText().length() < 10)
            textView.setText(textView.getText().toString() +"9");
        }

    }

    public void multiple(View view) {
    }

    public void six(View view) {
        if (textView.getText().toString().equals("0"))
            textView.setText("6");
        else{
            if(textView.getText().length() < 10)
            textView.setText(textView.getText().toString() +"6");
        }

    }

    public void add(View view) {
        textView.setText(textView.getText().toString() +"\n+\n");
    }

    public void one(View view) {
        if (textView.getText().toString().equals("0"))
            textView.setText("1");
        else{
            if(textView.getText().length() < 10)
            textView.setText(textView.getText().toString() +"1");
        }

    }

    public void two(View view) {
        if (textView.getText().toString().equals("0"))
            textView.setText("2");
        else{
            if(textView.getText().length() < 10)
            textView.setText(textView.getText().toString() +"2");
        }

    }

    public void three(View view) {
        if (textView.getText().toString().equals("0"))
            textView.setText("3");
        else{
            textView.setText(textView.getText().toString() +"3");
        }

    }

    public void sub(View view) {

    }

    public void zero(View view) {

        if(textView.getText().length() < 10)
            textView.setText(textView.getText().toString() +"0");
    }

    public void dot(View view) {
        if(!textView.getText().toString().contains("."))
            textView.setText(textView.getText().toString() +".");
    }

    public void result(View view) {

    }

}
