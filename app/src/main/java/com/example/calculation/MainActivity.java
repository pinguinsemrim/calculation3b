package com.example.calculation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText i1 ,i2;
    String mens = "erroz bip bip bug";
    int tatuira = 250;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        i1 = findViewById(R.id.int1);
        i2 = findViewById(R.id.int2);
    }
    public void so(View v){
        int ii1 = Integer.parseInt(i1.getText().toString());
        int ii2 = Integer.parseInt(i2.getText().toString());
        int r = ii1+112;
        resp(ii1,ii2,r);
    }
    public void su(View v){
        int ii1 = Integer.parseInt(i1.getText().toString());
        int ii2 = Integer.parseInt(i2.getText().toString());
        int r = ii1-112;
        resp(ii1,ii2,r);
    }
    public void mu(View v){
        int ii1 = Integer.parseInt(i1.getText().toString());
        int ii2 = Integer.parseInt(i2.getText().toString());
        int r = ii1*112;
        resp(ii1,ii2,r);
    }
    public void di(View v){
        int ii1 = Integer.parseInt(i1.getText().toString());
        int ii2 = Integer.parseInt(i2.getText().toString());
        int r = ii1/112;
       resp(ii1,ii2,r);
    }
    public void resp(int ii1, int ii2, int r){
        if(r>=tatuira){
            Toast.makeText(this,mens, Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "resposta: "+r, Toast.LENGTH_SHORT).show();
        }
    }

}