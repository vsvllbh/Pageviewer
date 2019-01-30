package com.example.pageviewer;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
ViewPager pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] mResources = {"R.drawable.ic_launcher_background",
                                    "R.drawable.ic_launcher_foreground",
                                    "R.drawable.ic_launcher_background",
                                   "R.drawable.ic_launcher_foreground"};


        pager =  findViewById(R.id.pager);

        pager.setAdapter(new ViewPageAdapter(this, mResources));

    }
}
