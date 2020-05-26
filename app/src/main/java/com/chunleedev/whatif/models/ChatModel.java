package com.chunleedev.whatif.models;

public class ChatModel {

    private String unreadText,
            msgTime,
            chatTitle,
            lastText,
            dpUrl;

    public ChatModel(String dpUrl, String chatTitle, String lastText, String msgTime, String unreadText) {
        this.unreadText = unreadText;
        this.msgTime = msgTime;
        this.chatTitle = chatTitle;
        this.lastText = lastText;
        this.dpUrl = dpUrl;
    }

    public String getUnreadText() {
        return unreadText;
    }

    public String getMsgTime() {
        return msgTime;
    }

    public String getChatTitle() {
        return chatTitle;
    }

    public String getLastText() {
        return lastText;
    }

    public String getDpUrl() {
        return dpUrl;
    }
}
