package com.example.olx.ShowProductDetailForBike;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.olx.R;
import com.example.olx.ShowProductDetail.ProductDetailViewPagerAdapter;
import com.google.android.material.tabs.TabLayout;

public class BikeDetailActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager2 ViewPager;
    BikeDetailAdapter bikeDetailAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bike_detail);


        tabLayout = findViewById(R.id.btabLayout);
        ViewPager = findViewById(R.id.bViewPageerr);

        FragmentManager fm2 = getSupportFragmentManager();
        bikeDetailAdapter = new BikeDetailAdapter(fm2, getLifecycle());
        ViewPager.setAdapter(bikeDetailAdapter);
//        tabLayout.addTab(tabLayout.newTab().setText("pic1"));
//        tabLayout.addTab(tabLayout.newTab().setText("pic2"));
//        tabLayout.addTab(tabLayout.newTab().setText("pic3"));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                ViewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        ViewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tabLayout.selectTab(tabLayout.getTabAt(position));


            }
        });

    }

}
