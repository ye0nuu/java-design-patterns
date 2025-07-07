package _01_creational_patterns._02_factorymethod.ship;

public abstract class DefaultShipFactory implements ShipFactory {
    @Override
    public void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + "다 만들었습니다.");
    }
}
