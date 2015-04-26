package com.example.psibion.myapplicationplus;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MenuFragment extends Fragment {

    private IFragmentCotainer fragmentContainer;
    public MenuFragment(){}

    @Override
    public void onAttach(Activity activity){

        super.onAttach(activity);
        fragmentContainer = (IFragmentCotainer)activity;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState){

        View view = inflater.inflate(R.layout.menu_fragment,container,false);

        Button btnSimple = (Button) view.findViewById(R.id.btnSimple);
        Button btnAdvance = (Button) view.findViewById(R.id.btnAdvance);
        Button btnAbout = (Button) view.findViewById(R.id.btnAbout);
        Button btnExit = (Button) view.findViewById(R.id.btnExit);

        btnSimple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentContainer.replaceFragment(new SimpleFragment());
            }
        });

        btnAdvance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentContainer.replaceFragment(new AdvancedFragment());
            }
        });

        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentContainer.replaceFragment(new AboutFragment());
            }
        });

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().finish();
                System.exit(0);
            }
        });

        return view;
    }
}

