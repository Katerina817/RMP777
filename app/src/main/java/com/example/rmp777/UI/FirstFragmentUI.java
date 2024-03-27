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

public class FirstFragmentUI extends Fragment {
    public FirstFragmentUI(){
        super(R.layout.first_fragment);
    }
    public Data DATA=new Data();
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Bundle exampleValue = getArguments();
        if(exampleValue!=null){
            Button buttontest = requireView().findViewById(R.id.datatest1);
            buttontest.setText(getArguments().getString("data"));
        }
        Button btn1=view.findViewById(R.id.FirstToSecond);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Navigation.findNavController(view).navigate(R.id.action_FirstNav_to_SecondNav);
                Bundle bundle = new Bundle();
                bundle.putString("data", DATA.getString12());
                Navigation.findNavController(view).navigate(R.id.action_FirstNav_to_SecondNav, bundle);
            }
        });
        Button btn2=view.findViewById(R.id.FirstToThird);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Navigation.findNavController(view).navigate(R.id.action_FirstNav_to_ThirdNav);
                Bundle bundle = new Bundle();
                bundle.putString("data", DATA.getString13());
                Navigation.findNavController(view).navigate(R.id.action_FirstNav_to_ThirdNav, bundle);
            }
        });
    }
}
