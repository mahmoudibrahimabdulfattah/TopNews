package com.dev7odAa.topnews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class ads extends AppCompatActivity {

    private TextView textView;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ads);

        textView = findViewById(R.id.txt_view);
        mAdView = findViewById(R.id.adView);

        MobileAds.initialize(this, "ca-app-pub-4816438909032207/3004671828");
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        Intent intent = getIntent();
        String v = intent.getStringExtra("key");

        textView.setText(v);
    }
}
