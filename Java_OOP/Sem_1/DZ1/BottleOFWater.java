package Java_OOP.Sem_1.DZ1;

public class BottleOFWater extends Product {
    private int volume;


    public BottleOFWater(String name, double cost, int volume) {
        super(name, cost);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "BottleOfWater{" +
                "name='" + super.getName() + '\'' +
                "volume='" + this.volume + '\'' +
                ", cost=" + super.getCost() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BottleOFWater)) {
            return false;
        }

        BottleOFWater that = (BottleOFWater) o;

        return super.getName().equalsIgnoreCase(that.getName())
                && super.getCost() == that.getCost()
                && getVolume() == that.getVolume();
    }
}