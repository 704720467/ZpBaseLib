package com.zp.baselib.base;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by zp on 2019-09-06
 */
public class BaseFragmentPagerAdapter extends FragmentPagerAdapter {
    private List<Fragment> fragmentList;

    public BaseFragmentPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
        fragmentList = new ArrayList<>();
    }

    public void setFragmentList(List<Fragment> fragmentList) {
        this.fragmentList.addAll(fragmentList);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
}
