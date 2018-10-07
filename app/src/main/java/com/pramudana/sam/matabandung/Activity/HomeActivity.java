package com.pramudana.sam.matabandung.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

import com.pramudana.sam.matabandung.ListEventActivity;
import com.pramudana.sam.matabandung.R;

import butterknife.ButterKnife;
//import butterknife.InjectView;
import butterknife.OnClick;

public class HomeActivity extends AppCompatActivity {

    CardView CVApps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        CVApps = findViewById(R.id.CVApps);
        CVApps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a1 = new Intent(HomeActivity.this, ListEventActivity.class);
                startActivity(a1);
            }
        });
    }
}
