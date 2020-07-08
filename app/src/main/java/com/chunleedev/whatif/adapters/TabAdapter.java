package com.chunleedev.whatif.adapters;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.chunleedev.whatif.FirstFragment;
import com.chunleedev.whatif.SecondFragment;

public class TabAdapter extends FragmentPagerAdapter {

    public TabAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment fragmentItem;

        switch (position){
            case 0: case 2: fragmentItem = new FirstFragment();
                break;
            default: fragmentItem = new SecondFragment();
        }
        return fragmentItem;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String pageTitle;

        switch (position){
            case 0: pageTitle = "Merch";
            break;
            case 1: pageTitle = "Chat";
            break;
            case 2: pageTitle = "Status";
            break;
            default: pageTitle = "Call";
        }
        return pageTitle;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
