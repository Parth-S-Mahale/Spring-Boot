package Core_Java.object_oriented_programming;


class varMobile {
    String brand;
    int price;
    static String name;

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }

}

public class static_variable {
    public static void main(String[] args) {
        varMobile obj1 = new varMobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.name = "SmartPhone";

        varMobile obj2 = new varMobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;
        varMobile.name = "SmartPhone";

        varMobile.name = "Phone";

        obj1.show();
        obj2.show();

    }
}
