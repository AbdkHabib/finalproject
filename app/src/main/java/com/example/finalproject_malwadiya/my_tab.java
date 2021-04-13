package com.example.finalproject_malwadiya;

import androidx.fragment.app.Fragment;

public class my_tab {
    String tabname;
    Fragment fragment;

    public my_tab(String tabname, Fragment fragment) {
        this.tabname = tabname;
        this.fragment = fragment;
    }

    public String getTabname() {
        return tabname;
    }

    public void setTabname(String tabname) {
        this.tabname = tabname;
    }

    public Fragment getFragment() {
        return fragment;
    }

    public void setFragment(Fragment fragment) {
        this.fragment = fragment;
    }
}
