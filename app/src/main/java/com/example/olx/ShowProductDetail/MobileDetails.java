package com.example.olx.ShowProductDetail;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.bumptech.glide.Glide;
import com.example.olx.R;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MobileDetails extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager2 ViewPager;
    pic1Fragment pic1Fragment;
    private TextView mPhonePrice;
    private TextView mPhoneName;
    private TextView mPhonePlace;
    private ImageView mImageView;
    RecyclerView mHorizontalRecycler;
    ProductDetailViewPagerAdapter productDetailViewPagerAdapter;
    RelatedAdsAdapter relatedAdsAdapter;
    private List<RelatedAdsModelClass> relatedAdsModelClassList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile_details);

        tabLayout = findViewById(R.id.rtabLayout);
        ViewPager = findViewById(R.id.rViewPageerr);
        mHorizontalRecycler = findViewById(R.id.Horizontalrecycler);
        mPhonePrice = findViewById(R.id.phonePriceid);
         mPhoneName = findViewById(R.id.phoneNameid);
        mPhonePlace = findViewById(R.id.phonePlaceid);
//        mImageView =.findViewById(R.id.imageViewPic1);
        LoadViewPAgerAdapter();

        Intent intent = getIntent();
        int price = intent.getIntExtra("price",0);
        String mobile = intent.getStringExtra("mobile");
        String plcee = intent.getStringExtra("place");
        String imagedata = intent.getStringExtra("image");
        mPhonePrice.setText(price+"");
        mPhoneName.setText(mobile);
        mPhonePlace.setText(plcee);
//        Glide.with(mImageView).load(imagedata).into(mImageView);


        BuilddataRelatedAds();
        SetRecyclerAdapterRelatedAds();




    }

    private void SetRecyclerAdapterRelatedAds() {

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false);
        mHorizontalRecycler.setLayoutManager(linearLayoutManager);
         relatedAdsAdapter = new RelatedAdsAdapter(relatedAdsModelClassList);
        mHorizontalRecycler.setAdapter(relatedAdsAdapter);

    }

    private void BuilddataRelatedAds() {
        relatedAdsModelClassList.add(new RelatedAdsModelClass(R.drawable.k20,2000, "Oppo K20 pro", "Mansarovar , Jaipur"));
        relatedAdsModelClassList.add(new RelatedAdsModelClass(R.drawable.oneplusnord5g,27000, "OnePlus Nord 5g", "Mansarova"));
        relatedAdsModelClassList.add(new RelatedAdsModelClass(R.drawable.samsunfdge,21000, "Samsung galaxy Edge 6/128", "MI Road , Jaipur "));
        relatedAdsModelClassList.add(new RelatedAdsModelClass(R.drawable.iphone,32000, "Apple", "Malviya Nagar , Jaipur"));
        relatedAdsModelClassList.add(new RelatedAdsModelClass(R.drawable.redmminote8pro,12000, "Redmi", "Mahesh nagar , Jaipur"));
        relatedAdsModelClassList.add(new RelatedAdsModelClass(R.drawable.opp0a5,15000, "Oppo  A5", "Narendra Nagar"));
        relatedAdsModelClassList.add(new RelatedAdsModelClass(R.drawable.samsunga9,25000, "Samsung A9", "Mansarova"));
        relatedAdsModelClassList.add(new RelatedAdsModelClass(R.drawable.oneplus_3,2000, "Oppo", "Vaisahali Nagar"));
        relatedAdsModelClassList.add(new RelatedAdsModelClass(R.drawable.k20,2000, "Oppo K20 pro", "Mansarovar , Jaipur"));
        relatedAdsModelClassList.add(new RelatedAdsModelClass(R.drawable.oneplusnord5g,27000, "OnePlus Nord 5g", "Mansarova"));
        relatedAdsModelClassList.add(new RelatedAdsModelClass(R.drawable.samsunfdge,21000, "Samsung galaxy Edge 6/128", "MI Road , Jaipur "));
        relatedAdsModelClassList.add(new RelatedAdsModelClass(R.drawable.iphone,32000, "Apple", "Malviya Nagar , Jaipur"));
        relatedAdsModelClassList.add(new RelatedAdsModelClass(R.drawable.redmminote8pro,12000, "Redmi", "Mahesh nagar , Jaipur"));
        relatedAdsModelClassList.add(new RelatedAdsModelClass(R.drawable.opp0a5,15000, "Oppo  A5", "Narendra Nagar"));
        relatedAdsModelClassList.add(new RelatedAdsModelClass(R.drawable.samsunga9,25000, "Samsung A9", "Mansarova"));
        relatedAdsModelClassList.add(new RelatedAdsModelClass(R.drawable.oneplus_3,2000, "Oppo", "Vaisahali Nagar"));
        relatedAdsModelClassList.add(new RelatedAdsModelClass(R.drawable.k20,2000, "Oppo K20 pro", "Mansarovar , Jaipur"));
        relatedAdsModelClassList.add(new RelatedAdsModelClass(R.drawable.oneplusnord5g,27000, "OnePlus Nord 5g", "Mansarova"));
        relatedAdsModelClassList.add(new RelatedAdsModelClass(R.drawable.samsunfdge,21000, "Samsung galaxy Edge 6/128", "MI Road , Jaipur "));
        relatedAdsModelClassList.add(new RelatedAdsModelClass(R.drawable.iphone,32000, "Apple", "Malviya Nagar , Jaipur"));
        relatedAdsModelClassList.add(new RelatedAdsModelClass(R.drawable.redmminote8pro,12000, "Redmi", "Mahesh nagar , Jaipur"));
        relatedAdsModelClassList.add(new RelatedAdsModelClass(R.drawable.opp0a5,15000, "Oppo  A5", "Narendra Nagar"));
        relatedAdsModelClassList.add(new RelatedAdsModelClass(R.drawable.samsunga9,25000, "Samsung A9", "Mansarova"));
        relatedAdsModelClassList.add(new RelatedAdsModelClass(R.drawable.oneplus_3,2000, "Oppo", "Vaisahali Nagar"));

    }


    private void LoadViewPAgerAdapter() {

        FragmentManager fm2 = getSupportFragmentManager();
        productDetailViewPagerAdapter = new ProductDetailViewPagerAdapter(fm2, getLifecycle());
        ViewPager.setAdapter(productDetailViewPagerAdapter);
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
