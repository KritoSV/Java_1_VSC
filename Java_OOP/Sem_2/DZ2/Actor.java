package Java_OOP.Sem_2.DZ2;

public abstract class Actor implements ActorBehavior {
    protected String name;
    protected boolean isMakeOrder; // сделап заказ
    protected boolean isTakeOrder; // получил заказ
    abstract String getName();
    public Actor(String name) {
        this.name = name;
    }
}