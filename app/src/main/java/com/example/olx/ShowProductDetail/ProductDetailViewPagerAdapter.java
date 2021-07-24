package com.example.olx.ShowProductDetail;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.olx.MyAdsSection.FirstFragment;
import com.example.olx.MyAdsSection.SecondFragment;
import com.example.olx.MyAdsSection.ThirdFragment;

public class ProductDetailViewPagerAdapter extends FragmentStateAdapter {
    public ProductDetailViewPagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        switch (position) {
            case 1:
                return new pic2Fragment();
            case 2:
                return new pic3Fragment();

        }
        return new pic1Fragment();
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
