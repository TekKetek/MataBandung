package com.pramudana.sam.matabandung.Activity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

import com.pramudana.sam.matabandung.R;

import butterknife.ButterKnife;
//import butterknife.InjectView;
import butterknife.OnClick;

public class HomeActivity extends AppCompatActivity {

//    @InjectView(R.id.viewPager)
//    ViewPager viewPager;
//    @InjectView(R.id.CVApps)
//    CardView CVApps;
//    @InjectView(R.id.CVAds)
//    CardView CVAds;
//    @Inject View(R.id.CVArch)
//    CardView CVArch;
//    @InjectView(R.id.CVArt)
//    CardView CVArt;
//    @InjectView(R.id.CVCul)
//    CardView CVCul;
//    @InjectView(R.id.CVFash)
//    CardView CVFash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
//        ButterKnife.inject(this);
    }

    @OnClick({R.id.CVApps, R.id.CVAds, R.id.CVArch, R.id.CVArt, R.id.CVCul, R.id.CVFash})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.CVApps:
                break;
            case R.id.CVAds:
                break;
            case R.id.CVArch:
                break;
            case R.id.CVArt:
                break;
            case R.id.CVCul:
                break;
            case R.id.CVFash:
                break;
        }
    }
}
