package com.example.olx.Chat_Section.ChatRecyclerView;

import android.view.View;
import android.widget.Adapter;

public interface ItemClickListener {
    void onItemClicked(ChatModel model);
    void onItemDelete(int position);

}
