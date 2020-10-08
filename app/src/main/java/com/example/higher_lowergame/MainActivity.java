package com.example.higher_lowergame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;
    public void makeToast(String message){
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
    }

    public void numberCheck(View view){
        EditText number = (EditText) findViewById(R.id.editTextNumber);
        int answer = Integer.parseInt(number.getText().toString());
        if(answer>randomNumber){
            makeToast("Lower!");
        }
        else if(answer<randomNumber){
            makeToast("Higher!");
        }
        else{
            makeToast("That's right! Now guess another number.");
            Random rand = new Random();
            randomNumber= rand.nextInt(20)+1;
        }



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rand = new Random();
        randomNumber = rand.nextInt(20)+1;
    }
}