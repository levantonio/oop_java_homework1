package seminar1;

import java.util.List;

public class VendingMachine {
    private List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public BottleOfWater getBottleOfWater(double volume) {
        for (Product product : products) {
            if (product instanceof BottleOfWater) {
                if (((BottleOfWater) product).getValue() == volume) {
                    return ((BottleOfWater) product);
                }
            }
        }
        return null;
    }

    public SnackChocko getSnackChocko(int weight) {
        for (Product product : products) {
            if (product instanceof SnackChocko) {
                if (((SnackChocko) product).getWeight() == weight) {
                    return ((SnackChocko) product);
                }
            }
        }
        return null;
    }
}
