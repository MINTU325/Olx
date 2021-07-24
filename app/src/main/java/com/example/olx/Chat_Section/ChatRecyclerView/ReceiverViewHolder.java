package com.example.olx.Chat_Section.ChatRecyclerView;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.olx.R;

import org.w3c.dom.Text;

public class ReceiverViewHolder extends RecyclerView.ViewHolder {
    ItemClickListener itemClickListener;
    private TextView mTVReceiverChatMessage;
    private TextView mTVTime;
    public ReceiverViewHolder(@NonNull View itemView,ItemClickListener itemClickListener) {
        super(itemView);
        this.itemClickListener= itemClickListener;
        mTVReceiverChatMessage = itemView.findViewById(R.id.tvReceiverChatMessage);
        mTVTime = itemView.findViewById(R.id.tvTime);
    }
    public void setData(ReceiverModel  receiverModel){
        mTVReceiverChatMessage.setText(receiverModel.getMessage());
        mTVTime.setText(receiverModel.getTime());

        mTVReceiverChatMessage.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                int position = getAdapterPosition();
                itemClickListener.onItemDelete(position);

                return false;
            }
        });
        mTVReceiverChatMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListener.onItemClicked(receiverModel);
            }
        });

    }

}
