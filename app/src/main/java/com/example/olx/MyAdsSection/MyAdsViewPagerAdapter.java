package com.example.olx.MyAdsSection;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class MyAdsViewPagerAdapter extends FragmentStateAdapter {


    public MyAdsViewPagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        switch (position) {
            case 1:
                return new SecondFragment();


        }
        return new  FirstFragment();
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
