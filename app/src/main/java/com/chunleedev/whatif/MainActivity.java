package com.chunleedev.whatif;

import android.os.Bundle;

import com.chunleedev.whatif.adapters.StoryAdapter;
import com.chunleedev.whatif.adapters.TabAdapter;
import com.chunleedev.whatif.models.StoryModel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        ViewPager viewPager = findViewById(R.id.view_pager);
        TabLayout tabLayout = findViewById(R.id.tabs);

        TabAdapter tabAdapter = new TabAdapter(getSupportFragmentManager());

        viewPager.setAdapter(tabAdapter);

        tabLayout.setupWithViewPager(viewPager);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
