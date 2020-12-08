package com.example.pbl3;

import java.util.ArrayList;


class ProblemSet{
    static ArrayList<Problem> problems;
    static int problemsCount = 50;

    ProblemSet(){
        this.problems = new ArrayList<Problem>();

        //The answers for all the problems are done with 5 buttons "strongly disagree" "disagree" "neutral" "agree" "strongly agree"
        //These 5 buttons each correspond to the numeric values of -2f, -1f, 0f, 1f, 2f

        //Todo write all problems here.
        this.problems.add(new Problem( new float[]{2f, 1f, 0f, 0f, 1f}, "Common depression problem"));
        this.problems.add(new Problem( new float[]{2f, 1f, 0f, 2f, 1f}, "Common depression love problem"));
        this.problems.add(new Problem( new float[]{1f, 2f, 0f, 0f, 0f}, "Common sadness problem"));
        this.problems.add(new Problem( new float[]{0f, 1f, 2f, 0f, 0f}, "Monetary loss problem"));
        this.problems.add(new Problem( new float[]{0f, 1f, 1f, 0f, 1f}, "Impostor syndrome problem"));






        this.problemsCount = problems.size();
    }

    static int getId(Problem problem){
        return problems.indexOf(problem);
    }
    static Problem getProblem(int id){
        return problems.get(id);
    }
}