package seminar1;

public class Product {

    protected String name;
    protected String brand;
    protected double price;

    double getPrice(){
        return price;
    }

    public void setPrice(double inputPrice){
        checkPrice(inputPrice);
    }

    public Product() {
//        name = "noName";
//        brand = "product";
//        price = 100;
        this("product", 100);
    }
    public Product(String inputName,  double inputPrice) {
        this( inputName,"noName", inputPrice);
//        name = inputName;
//        brand = "noName";
//        price = inputPrice;
    }
    public Product(String name, String brand, double price) {
        checkPrice(price);
        if (name.length()<=5){
            this.name = "product";
        }
        else{
            this.name = name;
        }

        this.brand = brand;

    }

    private void checkPrice(double inputPrice){
        if (inputPrice <= 10) {
            price = 100;
        }
        else{
            price = inputPrice;
        }
    }

    public String displayInfo(){
        return String.format("%s- %s- %f", brand, name, price);
    }

}
