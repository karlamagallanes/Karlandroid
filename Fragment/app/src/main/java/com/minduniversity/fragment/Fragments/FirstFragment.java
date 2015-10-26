package com.minduniversity.fragment.Fragments;


import android.content.Context;
import android.os.Bundle;
import android.app.Fragment;
import android.support.design.widget.NavigationView;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.minduniversity.fragment.R;

import org.w3c.dom.Text;

/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment{
    private EditText myText;
    private MyTextChangedListener myTextChangedListener;

    public static FirstFragment newInstance() {
        return new FirstFragment();
    }

    public FirstFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context){
        super.onAttach(context);
        try{
            myTextChangedListener=(MyTextChangedListener)context;
        } catch(Exception ex){
            Log.e(this.getClass().getName(), ex.getMessage());
        }
    }

    public void setMyTextChangedListener(MyTextChangedListener listener) {
        this.myTextChangedListener = listener;
    }
    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_first, container, false);
        myText = (EditText) rootView.findViewById(R.id.my_text);
        myText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {


            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(myTextChangedListener!=null){
                    myTextChangedListener.onMyTextChanged(s.toString());

                }
            }
        });
        return rootView;
    }
}
