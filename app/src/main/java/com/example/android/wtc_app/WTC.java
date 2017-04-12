package com.example.android.wtc_app;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import static com.example.android.wtc_app.R.id.address;

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



    public void email(View view){
        String emailAddress =  "info@whitchurchtenniscardiff.co.uk";
        String title = "Enquiry";
        composeEmail(emailAddress, title);
    }

    private void composeEmail(String emailAddress, String subject) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("*/*)");
        intent.putExtra(Intent.EXTRA_EMAIL, address);
        //intent.putExtra(intent.EXTRA_SUBJECT, subject);
        if(intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }


}
