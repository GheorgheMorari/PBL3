package com.example.pbl3;

import java.util.ArrayList;

class QuestionSet {
    static int questionsCount = 100;
    static ArrayList<Question> questions;

    QuestionSet(){
        this.questions = new ArrayList<Question>();


        //TODO Add all the questions from here

        //TODO for ANTONINA AND IULIA
        //TODO PUT ALL PROBLEMS AND QUESTIONS INSIDE AN EXCELL SHEET WHERE YOU CAN KEEP TRACK OF WHAT ANSWER EACH PROBLEM HAS.
        //TODO CHANGE ALL THE PROVIDED TEST QUESTIONS PROBLEMS AND SOLUTIONS WITH PROPER QUESTIONS AND SOLUTIONS FROM YOUR EXCELL FILE.
        

        this.questions.add(new Question( "depression","Do you suffer from depression?"));
        this.questions.add(new Question( "sadness","Do you suffer from sadness?"));
        this.questions.add(new Question( "monetary","Have you lost anything of monetary value?"));
        this.questions.add(new Question( "love","Is your problem related to love?"));
        this.questions.add(new Question( "guilt","Do you experience guilt?"));



        this.questionsCount = questions.size();
    }
    static int getId(Question question){
        int arrLen = questions.size();
        for(int i = 0; i < arrLen; i++){
            if(questions.get(i) == question){
                return i;
            }
        }

        return -1;
    }
}
