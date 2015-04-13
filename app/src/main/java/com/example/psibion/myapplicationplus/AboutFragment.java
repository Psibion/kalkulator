package com.example.psibion.myapplicationplus;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Łukasz on 2015-03-31.
 */
public class AboutFragment extends Fragment {

    public AboutFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        View rootView = inflater.inflate(R.layout.about_fragment, container, false);

        return rootView;
    }

}
