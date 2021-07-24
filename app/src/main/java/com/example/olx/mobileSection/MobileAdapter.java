package com.example.olx.mobileSection;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.olx.R;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MobileAdapter extends RecyclerView.Adapter<MobileViewHolder> {
    private List<Mobiles> mobilesList;
    private List<Mobiles> mobilesListFull;

    ItemClickListenerMObile itemClickListenerMObile;

    public MobileAdapter(List<Mobiles> mobilesList, ItemClickListenerMObile itemClickListenerMObile) {
        this.mobilesList = mobilesList;
        this.itemClickListenerMObile = itemClickListenerMObile;
        mobilesListFull= new ArrayList<>(mobilesList);
    }

    @NonNull
    @Override
    public MobileViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new MobileViewHolder(view, itemClickListenerMObile);
    }

    @Override
    public void onBindViewHolder(@NonNull MobileViewHolder holder, int position) {
        Mobiles mobiles = mobilesList.get(position);
        holder.SetData(mobiles);

    }

    @Override
    public int getItemCount() {
        return mobilesList.size();
    }


    public void updateData(List<Mobiles> mobilesList) {
        this.mobilesList = mobilesList;
        notifyDataSetChanged();
    }


    public Filter getFilterData() {
        return FilterData;
    }

    private Filter FilterData = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence charSequence) {


            String text = charSequence.toString().toLowerCase();
            List<Mobiles>tempList = new ArrayList<>();
            if(text.length() ==0 || text.isEmpty() ){
                tempList.addAll(mobilesListFull);
            }else {
                for (Mobiles item:mobilesListFull){

                    if((item.getProductName()).contains(text)){
                        tempList.add(item);
                    }

                }
            }
            FilterResults filterResults  = new FilterResults();
            filterResults.values = tempList;
            return filterResults;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            mobilesList.clear();
            mobilesList.addAll((Collection<? extends Mobiles>) results.values);
            notifyDataSetChanged();
        }
    };


}
