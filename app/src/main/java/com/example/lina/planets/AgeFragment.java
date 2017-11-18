package com.example.lina.planets;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;



public class AgeFragment extends Fragment {


    public AgeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_age, container, false);
        Button mercury = (Button) view.findViewById(R.id.mercury);
        Button setmercury = (Button) view.findViewById(R.id.setmercury);
        Bundle bundle = this.getArguments();
        String Age = bundle.getString("Age");
        setmercury.setText(Age);
        return view;

    }

}
