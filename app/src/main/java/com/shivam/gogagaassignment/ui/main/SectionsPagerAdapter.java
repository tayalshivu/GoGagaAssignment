package com.shivam.gogagaassignment.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.shivam.gogagaassignment.AppPreferences;
import com.shivam.gogagaassignment.MatchPreferences;
import com.shivam.gogagaassignment.R;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        Fragment fragment = null;
        switch (position){
            case 0:
                fragment = new MatchPreferences();
                break;
            case 1:
                fragment = new AppPreferences();
        }
        return fragment;
    }

    @Nullable
    @Override
    public String getPageTitle(int position) {
        String s="";
        switch (position){
            case 0:
                s+="Match Preferences";
                break;
            case 1:
                s+="App Preferences";
        }
        return s;
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 2;
    }
}