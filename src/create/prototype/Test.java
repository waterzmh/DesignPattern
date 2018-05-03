package create.prototype;

import java.io.ByteArrayOutputStream;

/**
 * Created by Administrator on 2017/12/21.
 */
public class Test {
    @org.junit.Test
    public void protorype_test(){
        Man man=new Man("朱敏浩",3,"玩玩玩");
        Man cloneman=null;
        try {
             cloneman= (Man) man.deepClone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(man.equals(cloneman));
        System.out.println(man==cloneman);
        System.out.println(cloneman.getName());
        System.out.println(cloneman.getAge());
        System.out.println(cloneman.getHobby());
    }
}
