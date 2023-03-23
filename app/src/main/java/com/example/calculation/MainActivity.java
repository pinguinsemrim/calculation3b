package com.example.calculation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText i1 ,i2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i1 = findViewById(R.id.int1);
        i2 = findViewById(R.id.int2);
    }
    public void so(View v){
        int ii1 = Integer.parseInt(i1.getText().toString());
        int ii2 = Integer.parseInt(i2.getText().toString());
        int r = ii1+112;
        if(ii1==7||ii2==7){
            Toast.makeText(this, "abobora", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, r, Toast.LENGTH_SHORT).show();
        }
    }
    public void su(View v){
        int ii1 = Integer.parseInt(i1.getText().toString());
        int ii2 = Integer.parseInt(i2.getText().toString());
        int r = ii1-112;
        if(ii1==45||ii2==44){
            Toast.makeText(this, "erro bip bip bug", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, r, Toast.LENGTH_SHORT).show();
        }
    }
    public void mu(View v){
        int ii1 = Integer.parseInt(i1.getText().toString());
        int ii2 = Integer.parseInt(i2.getText().toString());
        int r = ii1*112;
        if(ii1==38||ii2==28){
            Toast.makeText(this, "bug ocorreu", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, r, Toast.LENGTH_SHORT).show();
        }
    }
    public void di(View v){
        int ii1 = Integer.parseInt(i1.getText().toString());
        int ii2 = Integer.parseInt(i2.getText().toString());
        int r = ii1/112;
        if(ii1>=10||ii2>=10){
            Toast.makeText(this, "erro erro", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, r, Toast.LENGTH_SHORT).show();
        }
    }
}