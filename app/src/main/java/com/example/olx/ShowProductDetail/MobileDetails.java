package com.example.olx.ShowProductDetail;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import com.example.olx.R;
import com.google.android.material.tabs.TabLayout;

public class MobileDetails extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager2 ViewPager;
    ProductDetailViewPagerAdapter productDetailViewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile_details);

        tabLayout = findViewById(R.id.rtabLayout);
        ViewPager = findViewById(R.id.rViewPageerr);

        FragmentManager fm2 = getSupportFragmentManager();
        productDetailViewPagerAdapter = new ProductDetailViewPagerAdapter(fm2, getLifecycle());
        ViewPager.setAdapter(productDetailViewPagerAdapter);
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
