package Advance_Java.enums.enums_class;

public class concept {
    public static void main(String[] args) {
        // Laptop lap = Laptop.Macbook;
        // System.out.println(lap + " : " + lap.getPrice());

        /* get names and prices of all the laptops */
        for (Laptop lap : Laptop.values()) {
            System.out.println(lap + " : " + lap.getPrice());
        }

    }
}

enum Laptop {
    Macbook(2000), XPS(2200), Surface, ThinkPad(1800); // objects of the class 'Status'

    private int price;

    private Laptop() {
        price = 500;
        System.out.println("in Laptop " + this.name());
    }

    private Laptop(int price) {
        this.price = price;
        System.out.println("in Laptop " + this.name());
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

}
