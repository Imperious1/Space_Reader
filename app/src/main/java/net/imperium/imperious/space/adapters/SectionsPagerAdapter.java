package net.imperium.imperious.space.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import net.imperium.imperious.space.fragments.PlaceholderFragment;

import java.util.ArrayList;

/**
 * Created by blaze on 9/20/2016.
 */

public class SectionsPagerAdapter extends FragmentStatePagerAdapter {

    private ArrayList<PlaceholderFragment> fragments = new ArrayList<>(6);
    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(fragments.size() != 6) {
            fragments.add(PlaceholderFragment.newInstance(position + 1));
        }
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return 6;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Tech";
            case 1:
                return "Space Flight";
            case 2:
                return "Science & Astronomy";
            case 3:
                return "Search for Life";
            case 4:
                return "Skywatching";
            case 5:
                return "Entertainment";
        }
        return null;
    }

    public ArrayList<PlaceholderFragment> getFragments() {
        return fragments;
    }
}