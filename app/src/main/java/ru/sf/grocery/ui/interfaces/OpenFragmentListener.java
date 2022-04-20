package ru.sf.grocery.ui.interfaces;

import androidx.fragment.app.Fragment;

public interface OpenFragmentListener {

    void addFragment(Fragment fragment);
    void addFragment(int id, Fragment fragment);

    void replaceFragment(Fragment fragment);

}