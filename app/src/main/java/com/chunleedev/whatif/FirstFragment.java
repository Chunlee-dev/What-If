package com.chunleedev.whatif;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.chunleedev.whatif.adapters.FeedRcv;
import com.chunleedev.whatif.adapters.StoryAdapter;
import com.chunleedev.whatif.models.FeedModels;
import com.chunleedev.whatif.models.StoryModel;

import java.util.ArrayList;

public class FirstFragment extends Fragment {

    private String[] imgUrls = {
            "https://w.wallhaven.cc/full/47/wallhaven-47w273.png",
            "https://w.wallhaven.cc/full/96/wallhaven-96ywyx.jpg",
            "https://w.wallhaven.cc/full/4g/wallhaven-4g8x23.jpg",
            "https://w.wallhaven.cc/full/ln/wallhaven-lnkyd4.jpg",
            "https://w.wallhaven.cc/full/43/wallhaven-43j3o3.png",
            "https://w.wallhaven.cc/full/49/wallhaven-49loxd.jpg",
            "https://w.wallhaven.cc/full/4o/wallhaven-4oxk57.png",
            "https://w.wallhaven.cc/full/0w/wallhaven-0wwrq7.jpg",
            "https://w.wallhaven.cc/full/4o/wallhaven-4o75pn.jpg",
            "https://w.wallhaven.cc/full/4o/wallhaven-4o711m.jpg",
            "https://w.wallhaven.cc/full/13/wallhaven-131myv.jpg",
            "https://w.wallhaven.cc/full/0w/wallhaven-0w9qox.jpg",
            "https://wallpaperset.com/w/full/1/4/a/56655.jpg",
            "https://wallpaperset.com/w/full/c/4/1/56649.jpg",
            "https://wallpaperset.com/w/full/1/9/9/56646.jpg",
            "https://wallpaperset.com/w/full/f/f/6/56645.jpg",
            "https://wallpaperset.com/w/full/2/5/8/56643.jpg",
            "https://wallpaperset.com/w/full/3/2/d/56640.jpg",
            "https://wallpaperset.com/w/full/c/2/e/56638.jpg",
            "https://wallpaperset.com/w/full/4/8/8/56636.jpg",
            "https://wallpaperset.com/w/full/7/b/b/56635.jpg"
    };

    private String[] titles = {"Mufasa Valdo", "Sarabi Lopez", "Simba Patel", "Nala Quinn", "Kiara Yakub", "Timon Zafar", "Kovu Mason",
            "Pumbaa Trott", "Rafiki Xiang", "Shenzi Hills", "Usman Irwin", "White Smith", "Frank GOsh", "Adam Baker", "Clark Clein"};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView rcvStory = view.findViewById(R.id.story_rcv);
        ArrayList<StoryModel> storyList = new ArrayList<>();

        rcvStory.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        rcvStory.setHasFixedSize(true);

        storyList.add(new StoryModel(imgUrls[0]));
        storyList.add(new StoryModel(imgUrls[1]));
        storyList.add(new StoryModel(imgUrls[2]));
        storyList.add(new StoryModel(imgUrls[3]));
        storyList.add(new StoryModel(imgUrls[4]));
        storyList.add(new StoryModel(imgUrls[5]));
        storyList.add(new StoryModel(imgUrls[6]));
        storyList.add(new StoryModel(imgUrls[7]));
        storyList.add(new StoryModel(imgUrls[8]));
        storyList.add(new StoryModel(imgUrls[9]));
        storyList.add(new StoryModel(imgUrls[10]));
        storyList.add(new StoryModel(imgUrls[11]));
        storyList.add(new StoryModel(imgUrls[12]));
        storyList.add(new StoryModel(imgUrls[13]));
        storyList.add(new StoryModel(imgUrls[14]));
        storyList.add(new StoryModel(imgUrls[15]));
        storyList.add(new StoryModel(imgUrls[16]));
        storyList.add(new StoryModel(imgUrls[17]));
        storyList.add(new StoryModel(imgUrls[18]));
        storyList.add(new StoryModel(imgUrls[19]));
        storyList.add(new StoryModel(imgUrls[20]));

        StoryAdapter storyAdapter = new StoryAdapter(storyList, getContext());
        rcvStory.setAdapter(storyAdapter);

        RecyclerView recyclerView = view.findViewById(R.id.feed_rcv);
        ArrayList<FeedModels> mList = new ArrayList<>();

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);

        mList.add(new FeedModels(imgUrls[18], imgUrls[0], titles[0], "Welcome to chunlee gram, the covik free chat room!", "10:45AM"));
        mList.add(new FeedModels(imgUrls[17], imgUrls[1], titles[1], "Welcome to chunlee gram, the covik free chat room!", "10:45AM"));
        mList.add(new FeedModels(imgUrls[16], imgUrls[2], titles[2], "Welcome to chunlee gram, the covik free chat room!", "10:45AM"));
        mList.add(new FeedModels(imgUrls[15], imgUrls[3], titles[3], "Welcome to chunlee gram, the covik free chat room!", "10:45AM"));
        mList.add(new FeedModels(imgUrls[14], imgUrls[4], titles[4], "Welcome to chunlee gram, the covik free chat room!", "10:45AM"));
        mList.add(new FeedModels(imgUrls[13], imgUrls[5], titles[5], "Welcome to chunlee gram, the covik free chat room!", "10:45AM"));
        mList.add(new FeedModels(imgUrls[12], imgUrls[6], titles[6], "Welcome to chunlee gram, the covik free chat room!", "10:45AM"));
        mList.add(new FeedModels(imgUrls[11], imgUrls[7], titles[7], "Welcome to chunlee gram, the covik free chat room!", "10:45AM"));
        mList.add(new FeedModels(imgUrls[10], imgUrls[8], titles[8], "Welcome to chunlee gram, the covik free chat room!", "10:45AM"));
        mList.add(new FeedModels(imgUrls[9], imgUrls[9], titles[9], "Welcome to chunlee gram, the covik free chat room!", "10:45AM"));
        mList.add(new FeedModels(imgUrls[8], imgUrls[10], titles[10], "Welcome to chunlee gram, the covik free chat room!", "10:45AM"));
        mList.add(new FeedModels(imgUrls[7], imgUrls[11], titles[11], "Welcome to chunlee gram, the covik free chat room!", "10:45AM"));
        mList.add(new FeedModels(imgUrls[6], imgUrls[12], titles[12], "Welcome to chunlee gram, the covik free chat room!", "10:45AM"));
        mList.add(new FeedModels(imgUrls[5], imgUrls[13], titles[13], "Welcome to chunlee gram, the covik free chat room!", "10:45AM"));
        mList.add(new FeedModels(imgUrls[4], imgUrls[14], titles[14], "Welcome to chunlee gram, the covik free chat room!", "10:45AM"));
        mList.add(new FeedModels(imgUrls[2], imgUrls[15], titles[11], "Welcome to chunlee gram, the covik free chat room!", "10:45AM"));
        mList.add(new FeedModels(imgUrls[1], imgUrls[16], titles[12], "Welcome to chunlee gram, the covik free chat room!", "10:45AM"));
        mList.add(new FeedModels(imgUrls[3], imgUrls[17], titles[13], "Welcome to chunlee gram, the covik free chat room!", "10:45AM"));
        mList.add(new FeedModels(imgUrls[10], imgUrls[18], titles[14], "Welcome to chunlee gram, the covik free chat room!", "10:45AM"));


        FeedRcv feedRcv = new FeedRcv(mList, getContext());
        recyclerView.setAdapter(feedRcv);
    }
}
