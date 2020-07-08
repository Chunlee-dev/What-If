package com.chunleedev.whatif.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.chunleedev.whatif.R;
import com.chunleedev.whatif.models.FeedModels;
import com.chunleedev.whatif.models.ServiceModel;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class FeedRcv extends RecyclerView.Adapter<FeedRcv.FeedHolder> {

    private ArrayList<FeedModels> feedModels;
    private Context context;

    private String[] shoeUrl = {"https://unsplash.com/photos/NOpsC3nWTzY",
            "https://unsplash.com/photos/CJ6SJO_yR5w",
            "https://unsplash.com/photos/PqbL_mxmaUE",
            "https://unsplash.com/photos/tjvURCarBf0",
            "https://unsplash.com/photos/6zO5VKogoZE",
            "https://unsplash.com/photos/q4ExhrHaSLY",
            "https://unsplash.com/photos/a-QH9MAAVNI",
            "https://unsplash.com/photos/4qSb_FWhHKs"};

    public FeedRcv(ArrayList<FeedModels> feedModels, Context context) {
        this.feedModels = feedModels;
        this.context = context;
    }

    @NonNull
    @Override
    public FeedHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.market_adapter, parent, false);
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
                .load(currentModel.getProfilePhoto())
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .centerCrop()
                .placeholder((R.color.colorAccent))
                .error(R.color.colorAccent)
                .into(holder.profilePicture);

        List<ServiceModel> pagerModel = new ArrayList<>();

        pagerModel.add(new ServiceModel(shoeUrl[0], "$20"));
        pagerModel.add(new ServiceModel(shoeUrl[1], "$30"));
        pagerModel.add(new ServiceModel(shoeUrl[2], "$45"));
        pagerModel.add(new ServiceModel(shoeUrl[3], "$25"));
        pagerModel.add(new ServiceModel(shoeUrl[4], "$50"));
        pagerModel.add(new ServiceModel(shoeUrl[5], "$35"));
        pagerModel.add(new ServiceModel(shoeUrl[6], "$40"));
        pagerModel.add(new ServiceModel(shoeUrl[7], "$60"));

        SwipeAdapter adapter = new SwipeAdapter(context, pagerModel);

        holder.viewPager.setAdapter(adapter);

        holder.tabLayout.setupWithViewPager(holder.viewPager);

    }

    @Override
    public int getItemCount() {
        return feedModels.size();
    }

    static class FeedHolder extends RecyclerView.ViewHolder {

        CircleImageView profilePicture;
        TextView feedPostTitle;
        TextView feedTimeStamp;
        TextView feedUserText;
        ImageView likeBtn, icon2, icon3;
        TextView likeNumber, commentNumber;
        ViewPager viewPager;
        TabLayout tabLayout;

        FeedHolder(View itemView) {
            super(itemView);

            profilePicture = itemView.findViewById(R.id.profile_picture);
            feedPostTitle = itemView.findViewById(R.id.vendor_name);
            feedTimeStamp = itemView.findViewById(R.id.upload_time);
            feedUserText = itemView.findViewById(R.id.merch_description);
            likeBtn = itemView.findViewById(R.id.like_btn);
            icon2 = itemView.findViewById(R.id.icon2);
            icon3 = itemView.findViewById(R.id.icon3);
            likeNumber = itemView.findViewById(R.id.like_number);
            commentNumber = itemView.findViewById(R.id.comment_number);
            viewPager = itemView.findViewById(R.id.product_viewPager);
            tabLayout = itemView.findViewById(R.id.pager_tab);

        }

    }
}
