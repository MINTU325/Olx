package com.example.olx.ShowProductDetail;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.olx.R;

import java.util.List;

public class RelatedAdsAdapter extends RecyclerView.Adapter<RelatedAdsViewHolder> {

    private List<RelatedAdsModelClass> relatedAdsModelClassList;

    public RelatedAdsAdapter(List<RelatedAdsModelClass> relatedAdsModelClassList) {
        this.relatedAdsModelClassList = relatedAdsModelClassList;
    }

    @NonNull
    @Override
    public RelatedAdsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.related_ads_item_layout, parent, false);

        return new RelatedAdsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RelatedAdsViewHolder holder, int position) {
        RelatedAdsModelClass relatedAdsModelClass = relatedAdsModelClassList.get(position);
        holder.Setdata(relatedAdsModelClass);

    }

    @Override
    public int getItemCount() {
        return relatedAdsModelClassList.size();
    }
}
