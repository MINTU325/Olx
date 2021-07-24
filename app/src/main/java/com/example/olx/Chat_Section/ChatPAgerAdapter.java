package com.example.olx.Chat_Section;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.olx.MyAdsSection.FirstFragment;
import com.example.olx.MyAdsSection.SecondFragment;

public class ChatPAgerAdapter extends FragmentStateAdapter {

    public ChatPAgerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {


        switch (position) {
            case 1:
                return new BUYINGFragment();
            case 2:
                return new SELLINGFragment();

        }
        return new ALLFragment();

    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
