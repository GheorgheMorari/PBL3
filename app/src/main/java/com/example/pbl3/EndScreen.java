package com.example.pbl3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class EndScreen extends Fragment {
    //TODO FOR PACLIC CERLAT AGAIN
    //TODO IMPLEMENT MULTIPLE SOLUTION DISPLAYING WITH list<Solution> from DisplayInteraction.getSolutions() and SHOW MORE SOLUTIONS BUTTON
    //TODO IMPLEMENT SCROLLING
    //TODO IMPLEMENT "GO BACK" BUTTON

    //TODO FOR LATER
    //TODO IMPLEMENT CHOOSE SOLUTION BUTTON FOR EACH SOLUTION TO GO TO FOURTH SCREEN WHERE THERE IS SHOWN AN IN DEPTH VERSION OF THE SOLUTION
    //MORE TO COME

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.choosing_screen, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.btn_option_two).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(EndScreen.this)
                        .navigate(R.id.action_SecondFragment_to_FirstFragment);
            }
        });
    }
}