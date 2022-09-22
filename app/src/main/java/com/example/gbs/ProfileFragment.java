package com.example.gbs;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class ProfileFragment extends Fragment {
    TextView registerBtn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

////        registerBtn = (TextView) registerBtn.findViewById(R.id.registerBtn);
//        registerBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getContext(),RegisterNow.class);
//                startActivity(intent);
//            }
//        });


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false);

    }
}

