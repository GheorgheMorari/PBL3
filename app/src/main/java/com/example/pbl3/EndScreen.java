package com.example.pbl3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import java.util.List;

public class EndScreen extends Fragment {
    //TODO FOR PACLIC CERLAT AGAIN
    //TODO IMPLEMENT MULTIPLE SOLUTION DISPLAYING WITH list<Solution> from DisplayInteraction.getSolutions() and SHOW MORE SOLUTIONS BUTTON
    //TODO IMPLEMENT SCROLLING
    //TODO IMPLEMENT "GO BACK" BUTTON

    //TODO FOR LATER
    //TODO IMPLEMENT CHOOSE SOLUTION BUTTON FOR EACH SOLUTION TO GO TO FOURTH SCREEN WHERE THERE IS SHOWN AN IN DEPTH VERSION OF THE SOLUTION
    //MORE TO COME

    private TextView solutinTextview;
    private TextView problemTextview;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.end_screen, container, false);
    }

    public void problemText(){
        problemTextview.setText(DisplayInteraction.guess.mostProbable.name);
    }

    public void solutionText(){
        solutinTextview.setText(DisplayInteraction.getSolutions().get(0).displayedName);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        problemTextview = view.findViewById(R.id.problem_box);
        solutinTextview = view.findViewById(R.id.best_sollution);
        problemText();
        solutionText();

        view.findViewById(R.id.endscreen_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(EndScreen.this)
                        .navigate(R.id.action_ThirtFragment_to_SecondFragment);
            }
        });
    }
}