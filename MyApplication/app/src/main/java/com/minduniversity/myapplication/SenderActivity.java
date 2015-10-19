package com.minduniversity.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class SenderActivity extends AppCompatActivity implements View.OnClickListener {

    public Beer data;
    static String SENDER_BEER = "SENDER_BEER";

    TextView senderName;
    TextView senderType;
    TextView senderBrand;
    TextView senderDescription;
    Spinner senderImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sender);

        senderName = (TextView) findViewById(R.id.sender_name);
        senderType = (TextView) findViewById(R.id.sender_type);
        senderBrand = (TextView) findViewById(R.id.sender_brand);
        senderDescription = (TextView) findViewById(R.id.sender_description);
        senderImage = (Spinner) findViewById(R.id.sender_image);

        Spinner dropdown = (Spinner) findViewById(R.id.sender_image);
        String[] items = new String[]{"PaleAle", "Porter", "RedAle", "Stout", "Hefeweisen"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);

        findViewById(R.id.button_send).setOnClickListener(this);
    }

    public void SendData() {
        GetBeerData();

        Intent sendIntent = new Intent(this, ReceiverActivity.class);
        sendIntent.putExtra(SENDER_BEER, data);
        startActivity(sendIntent);
    }

    public void GetBeerData() {
        data = new Beer();

        data.setName(senderName.getText().toString());
        data.setType(senderType.getText().toString());
        data.setDescription(senderDescription.getText().toString());
        data.setBrand(senderBrand.getText().toString());
        data.setImage(senderImage.getSelectedItem().toString());
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_send:
                SendData();
                break;
        }
    }
}

