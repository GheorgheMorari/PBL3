package com.example.pbl3;

public class Solution {
    String name;
    String displayedName;
    int[] idArray; //Indicate the ids of the suitable problems
    float[] suitabilityIndices;  //The higher the index the more likely that he user will have this solution shown for that particular problem.

    Solution(String name,int[] idArray, float[] suitabilityIndices, String displayedName){
        //**IMPORTANT INFO**
        //The indices inside the idArray coincide with the indices of the ProblemSet.problems array.
        //The suitabilityIndices or sI array uses local indices, where suitabilityIndices[i] represents the sI of the id idArray[i].


        this.name = name;
        this.displayedName = displayedName;
        this.suitabilityIndices = suitabilityIndices;
        this.idArray = idArray;
    }
}

