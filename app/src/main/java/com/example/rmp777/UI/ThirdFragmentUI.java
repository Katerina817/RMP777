package com.example.rmp777.UI;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.rmp777.Data.Data;
import com.example.rmp777.R;

public class ThirdFragmentUI extends Fragment {
    public ThirdFragmentUI(){
        super(R.layout.third_fragment);
    }
    public Data DATA=new Data();
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button buttontest = requireView().findViewById(R.id.datatest3);
        buttontest.setText(getArguments().getString("data"));

        Button btn1=view.findViewById(R.id.ThirdToFirst);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Navigation.findNavController(view).navigate(R.id.action_ThirdNav_to_FirstNav);
                Bundle bundle = new Bundle();
                bundle.putString("data", DATA.getString31());
                Navigation.findNavController(view).navigate(R.id.action_ThirdNav_to_FirstNav, bundle);
            }
        });
        Button btn2=view.findViewById(R.id.ThirdToSecond);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Navigation.findNavController(view).navigate(R.id.action_ThirdNav_to_SecondNav);
                Bundle bundle = new Bundle();
                bundle.putString("data", DATA.getString32());
                Navigation.findNavController(view).navigate(R.id.action_ThirdNav_to_SecondNav, bundle);
            }
        });
    }
}

