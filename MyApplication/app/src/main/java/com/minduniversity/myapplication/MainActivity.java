package com.minduniversity.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_ejercicio1);

        Button buttonOne = (Button) findViewById(R.id.beer_click_1);
        buttonOne.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.beer_click_1:
                Intent intent = new Intent(MainActivity.this, SenderActivity.class);
                startActivity(intent);
                break;
        }
    }

}
