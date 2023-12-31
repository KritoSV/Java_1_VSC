package Java_OOP.Sem_2.DZ2;

public interface ActorBehavior {
    void setMakeOrder(boolean status);
    void setTakeOrder(boolean status);
    boolean isMakeOrder(); // сделап заказ
    boolean isTakeOrder(); // получил заказ
}