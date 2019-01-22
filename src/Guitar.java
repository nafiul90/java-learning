
public class Guitar {

    private String name;
    private double price;
    private int strings;
    private String color;

    public Guitar(){

    }

    public Guitar(String name, double price, int strings, String color) {
        this.name = name;
        this.price = price;
        this.strings = strings;
        this.color = color;
    }
    public Guitar(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStrings() {
        return strings;
    }

    public void setStrings(int strings) {
        this.strings = strings;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "name:'" + name + '\'' +
                ", price:" + price +
                ", strings" + strings +
                ", color:'" + color + '\'' +
                '}';
    }
}
