package com.example.pbl3;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.pbl3.DisplayInteraction.guess;
import static com.example.pbl3.DisplayInteraction.getNextQuestion;



public class ChoosingScreen extends Fragment {

    //TODO FOR CERLAT PACLIC
    //Todo Display next question using DisplayInteraction.getNextQuestion();
    //TODO Answer the question using DisplayInteraction.selectOption(question,button value);
    //TODO pass the value parameter to the selectOption() as DisplayInteraction.agree
    //TODO IMPLEMENT SWITCHING TO ENDSCREEN WHEN guess.confidence >= 0.80f;
    Question nextQuestion;

    private TextView mTextView;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState

    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.choosing_screen, container, false);
    }

    public void ShowText(){
        mTextView.setText(  nextQuestion.visibleString);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {

        mTextView = view.findViewById(R.id.choosing_screen_question);

        nextQuestion = DisplayInteraction.getNextQuestion();
        ShowText();
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.btn_strongly_agree
        ).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               DisplayInteraction.selectOption(nextQuestion,DisplayInteraction.stronglyAgree);

                ShowText();

               nextQuestion = DisplayInteraction.getNextQuestion();

                if (guess.confidence >= 0.80f)
                    NavHostFragment.findNavController(ChoosingScreen.this).navigate(R.id.action_SecondFragment_to_ThirdFragment);


            }
        });


        view.findViewById(R.id.btn_agree
        ).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                DisplayInteraction.selectOption(nextQuestion,DisplayInteraction.agree);

                ShowText();

                nextQuestion = DisplayInteraction.getNextQuestion();

                if (guess.confidence >= 0.80f)
                    NavHostFragment.findNavController(ChoosingScreen.this).navigate(R.id.action_SecondFragment_to_ThirdFragment);


            }
        });


        view.findViewById(R.id.btn_neutral
        ).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                DisplayInteraction.selectOption(nextQuestion,DisplayInteraction.neutral);

                ShowText();

                nextQuestion = DisplayInteraction.getNextQuestion();

                if (guess.confidence >= 0.80f)
                    NavHostFragment.findNavController(ChoosingScreen.this).navigate(R.id.action_SecondFragment_to_ThirdFragment);


            }
        });


        view.findViewById(R.id.btn_disagree
        ).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                DisplayInteraction.selectOption(nextQuestion,DisplayInteraction.disagree);

                ShowText();

                nextQuestion = DisplayInteraction.getNextQuestion();

                if (guess.confidence >= 0.80f)
                    NavHostFragment.findNavController(ChoosingScreen.this).navigate(R.id.action_SecondFragment_to_ThirdFragment);


            }
        });


        view.findViewById(R.id.btn_storngly_disagree
        ).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                DisplayInteraction.selectOption(nextQuestion,DisplayInteraction.stronglyDisagree);

                ShowText();

                nextQuestion = DisplayInteraction.getNextQuestion();

                if (guess.confidence >= 0.80f)
                    NavHostFragment.findNavController(ChoosingScreen.this).navigate(R.id.action_SecondFragment_to_ThirdFragment);


            }
        });
    }

}