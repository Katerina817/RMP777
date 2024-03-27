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

public class SecondFragmentUI extends Fragment {
    public SecondFragmentUI(){
        super(R.layout.second_fragment);
    }
    public Data DATA=new Data();
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button buttontest = requireView().findViewById(R.id.datatest2);
        buttontest.setText(getArguments().getString("data"));
        Button btn1=view.findViewById(R.id.SecondToFirst);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Navigation.findNavController(view).navigate(R.id.action_SecondNav_to_FirstNav);
                Bundle bundle = new Bundle();
                bundle.putString("data", DATA.getString21());
                Navigation.findNavController(view).navigate(R.id.action_SecondNav_to_FirstNav, bundle);
            }
        });
        Button btn2=view.findViewById(R.id.SecondToThird);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Navigation.findNavController(view).navigate(R.id.action_SecondNav_to_ThirdNav);
                Bundle bundle = new Bundle();
                bundle.putString("data", DATA.getString23());
                Navigation.findNavController(view).navigate(R.id.action_SecondNav_to_ThirdNav, bundle);
            }
        });
    }
}
