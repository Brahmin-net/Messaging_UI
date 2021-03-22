package com.example.chatui;

public class ChatResponse extends ChatObject {

    @Override
    public int getType(){
        return ChatObject.RESPONSE_OBJECT;
    }
}
