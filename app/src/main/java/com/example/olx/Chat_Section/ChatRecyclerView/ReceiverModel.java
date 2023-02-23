package com.example.olx.Chat_Section.ChatRecyclerView;

public class ReceiverModel extends ChatModel{

    private String message;
    private String time;

    public ReceiverModel(String message, String time) {
        this.message = message;
        this.time = time;
    }

    public String getMessage() {
        return message;
    }

    public String getTime() {
        return time;
    }

    @Override
    public int getType() {
        return 2;
    }
}
