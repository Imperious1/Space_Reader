package net.imperium.imperious.space.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import net.imperium.imperious.space.fragments.PlaceholderFragment;

/**
 * Created by blaze on 9/20/2016.
 */

public class SectionsPagerAdapter extends FragmentStatePagerAdapter {

    private PlaceholderFragment[] fragments = new PlaceholderFragment[6];

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (fragments[position] == null) {
            fragments[position] = PlaceholderFragment.newInstance(position + 1);
        }
        return fragments[position];
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

    public PlaceholderFragment[] getFragments() {
        return fragments;
    }
}