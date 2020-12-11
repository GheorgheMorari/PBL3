package com.example.pbl3;


import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.Comparator;
import java.util.PriorityQueue;

import static com.example.pbl3.QuestionSet.questionsCount;
import static java.lang.Float.NaN;

class Guess extends Problem{
    int questionsAnswered = 0;
    float confidence = 0;
    PriorityQueue<Distance> possibleProblems;
    Problem mostProbable;


    Guess(){
        super(Float.NaN);
        possibleProblems = new PriorityQueue<Distance>(new SolutionComparator());
    }
    public void answer(int id, float value){
        questionsAnswered++;
        this.questionAnswers[id] = value;

        possibleProblems.clear();
        for(Problem problem : ProblemSet.problems){
            possibleProblems.add(getDistance(problem));
        }
        if(questionsAnswered == 1){
            mostProbable = possibleProblems.peek().problem;
        } else {
            if(mostProbable == possibleProblems.peek().problem){
                confidence += 1f/5f; //TODO change how the confidence is calculated
                if(confidence > 1) {confidence = 1;};

            } else{
                confidence -= 1f/5f;
                if(confidence < 0) {confidence = 0;};
            }

        }
    }
    int getBestId(User user){
        int questionMin = user.getQuestionMin();
        if(mostProbable == null) return 0;
        for(int i = 0; i < questionsCount; i++){
            if(Float.isNaN(this.questionAnswers[i]) && user.questionViewed[i] == questionMin &&
                ((mostProbable.questionAnswers[i] == DisplayInteraction.stronglyAgree) ||
                (mostProbable.questionAnswers[i] == DisplayInteraction.stronglyDisagree))){
                return i;
            }
        }
        for(int i = 0; i < questionsCount; i++){
            if(Float.isNaN(this.questionAnswers[i]) && user.questionViewed[i] == questionMin){
                return i;
            }
        }
        return 0;
    }
    Distance getDistance(Problem problem){
        float dist = 0;
        for(int i = 0; i < questionsCount; i++){
            if(!Float.isNaN(this.questionAnswers[i])){
                float diff = this.questionAnswers[i] - problem.questionAnswers[i];
                dist += diff * diff;
            }
        }
        return new Distance(problem,dist);
    }
    class Distance {
        public Problem problem;
        public float distance;
        Distance(Problem p, float d){problem = p; distance = d;}
    }

    class SolutionComparator implements Comparator<Distance> {
        public int compare(Distance s1, Distance s2){
            return (s1.distance > s2.distance) ? (1) : ((s1.distance == s2.distance) ? (0) : (-1)); //TODO verify if order is correct
        }
    }
}



