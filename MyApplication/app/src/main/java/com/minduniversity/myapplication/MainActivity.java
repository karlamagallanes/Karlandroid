package com.minduniversity.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView beerImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_test);

        Button buttonOne= (Button)findViewById(R.id.click_me_1);
        buttonOne.setText(R.string.app_name);

        buttonOne.setOnClickListener(this);

        TextView textView = (TextView)findViewById(R.id.order_beer_text);
        textView.setText("text modified!");

        beerImage=(ImageView)findViewById(R.id.beer_image);

        buttonOne.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                return false;
            }
        });

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.beer_click_1:

                break;

        }
    }
}
