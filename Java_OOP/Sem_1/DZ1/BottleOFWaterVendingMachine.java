package Java_OOP.Sem_1.DZ1;

import java.util.List;

public class BottleOFWaterVendingMachine implements VendingMachine {
    private final List<BottleOFWater> products;

    public BottleOFWaterVendingMachine(List<BottleOFWater> products) {
        this.products = products;
    }

    public Product getProduct(String name){
        for(BottleOFWater product: products){
            if(product.getName().equalsIgnoreCase(name)){
                return product;
            }
        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }

    public BottleOFWater getProduct(String name, int volume){
        for(BottleOFWater product: products){
            if(product != null){
                if(product.getName().equalsIgnoreCase(name) && ((BottleOFWater) product).getVolume() == volume){
                    return (BottleOFWater) product;
                }
            }

        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }
}
