
public class Car {
    String name;
    int price;
    String band;

    public Car() {
    }

    public Car(String name, int price, String band) {
        this.name = name;
        this.price = price;
        this.band = band;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    @Override
    public String toString() {
        return "[" + name + ", " + price + ", " + band + ']';
    }
    
}
