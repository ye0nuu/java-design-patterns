package _01_creational_patterns._04_builder;

public class DetailPlan {
    private int day;
    private String plans;

    public DetailPlan(int day, String plan) {
        this.day = day;
        this.plans = plan;
    }

    public int getDay()         { return day; }
    public void setDay(int day) { this.day = day; }

    public String getPlans()             { return plans; }
    public void setPlans(String plans)    { this.plans = plans; }

    @Override
    public String toString() {
        return "DetailPlan{" +
                "days=" + day +
                ", plan='" + plans + '\'' +
                '}';
    }
}
