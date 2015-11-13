package com.minduniversity.fragment.Fragments;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.minduniversity.fragment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {
    public static final String MY_TEXT_KEY="my_text_key";
    private String ourValue;
    private TextView myTextReceiver;

    public static SecondFragment newInstance(String value){
        SecondFragment fragment=new SecondFragment();
        Bundle args = new Bundle();
        args.putString(MY_TEXT_KEY,value);
        fragment.setArguments(args);
        return fragment;
    }


    public SecondFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstaceState) {
        super.onCreate(savedInstaceState);
        ourValue = getArguments().getString(MY_TEXT_KEY);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_second, container, false);
        myTextReceiver = (TextView) rootView.findViewById(R.id.my_text_receiver);
        if (ourValue != null)
            myTextReceiver.setText(ourValue);
        return rootView;
    }
}
