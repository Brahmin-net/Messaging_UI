package com.example.chatui;

import android.view.View;
import android.widget.TextView;


public class ChatInputVH extends BaseViewHolder {

    private TextView tvInputText;

    public ChatInputVH(View itemView) {
        super(itemView);
        this.tvInputText = itemView.findViewById(R.id.tv_input_text);
    }

    @Override
    public void onBindView(ChatObject object) {
        this.tvInputText.setText(object.getText());
    }
}

