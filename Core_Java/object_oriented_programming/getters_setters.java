package Core_Java.object_oriented_programming;

class Human {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /* 
    public void setAge(int age, Human obj) {
        Human obj1 = obj;
        obj1.age = age;
    }
    */

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

}

public class getters_setters {
    public static void main(String[] args) {
        Human obj = new Human();
        // obj.setAge(21, obj);

        obj.setAge(21);
        obj.setName("Parth");

        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
