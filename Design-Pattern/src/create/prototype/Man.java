package create.prototype;

/**
 * Created by Administrator on 2017/12/21.
 */

import java.io.*;

/**
 * 原型模式
 * @author water
 * @date 2017-12-21
 */
public class Man implements Cloneable,Serializable {
    private String name;
    private int age;
    private String hobby;

    public Man() {
    }

    public Man(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }
    public  Object deepClone()throws Exception{
        //将对象写到流里
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);
        //从流里读回来
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
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

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
