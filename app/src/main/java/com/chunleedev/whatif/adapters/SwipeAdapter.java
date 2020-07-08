package com.chunleedev.whatif.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.chunleedev.whatif.R;
import com.chunleedev.whatif.models.ServiceModel;

import java.util.List;

public class SwipeAdapter extends PagerAdapter {

    private List<ServiceModel> models;
    private Context context;

    public SwipeAdapter(Context context, List<ServiceModel> models){
        this.context = context;
        this.models = models;
    }

    @Override
    public int getCount() {
        return models.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view.equals(object));
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        assert layoutInflater != null;
        View swipe_view = layoutInflater.inflate(R.layout.pager_adapter, container, false);

        ImageView imageView = swipe_view.findViewById(R.id.service_image);
        TextView price = swipe_view.findViewById(R.id.service_price);

        ServiceModel currentModel = models.get(position);

        price.setText(currentModel.getPrice());
        Glide
                .with(context)
                .load(currentModel.getImageUrl())
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .centerCrop()
                .placeholder((android.R.color.darker_gray))
                .error(R.color.colorAccent)
                .into(imageView);

        container.addView(swipe_view);
        return swipe_view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
     }
}
