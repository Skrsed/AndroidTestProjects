package com.example.app4sat7sem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;


import android.os.Bundle;

import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;
import com.tbuonomo.viewpagerdotsindicator.SpringDotsIndicator;
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator;

public class MainActivity extends AppCompatActivity {

    private SpringDotsIndicator dotsIndicator;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        if (viewPager != null) {
            dotsIndicator = (SpringDotsIndicator) findViewById(R.id.dots_indicator);

            viewPager.setAdapter(new ViewPagerAdapter(this));
            dotsIndicator.setViewPager(viewPager);
        }
    }

}
