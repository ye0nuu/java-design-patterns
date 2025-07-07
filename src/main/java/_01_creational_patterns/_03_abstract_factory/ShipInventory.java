package _01_creational_patterns._03_abstract_factory;

import _01_creational_patterns._02_factorymethod.ship.Ship;
import _01_creational_patterns._02_factorymethod.ship.ShipFactory;

public class ShipInventory {

    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteshipFactory(new WhiteshipPartsFactory());
        Ship ship = shipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());
    }
}
