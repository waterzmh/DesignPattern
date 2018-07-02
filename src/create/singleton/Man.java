package create.singleton;

/**
 * Created by Administrator on 2017/12/7.
 */

/**
 * 枚举常量后面的参数要与构造方法对齐
 */
public enum  Man {
    INSTANCE("name:zmh",666);
    private String name;
    private int age;
     Man(String name,int age){
       this.name=name;
       this.age=age;
    }
    public void getMan(){
        System.out.println(getName());

    }

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
}
