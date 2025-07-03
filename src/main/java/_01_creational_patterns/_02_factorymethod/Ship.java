package _01_creational_patterns._02_factorymethod;

public class Ship {

    private String name;
    private String color;
    private String logo;
    private Wheel wheel;
    private Anchor anchor;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getLogo() {
        return logo;
    }
    public String setLogo(String logo) {
        this.logo = logo;
    }

    @Override
    public String toString() {
        return "ship{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", logo='" + logo + '\'' +
                '}';
    }

    public Wheel getWheel() {
        return wheel;
    }
    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }
    public Anchor getAnchor() {
        return anchor;
    }
    public void setAnchor(Anchor anchol) {
        this.anchor = anchor;
    }
}
