package com.minduniversity.myapplication;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class ReceiverActivity extends AppCompatActivity {

    Beer beer;
    public ImageView receiver_image;
    public TextView receiver_name;
    public TextView receiver_type;
    public TextView receiver_brand;
    public TextView receiver_description;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiver);

        beer = getIntent().getExtras().getParcelable(SenderActivity.SENDER_BEER);
        receiver_name.setText(beer.getName());
        receiver_type.setText(beer.getType());
        receiver_brand.setText(beer.getBrand());
        receiver_description.setText(beer.getDescription());
        Resources res = getResources();

        int resourceId = res.getIdentifier(beer.getImage(), "drawable", getPackageName());
        Drawable drawable = res.getDrawable(resourceId);
        receiver_image.setImageDrawable(drawable);
    }

}
