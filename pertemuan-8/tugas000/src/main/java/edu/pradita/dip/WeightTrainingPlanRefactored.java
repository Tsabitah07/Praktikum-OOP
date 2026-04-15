package edu.pradita.dip;

public class WeightTrainingPlanRefactored implements TrainingPlanRefactored {
    @Override
    public void generate(String memberName) {
        System.out.println("[DIP] Weight training plan for " + memberName);
    }
}