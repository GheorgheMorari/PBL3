package com.example.pbl3;

class User {
    //TODO FOR MIHAI
    //TODO IMPLEMENT THE USER METHODS
    //TODO IMPLEMENT FIRST TIME USER CHECK
    //TODO IMPLEMENT WHEN USER SEES A PROBLEM, A QUESTION OR A SOLUTION TO INCREMENT THE NECESSARY ARRAY VALUE, you can do that with 3 new methods
    //TODO CALL THE NEWLY IMPLEMENTED METHODS WHERE A USER SEES/CHOOSES QUESTION/PROBLEM/SOLUTION
    //SOLUTION IS CURRENTLY NOT IMPLEMENTED IN THE FOURTH SCREEN

    int[] questionViewed;
    int[] problemViewed;
    int[] solutionViewed;

    int questionMin = 0;
    int problemMin = 0;
    int solutionMin = 0;

    boolean firstTimeUser = false;

    User(){

        //TODO check if first time opening app
        firstTimeUser = true; //firstTimeUser = checkFirstTime(); something like that

        if(firstTimeUser){
            questionViewed = new int[QuestionSet.questionsCount];
            problemViewed = new int[ProblemSet.problemsCount];
            solutionViewed = new int[SolutionSet.solutionsCount];
        } else{
            //TODO set minimal values to the actual minimal values from the file.
            //readStateFromFile();
        }
    }

    void readStateFromFile(){
        //TODO read
        //  int[] questionViewed;
        //  int[] problemViewed;
        //  int[] solutionViewed;
        //  From file
    }
    void saveStateToFIle(){
        //TODO write
        //  int[] questionViewed;
        //  int[] problemViewed;
        //  int[] solutionViewed;
        //  To file
    }

    void viewQuestion(int id){
        questionViewed[id]++;
        questionMin = min(questionViewed);
    }
    void viewProblem(int id){
        problemViewed[id]++;
        problemMin = min(problemViewed);
    }
    void  viewSolution(int id){
        solutionViewed[id]++;
        solutionMin = min(solutionViewed);
    }

    int getQuestionMin(){
        return this.questionMin;
    }
    int getProblemMin(){
        return this.problemMin;
    }
    int getSolutionMin(){
        return this.solutionMin;
    }

    int min(int[] arr){
        int len = arr.length;
        int ret = arr[0];
        for(int i = 0; i < len;i++){
            if(ret == 0) return ret;
            if(ret > arr[i]){
                ret = arr[i];
            }
        }
        return ret;
    }
}

