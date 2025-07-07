package _01_creational_patterns._03_abstract_factory;

import _01_creational_patterns._02_factorymethod.ship.DefaultShipFactory;
import _01_creational_patterns._02_factorymethod.ship.Ship;
import _01_creational_patterns._02_factorymethod.ship.Whiteship;

public class WhiteshipFactory extends DefaultShipFactory {

    private ShipPartsFactory shipPartsFactory;

    public WhiteshipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new Whiteship();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}
