package com.example.olx.Chat_Section.ChatRecyclerView;

public class SenderModel extends ChatModel{

    private String message;

    public SenderModel(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public int getType() {
        return 1;
    }
}
