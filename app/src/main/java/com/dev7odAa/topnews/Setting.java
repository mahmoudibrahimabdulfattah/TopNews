package com.dev7odAa.topnews;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Setting extends AppCompatActivity {

    private AdView mAdView;

    private EditText ed_country, ed_language;
    private Button btn_send;
    private String country;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        mAdView = findViewById(R.id.adView);
        ed_country = findViewById(R.id.ed_country);
        btn_send = findViewById(R.id.btn_send);


        MobileAds.initialize(this, "ca-app-pub-4816438909032207/3004671828");
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                country = ed_country.getText().toString();

                Intent intent = new Intent(Setting.this, MainActivity.class);
                intent.putExtra("countrykey",country);
                startActivity(intent);
            }
        });

    }
}
