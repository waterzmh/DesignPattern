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
    private int num;
     Man(String name,int num){
       this.name=name;
       this.num=num;
    }
    public void getMan(){
        System.out.println(getName());
        System.out.println(getNum());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
