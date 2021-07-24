package com.example.olx.Chat_Section.ChatRecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.olx.R;

import java.util.List;

public class ChatAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private ItemClickListener itemClickListener;
    private List<ChatModel> chatModelList;
    ChatAdapter chatAdapter;

    public ChatAdapter(List<ChatModel> chatModelList, ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
        this.chatModelList = chatModelList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;

        switch (viewType) {
            case 1:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.sender_item_layout, parent, false);
                return new SenderViewHolder(view, itemClickListener);

            case 2:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.receiver_item_layout, parent, false);
                return new ReceiverViewHolder(view, itemClickListener);
        }

        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        int itemType = chatModelList.get(position).getType();
        ChatModel chatModel = chatModelList.get(position);
        switch (itemType) {
            case 1:
                if (holder instanceof SenderViewHolder) {
                    ((SenderViewHolder) holder).setData((SenderModel) chatModel);
                }
                break;
            case 2:
                if (holder instanceof ReceiverViewHolder) {
                    ((ReceiverViewHolder) holder).setData((ReceiverModel) chatModel);
                }
                break;
        }
    }

    @Override
    public int getItemViewType(int position) {
        return chatModelList.get(position).getType();
    }

    @Override
    public int getItemCount() {
        return chatModelList.size();
    }


}
