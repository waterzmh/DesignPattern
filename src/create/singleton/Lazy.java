package create.singleton;

public class Lazy {
    private String name;
    private int  age;
    private static Badmash badmash=null;

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
        return badmash==null?new Badmash():badmash;
    }
}
