package edu.pradita.dip;

public class TrainingCoach {
    private WeightTrainingPlan plan;

    public TrainingCoach(WeightTrainingPlan plan) {
        this.plan = plan;
    }

    public void assignPlan(String memberName) {
        plan.generate(memberName);
    }
}