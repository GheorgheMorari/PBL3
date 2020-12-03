package com.example.pbl3;

import java.util.List;


class DisplayInteraction {
    static float stronglyDisagree = -2.0f;
    static float disagree = -1f;
    static float neutral = 0f;
    static float agree = 1f;
    static float stronglyAgree = 2f;

    static QuestionSet questionSet;
    static ProblemSet problemSet;
    static SolutionSet solutionSet;
    static User user;
    static Guess guess;

    DisplayInteraction(QuestionSet questionSet, ProblemSet problemSet, SolutionSet solutionSet, User user, Guess guess){
        this.questionSet = questionSet;
        this.problemSet = problemSet;
        this.solutionSet = solutionSet;
        this.user = user;
        this.guess = guess;
    }

    static Question getNextQuestion(){
        int bestId = guess.getBestId();
        return questionSet.questions.get(bestId);
    }
    static void selectOption(Question question, float value ){
        guess.answer(questionSet.getId(question),value);
    }

    static List<Solution> getSolutions(){
        Problem problem = guess.possibleProblems.peek().problem;
        return solutionSet.getBestSolutions(user,problem);
    }
}