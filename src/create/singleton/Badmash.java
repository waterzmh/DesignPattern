package create.singleton;

public class Badmash {
    private String name;
    private int  age;
    private static  Badmash badmash=new Badmash();

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
    public static Badmash getBadmash(){
        return badmash;
    }
}
