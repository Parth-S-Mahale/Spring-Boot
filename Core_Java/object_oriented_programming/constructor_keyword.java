package Core_Java.object_oriented_programming;

class Human {
    private int age;
    private String name;

    public Human() { // default constructor
        age = 12;
        name = "Jay";
    }

    public Human(int age, String name) { // parameterized constructor
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}

public class constructor_keyword { 
    public static void main(String[] args) {
        Human object1 = new Human();
        Human object2 = new Human(24, "Mansi");
        
        System.out.println(object1.getName() + " : " + object1.getAge()); // default constructor output

        System.out.println(object2.getName() + " : " + object2.getAge()); // parameterized constructor output

        object2.setAge(21);
        object2.setName("Parth");
        System.out.println(object2.getName() + " : " + object2.getAge()); // modified parameterized constructor output
    }
}
