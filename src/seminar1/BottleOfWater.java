package seminar1;

public class BottleOfWater extends Product{

    private double value;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

//    public BottleOfWater(String name, double price){
//        super(name, price);
//    }

    public BottleOfWater(String name, String brand, double price, double value) {
        super(name, brand, price);
        this.value = value;
    }

    @Override
    public String displayInfo() {
        return String.format("[bottle]%s- %s- %f - %f", brand, name, price,value);

    }
}
