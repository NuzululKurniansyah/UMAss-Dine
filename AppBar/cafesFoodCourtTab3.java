package com.example.android.appbar;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class cafesFoodCourtTab3 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Get the view from fragment_tab_3.xml
        View view = inflater.inflate(R.layout.cafe_details_tab_3, container, false);
        return view;
    }

}
