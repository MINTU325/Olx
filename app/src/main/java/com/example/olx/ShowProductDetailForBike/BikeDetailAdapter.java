package com.example.olx.ShowProductDetailForBike;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.olx.ShowProductDetail.pic1Fragment;
import com.example.olx.ShowProductDetail.pic2Fragment;
import com.example.olx.ShowProductDetail.pic3Fragment;

public class BikeDetailAdapter  extends FragmentStateAdapter {
    public BikeDetailAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        switch (position) {
            case 1:
                return new Bike2();
            case 2:
                return new Bike3();

        }
        return new Bike1();
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
