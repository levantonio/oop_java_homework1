package seminar1;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Product product1;
        product1 = new Product("botle of water", "OOO godest woter", 5);
//        product1.brand = "";
//        product1.name = ;
//        product1.price = 5454.54;
        System.out.println(product1.displayInfo());
        Product botl = new BottleOfWater("water1", "lollipop", 52, 5);
        Product bot1 = new BottleOfWater("water2", "lollipop", 52, 1);
        Product botl2 = new BottleOfWater("water3", "lollipop", 52, 1.5);
        Product botlMilk = new BotleOfMilk("milk1", "lopop", 22, 2, 5);
        Product botlMilk1 = new BotleOfMilk("milk2", "lopop", 22, 2, 5);
        System.out.println(botl.displayInfo());
        System.out.println(botlMilk.displayInfo());

        List<Product> products = new ArrayList<>();
        products.add(botl);
        products.add(bot1);
        products.add(botl2);
        products.add(botlMilk);
        products.add(botlMilk1);


        VendingMachine vendingMachine = new VendingMachine(products);
        BottleOfWater bottleOfWaterREsult = vendingMachine.getBottleOfWater(3);
        if (bottleOfWaterREsult != null) {
            System.out.println("we bought this product");
            System.out.println(bottleOfWaterREsult.displayInfo());
        } else {
            System.out.println("there is no bottle of water");

        }
        Product chocko = new SnackChocko("bounty", "vim-bill-dan", 15, 1200, "white", 100);
        Product chocko1 = new SnackChocko("twix", "vim-bill-dan", 15, 1120, "black", 80);
        Product chocko2 = new SnackChocko("mars", "vim-bill-dan", 15, 12000, "green", 120);
        System.out.println(chocko.displayInfo());
        Product chips = new SnackChips("lays", "sun", 20, true, 852, 50);
        System.out.println(chips.displayInfo());

        products.add(chocko);
        products.add(chocko1);
        products.add(chocko2);

        VendingMachine vendingMachineFind = new VendingMachine(products);
        SnackChocko chockolateResult = vendingMachine.getSnackChocko(120);
        if (chockolateResult != null) {
            System.out.println("we bought this product: " + chockolateResult.displayInfo());
        } else {
            System.out.println("there is no chockolate with this weight");


        }
    }
}