package Core_Java.object_oriented_programming.object_class;

class Laptop {
    String model;
    int price;

    public String toString() {
        return model + " : " + price;
    }

    public boolean equals(Laptop that) {
        return this.model.equals(that.model) && this.price == that.price;
    }
}

public class object_class {
    static void main() {
        Laptop obj1 = new Laptop();
        obj1.model = "Lenovo Yoga";
        obj1.price = 1000;

        Laptop obj2 = new Laptop();
        obj2.model = "Lenovo Yoga";
        obj2.price = 1000;

         /* Every time you try to print the object it
         calls .toString() method --> object.toString() */

        boolean result = obj1.equals(obj2);

        // System.out.println(obj1.toString());
        // System.out.println(result);

        System.out.println(obj1.equals(obj2));
    }
}

