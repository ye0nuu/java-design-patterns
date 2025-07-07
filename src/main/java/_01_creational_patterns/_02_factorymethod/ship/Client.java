package _01_creational_patterns._02_factorymethod.ship;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();
        client.print(new WhiteshipFactory(), "whiteship", "yeonu@mail.com");
        client.print(new BlackshipFactory(), "blackship", "yeonu@mail.com");
    }

    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }
}
