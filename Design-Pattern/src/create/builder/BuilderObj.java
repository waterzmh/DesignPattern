package create.builder;

/**
 * Created by Administrator on 2017/12/4.
 */
public class BuilderObj {
    private String name;
    private int age;
    private int lovenum;
    private String lovebook;
    private String sex;
    public static class Builder{
        /**
         * 设置每次创建必须的参数
         */
        private final String name;
        private final int age;
        /**
         * 给一个初始值，在对象未对下列参数赋值的时候有一个默认的值。
         */
        private int lovenum=0;
        private String lovebook="";
        private String sex="";
        public Builder(String name,int age){
            this.name=name;
            this.age=age;
        }
        public Builder setLovenum(int lovenum){
            this.lovenum=lovenum;
            return  this;
        }
        public Builder setLovebook(String lovebook){
            this.lovebook=lovebook;
            return this;
        }
        public Builder setSex(String sex){
            this.sex=sex;
            return this;
        }
        public BuilderObj build(){
            return new BuilderObj(this);
        }
    }
    private BuilderObj(Builder builder){
        name=builder.name;
        age=builder.age;
        lovenum=builder.lovenum;
        lovebook=builder.lovebook;
        sex=builder.sex;
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

    public int getLovenum() {
        return lovenum;
    }

    public void setLovenum(int lovenum) {
        this.lovenum = lovenum;
    }

    public String getLovebook() {
        return lovebook;
    }

    public void setLovebook(String lovebook) {
        this.lovebook = lovebook;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
