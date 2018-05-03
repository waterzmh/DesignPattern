package create.prototype;

/**
 * Created by Administrator on 2017/12/21.
 */
public class Test {
    @org.junit.Test
    public void protorype_test() throws Exception{
        Man man=new Man("朱敏浩",3,"玩玩玩");
        Man cloneman=null;
        try {
             cloneman= (Man) man.deepClone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(man.equals(cloneman));
        System.out.println(man==cloneman);
        cloneman.setName("water");
        System.out.println(cloneman.getName());
        System.out.println(cloneman.getAge());
        System.out.println(cloneman.getHobby());

        PrototypeManager.setPrototype("man1",man);
        System.out.println(PrototypeManager.getPrototype("man1").getName());
        PrototypeManager.setPrototype("man1",cloneman);
        System.out.println(PrototypeManager.getPrototype("man1").getName());
    }
}
