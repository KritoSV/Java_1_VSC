package Java_OOP.Sem_2.DZ2;

public class Main {
    public static void main(String[] args) {

        Market market = new Market();
        Human human1 = new Human("Дима");
        Human human2 = new Human("Света");

        market.acceptToMarket(human2);
        market.acceptToMarket(human1);
        market.update();

    }
}