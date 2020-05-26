package com.chunleedev.whatif.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.chunleedev.whatif.R;
import com.chunleedev.whatif.models.FeedModels;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class FeedRcv extends RecyclerView.Adapter<FeedRcv.FeedHolder> {

    private ArrayList<FeedModels> feedModels;
    private Context context;

    public FeedRcv(ArrayList<FeedModels> feedModels, Context context){
        this.feedModels = feedModels;
        this.context = context;
    }

    @NonNull
    @Override
    public FeedHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.first_adapter, parent, false);
        return new FeedHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FeedHolder holder, int position) {
        FeedModels currentModel = feedModels.get(position);

        holder.feedPostTitle.setText(currentModel.getTitle());
        holder.feedTimeStamp.setText(currentModel.getDate());
        holder.feedUserText.setText(currentModel.getUserText());
        Glide
                .with(context)
                .load(currentModel.getImageUrl())
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .centerCrop()
                .placeholder((R.color.colorAccent))
                .error(R.color.colorAccent)
                .into(holder.feedUserImg);
        Glide
                .with(context)
                .load(currentModel.getProfilePhoto())
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .centerCrop()
                .placeholder((R.color.colorAccent))
                .error(R.color.colorAccent)
                .into(holder.profilePicture);

    }

    @Override
    public int getItemCount() {
        return feedModels.size();
    }

    static class FeedHolder extends RecyclerView.ViewHolder {

        CircleImageView profilePicture;
        CardView feedPhotoCardView;
        TextView feedPostTitle;
        TextView feedTimeStamp;
        ImageView feedOption;
        TextView feedUserText;
        ImageView feedUserImg;
        ImageView likeBtn, icon2, icon3;
        TextView likeNumber, commentNumber;

        FeedHolder(View itemView){
            super(itemView);

            profilePicture = itemView.findViewById(R.id.profile_picture);
            feedPostTitle = itemView.findViewById(R.id.feed_posttitle);
            feedTimeStamp = itemView.findViewById(R.id.feed_timeStamp);
            feedOption = itemView.findViewById(R.id.feed_options);
            feedUserText = itemView.findViewById(R.id.feed_usertxt);
            feedUserImg = itemView.findViewById(R.id.feed_userimg);
            feedPhotoCardView = itemView.findViewById(R.id.photo_cardview);
            likeBtn = itemView.findViewById(R.id.like_btn);
            icon2 = itemView.findViewById(R.id.icon2);
            icon3 = itemView.findViewById(R.id.icon3);
            likeNumber = itemView.findViewById(R.id.like_number);
            commentNumber = itemView.findViewById(R.id.comment_number);

        }

    }
}
