package com.example.pbl3;

//The problem is what we are trying to guess.
//Each problem has a set of predefined answers to all the questions that the user might encounter.
//Thus when adding new questions, we always need to add the values to all the constructors of the all the problems.
class Problem{
    String name;
    float[] questionAnswers;
    Problem(float initValue){
        int questions_count = QuestionSet.questionsCount;
        this.questionAnswers = new float[questions_count];
        for(int i = 0; i < questions_count; i++){
            this.questionAnswers[i] = initValue;
        }
    }
    Problem(float[] questionAnswers, String name){
        this.questionAnswers = questionAnswers;
        this.name = name;
    }
}

