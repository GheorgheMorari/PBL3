package com.example.pbl3;


//The question is what helps us guess what problem the user is having.
//The user answers the questions based on his problem.
//We compare the answers the user gave us with the predefined problem answer.
//The closest problem is then selected to be user problem.

//Example we have two problems with the answers {0,2,-2,1} {-2, 1, 1 ,0}
//And the user answers these four problems with {0,1,-2,1}
//In this example we can quite confidently say that the user is most likely experiencing problem 0.
class Question {
    String name;
    String visibleString;
    Question(String name, String visibleString){this.name = name; this.visibleString = visibleString;}
}
