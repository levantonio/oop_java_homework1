package seminar1;

public class SnackChocko extends Product {
    private double kkal;
    private String color;
    private int weight;

    public SnackChocko(String name, String brand, double price, double kkal, String color, int weight) {
        super(name, brand, price);
        this.kkal = kkal;
        this.color = color;
        this.weight = weight;
    }

    public double getKkal() {
        return kkal;
    }

    public void setKkal(double kkal) {
        this.kkal = kkal;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String displayInfo() {
        return String.format("brand: %s -name: %s -price: %f -kkal: %f -color: %s -weight: %dg.", brand, name, price, kkal, color,weight);

    }
}
