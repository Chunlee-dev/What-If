package com.chunleedev.whatif.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.chunleedev.whatif.R;
import com.chunleedev.whatif.models.ChatModel;

import java.util.ArrayList;

public class ChatRcv extends RecyclerView.Adapter<ChatRcv.ChatHolder> {

    private ArrayList<ChatModel> chatModels;
    private Context context;

    public ChatRcv(ArrayList<ChatModel> chatModels, Context context){
        this.chatModels = chatModels;
        this.context = context;
    }

    @NonNull
    @Override
    public ChatHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.second_adapter, parent, false);
        return new ChatHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChatHolder holder, int position) {
        ChatModel currentModel = chatModels.get(position);

        holder.lastMsgTv.setText(currentModel.getLastText());
        holder.chatTitleTv.setText(currentModel.getChatTitle());
        holder.unreadTextTv.setText(currentModel.getUnreadText());
        holder.msgTimeTv.setText(currentModel.getMsgTime());
        Glide
                .with(context)
                .load(currentModel.getDpUrl())
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .centerCrop()
                .placeholder((R.color.colorAccent))
                .error(R.color.colorAccent)
                .into(holder.chatDpImg);

    }

    @Override
    public int getItemCount() {
        return chatModels.size();
    }

    static class ChatHolder extends RecyclerView.ViewHolder{

        TextView unreadTextTv,
                msgTimeTv,
                chatTitleTv,
                lastMsgTv;

        ImageView chatDpImg;

        ChatHolder(View itemView){
            super(itemView);

            unreadTextTv = itemView.findViewById(R.id.unread_msg_count);
            msgTimeTv = itemView.findViewById(R.id.msg_time);
            chatTitleTv = itemView.findViewById(R.id.chat_title);
            lastMsgTv = itemView.findViewById(R.id.last_message);
            chatDpImg = itemView.findViewById(R.id.chat_dp);

        }

    }
}
