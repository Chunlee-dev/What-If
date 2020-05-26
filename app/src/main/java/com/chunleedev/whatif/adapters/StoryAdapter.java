package com.chunleedev.whatif.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.chunleedev.whatif.R;
import com.chunleedev.whatif.models.StoryModel;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.StoryHolder> {

    private ArrayList<StoryModel> storyModels;
    private Context context;

    public StoryAdapter(ArrayList<StoryModel> storyModels, Context context){
        this.storyModels = storyModels;
        this.context = context;
    }

    @NonNull
    @Override
    public StoryHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.story_adapter, parent, false);
        return new StoryHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StoryHolder holder, int position) {
        Glide
                .with(context)
                .load(storyModels.get(position).getImageUrl())
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .centerCrop()
                .placeholder((R.color.colorAccent))
                .error(R.color.colorAccent)
                .into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return storyModels.size();
    }

    static class StoryHolder extends RecyclerView.ViewHolder{

        CircleImageView imageView;

        StoryHolder (View itemView){
            super(itemView);

            imageView = itemView.findViewById(R.id.story_cover);
        }

    }
}
