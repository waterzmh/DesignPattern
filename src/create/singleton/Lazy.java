package create.singleton;

public class Lazy {
    private String name;
    private int  age;
    private static Hungry hungry=null;

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
        return hungry==null?new Hungry():hungry;
    }
}
