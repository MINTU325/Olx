package com.example.olx.Chat_Section.ChatRecyclerView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.icu.text.SimpleDateFormat;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.olx.R;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.Format;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.*;

public class ChatActivity extends AppCompatActivity implements ItemClickListener {

    private List<ChatModel> chatModelList = new ArrayList<>();
    private EditText mETChatMessage;
    private EditText mETType;

    private TextView mBTNSend;
    private RecyclerView recyclerView;
    private ChatAdapter chatAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        initView();
        setRecyclerAdapter();

    }

    private void setRecyclerAdapter() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        chatAdapter = new ChatAdapter(chatModelList, this);
        recyclerView.setAdapter(chatAdapter);

    }

    private void initView() {
        recyclerView = findViewById(R.id.recyclerView);
        mETChatMessage = findViewById(R.id.etChatMessage);
        mETType = findViewById(R.id.etSenderOrReceiver);
        mBTNSend = findViewById(R.id.btnSend);
        mBTNSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buildChatList();
            }
        });


    }

    private void buildChatList() {
        if (mETType.getText().toString().equals("1")) {
            chatModelList.add(new SenderModel(mETChatMessage.getText().toString()));
        } else if (mETType.getText().toString().equals("2")) {
            chatModelList.add(new ReceiverModel(mETChatMessage.getText().toString(), getFormattedDate()));
        }
        chatAdapter.notifyDataSetChanged();
    }


    public String getFormattedDate() {
        Timestamp stamp = new Timestamp(currentTimeMillis());
        Date date = new Date((stamp.getTime()));
        Format hourMinFormat = null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            hourMinFormat = new SimpleDateFormat("HH.mm");
        }
        return hourMinFormat.format(date);

    }


    @Override
    public void onItemClicked(ChatModel model) {
        if (model instanceof SenderModel) {
            Toast.makeText(this, "sender item clicked ", Toast.LENGTH_SHORT).show();

        } else {
            Toast.makeText(this, "receiver item clicked ", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onItemDelete(int position) {
        chatModelList.remove(position);
        chatAdapter.notifyItemRemoved(position);
//                chatAdapter.notifyDataSetChanged();



    }
}





