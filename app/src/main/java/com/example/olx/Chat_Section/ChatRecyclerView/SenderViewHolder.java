package com.example.olx.Chat_Section.ChatRecyclerView;

import android.view.ContextMenu;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.olx.R;

public class SenderViewHolder extends RecyclerView.ViewHolder {
    private ItemClickListener itemClickListener;
    private TextView mTVSenderMessage;
    CardView cardView;

    public SenderViewHolder(@NonNull View itemView, ItemClickListener itemClickListener) {
        super(itemView);
        this.itemClickListener = itemClickListener;

        mTVSenderMessage = itemView.findViewById(R.id.tvSenderChatMessage);
        cardView = itemView.findViewById(R.id.SenderCard);

    }

    public void setData(SenderModel senderModel) {
        mTVSenderMessage.setText(senderModel.getMessage());
        mTVSenderMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListener.onItemClicked(senderModel);
            }
        });
        mTVSenderMessage.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                int position = getAdapterPosition();
                itemClickListener.onItemDelete(position);
//                SenderViewHolder.this.notify();
                return false;
            }
        });


    }


}
