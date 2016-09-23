package com.example.ddemidovskiy.fma;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ddemidovskiy on 23.09.2016.
 */
public class ViewPagerAdapter extends FragmentPagerAdapter
{
    List<Fragment> fragments = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager fm)
    {
        super(fm);
    }

    @Override
    public Fragment getItem(int position)
    {
        return fragments.get(position);
    }

    @Override
    public int getCount()
    {
        return fragments.size();
    }

    public void addFragment(GridFragment fragment)
    {
        fragments.add(fragment);
    }
}
