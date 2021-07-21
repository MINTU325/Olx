package com.example.olx;

import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;
import com.example.olx.Fragments.AccountFragment;
import com.example.olx.Fragments.ChatFragment;
import com.example.olx.Fragments.MyadsFragment;
import com.example.olx.Fragments.SellFragment;

public class MainActivity extends AppCompatActivity {
//FrameLayout
    MeowBottomNavigation bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.bottomNav);

        bottomNavigationView.add(new MeowBottomNavigation.Model(1, R.drawable.ic_home));
        bottomNavigationView.add(new MeowBottomNavigation.Model(2, R.drawable.ic_baseline_chat_bubble_outline_24));
        bottomNavigationView.add(new MeowBottomNavigation.Model(3, R.drawable.ic_ad));
        bottomNavigationView.add(new MeowBottomNavigation.Model(4, R.drawable.ic_heart_like_love_icon));
        bottomNavigationView.add(new MeowBottomNavigation.Model(5, R.drawable.ic_baseline_account_circle_24));
        bottomNavigationView.setOnShowListener(new MeowBottomNavigation.ShowListener() {
            @Override
            public void onShowItem(MeowBottomNavigation.Model item) {
                Fragment fragment = null;
                switch (item.getId()) {
                    case 1:
                        fragment = new com.example.olx.HomeFragment();

                        break;
                    case 2:
                        fragment = new ChatFragment();
                        break;

                    case 3:
                        fragment = new SellFragment();
                        break;
                    case 4:
                        fragment = new MyadsFragment();
                        break;

                    case 5:
                        fragment = new AccountFragment();
                        break;


                    default:
                        throw new IllegalStateException("Unexpected value: " + item.getId());
                }
                LoadFragment(fragment);
            }
        });

        bottomNavigationView.setCount(1, "10");
        bottomNavigationView.show(2, true);
        bottomNavigationView.setOnClickMenuListener(new MeowBottomNavigation.ClickListener() {
            @Override
            public void onClickItem(MeowBottomNavigation.Model item) {
                Toast.makeText(getApplicationContext(), "You Clicked"+ item.getId(), Toast.LENGTH_SHORT).show();
            }
        });

        bottomNavigationView.setOnReselectListener(new MeowBottomNavigation.ReselectListener() {
            @Override
            public void onReselectItem(MeowBottomNavigation.Model item) {
                Toast.makeText(getApplicationContext(), "You Clicked Reselect"+ item.getId(), Toast.LENGTH_SHORT).show();

            }
        });
    }

    private void LoadFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction().replace(R.id.Container,fragment).commit();


    }
}