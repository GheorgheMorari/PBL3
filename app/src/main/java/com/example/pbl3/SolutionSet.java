package com.example.pbl3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class SolutionSet {
    static int solutionsCount = 100;
    static ArrayList<Solution> solutions;
    SolutionSet(){
        this.solutions = new ArrayList<Solution>();

        //**IMPORTANT**
        //A solution is always linked to one or more problems, but each solution has a suitability value for each problem that it suits.
        //If you place the id of a problem in the idArray of a solution then you must provide a suitability value for that problem.
        //A very specific solution must have a very high suitability.

        //TODO Add all the questions from here
        this.solutions.add(new Solution("go outdoors", new int[]{0,1,2},new float[]{1,1,1}, "Take a break, go outside just for a bit, it might help." ));
        this.solutions.add(new Solution("go to a doctor", new int[]{0},new float[]{3}, "Depression is very serious condition, go see a psychiatrist, you shouldn't live with that." ));
        this.solutions.add(new Solution("forget about it", new int[]{1,3},new float[]{1,3}, "Don't stress yourself with that, forget about it. Things come and go all the time." ));
        this.solutions.add(new Solution("forget about the bad stuff", new int[]{1,3},new float[]{1,3}, "Life has ups and downs, if you don't focus on the ups you will not see anything but downs in your life." ));
        this.solutions.add(new Solution("you're wrong", new int[]{2,4},new float[]{1,3}, "Sometimes what you think is not true." ));
        this.solutions.add(new Solution("you're right", new int[]{2,4},new float[]{1,3}, "You're right, but that should motivate you to be a better person, not be sad about it." ));




        this.solutionsCount = solutions.size();
    }
    int getId(Solution solution){
        int arrLen = solutions.size();
        for(int i = 0; i < arrLen; i++){
            if(solutions.get(i) == solution){
                return i;
            }
        }
        return -1;
    }

    List<Solution> getBestSolutions(User user, Problem problem){
        int id  = ProblemSet.getId(problem);

        PriorityQueue<SolutionResult> sortedQueue = new PriorityQueue<SolutionResult>(new SolutionComparator());
        for (Solution solution:solutions) {
            sortedQueue.add(new SolutionResult(solution,id));
        }

        List<Solution> ret = new ArrayList<Solution>();
        for (SolutionResult solutionResult : sortedQueue) { //TODO verify if the order is correct
            ret.add(solutionResult);
        }

        return ret;
    }

    class SolutionResult extends Solution{
        int problem_id;
        SolutionResult(Solution solution, int problem_id){
            super(solution.name,solution.idArray,solution.suitabilityIndices,solution.displayedName);
            this.problem_id = problem_id;
        }
    }

    class SolutionComparator implements Comparator<SolutionResult> {  //TODO verify if comparator is working as expected
        public int compare(SolutionResult sr1, SolutionResult sr2){
            float sr1Suitability = -1;
            int sr1Len = sr1.idArray.length;
            for(int i = 0; i < sr1Len;i++){
                if(sr1.idArray[i] == sr1.problem_id){
                    sr1Suitability = sr1.suitabilityIndices[i];
                    break;
                }
            }
            float sr2Suitability = -1;
            int sr2Len = sr2.idArray.length;
            for(int i = 0; i < sr2Len;i++){
                if(sr2.idArray[i] == sr2.problem_id){
                    sr2Suitability = sr2.suitabilityIndices[i];
                    break;
                }
            }

            return (sr1Suitability > sr2Suitability) ? (1) : ((sr1Suitability == sr2Suitability) ? (0) : (-1)); //TODO verify if order is correct
        }
    }

}
