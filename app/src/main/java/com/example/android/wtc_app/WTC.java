package com.example.android.wtc_app;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class WTC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wtc);
    }

    public void Map(View view) {
        Uri gmmMapIntent = Uri.parse("geo:51.5163042,-3.2207376?q=Whitchurch Tennis Club");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmMapIntent);
        mapIntent.setPackage("com.google.android.apps.maps");
        if (mapIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(mapIntent);
        }
    }
}
