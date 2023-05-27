package seminar1;

public class SnackChips extends Product{
    private boolean salt;
    private double kkal;
    private int weight;

    public SnackChips(String name, String brand, double price, boolean salt, double kkal, int weight) {
        super(name, brand, price);
        this.salt = salt;
        this.kkal = kkal;
        this.weight = weight;
    }

    public boolean isSalt() {
        return salt;
    }

    public void setSalt(boolean salt) {
        this.salt = salt;
    }

    public double getKkal() {
        return kkal;
    }

    public void setKkal(double kkal) {
        this.kkal = kkal;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String displayInfo() {
        return String.format("brand: %s -name: %s -price: %f -salt: %b -kal: %f weight: %d", brand, name, price, salt, kkal, weight);

    }
}
