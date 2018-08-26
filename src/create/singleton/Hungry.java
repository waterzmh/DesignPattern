package create.singleton;

public class Hungry {
    private String name;
    private int  age;
    private static Hungry hungry=new Hungry();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public static Hungry getHungry(){
        return hungry;
    }
}
