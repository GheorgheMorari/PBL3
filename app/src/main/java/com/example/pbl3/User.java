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

    boolean firstTimeUser = false;

    User(){

        //TODO check if first time opening app
        firstTimeUser = false; //firstTimeUser = checkFirstTime(); something like that

        if(firstTimeUser){
            questionViewed = new int[QuestionSet.questionsCount];
            problemViewed = new int[ProblemSet.problemsCount];
            solutionViewed = new int[SolutionSet.solutionsCount];
            //TODO CHECK IF THEH ARRAY ARE BEING INITIALIZED WITH 0, THEY SHOULD NOT BE RANDOM VALUES
        } else{
        readStateFromFile();
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

}


//Http server java and http client
//Sriu portul si ip-ul la server.
//rest api library java