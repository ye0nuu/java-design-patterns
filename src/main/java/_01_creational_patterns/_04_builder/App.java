package _01_creational_patterns._04_builder;

public class App {
    public static void main(String[] args) {

        TourDirector director = new TourDirector(new DefaultTourBuilder());
        TourPlan tourPlan = director.cancunTrip();
        TourPlan tourPlan1 = director.longBeachTrip();

        System.out.println(tourPlan.toString());
        System.out.println(tourPlan1.toString());
    }
}
