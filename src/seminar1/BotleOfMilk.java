package seminar1;

public class BotleOfMilk extends Product {
    private double value;
    private int fatContent;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getFatContent() {
        return fatContent;
    }

    public void setFatContent(int fatContent) {
        this.fatContent = fatContent;
    }

    public BotleOfMilk(String name, String brand, double price, double value, int fatContent) {
        super(name, brand, price);
        this.value = value;
        this.fatContent = fatContent;
    }

    @Override
    public String displayInfo() {
        return String.format("[bottle]%s- %s- %f - %f - %d", brand, name, price, value, fatContent);

    }
}
