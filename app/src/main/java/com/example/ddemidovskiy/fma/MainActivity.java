package com.example.ddemidovskiy.fma;

import android.support.v4.view.ViewPager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.GridView;

import com.example.ddemidovskiy.fma.albums.AlbumsLoad;
import com.example.ddemidovskiy.fma.artists.ArtistsLoad;


public class MainActivity extends AppCompatActivity  {

    /*private ArtistsLoad artistsLoad = new ArtistsLoad();
    private Grid artistsGrid = new Grid();

    private AlbumsLoad albumsLoad = new AlbumsLoad();
    private Grid albumsGrid = new Grid();*/

    public static DBHelper helper;

    private ViewPager viewPager;
    //private FragmentManager fragmentManager;
    private ViewPagerAdapter viewPagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helper = new DBHelper(this);
        Log.d("dimmy", "Main Act: db helper created.");

        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        Log.d("dimmy", "Main Act: adapter created.");

        viewPager = (ViewPager) findViewById(R.id.view_pager);
        viewPager.setAdapter(viewPagerAdapter);
        Log.d("dimmy", "Main Act: adapter set to view.");

        viewPagerAdapter.addFragment(GridFragment.newInstance("artists", this));
        viewPagerAdapter.addFragment(GridFragment.newInstance("albums", this));
        Log.d("dimmy", "Main Act: fragments added.");

        viewPagerAdapter.notifyDataSetChanged();
        Log.d("dimmy", "Main Act: adapter notified.");


    }

}
