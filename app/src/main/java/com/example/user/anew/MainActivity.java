package com.example.user.anew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
   public EditText edtxt;
     double a;
    boolean plus;
    double sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        edtxt = (EditText) findViewById(R.id.edtxt);
    }

    public void plus(View view) {
        String st=edtxt.getText().toString();
        edtxt.setText("");
        
    }

    public void minus(View view) {
        String st=edtxt.getText().toString();
        Double edtxt=Double.parseDouble(st);




    }
}
