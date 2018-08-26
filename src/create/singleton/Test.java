package create.singleton;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Administrator on 2017/12/7.
 */
public class Test {
    private Logger logger=Logger.getLogger("singleton");
    @org.junit.Test
    public void create(){
       Man.INSTANCE.getMan();
       Man.INSTANCE.setName("zmh44444");
       logger.log(Level.INFO,Man.INSTANCE.getName());
       logger.log(Level.INFO, String.valueOf(Man.INSTANCE.getAge()));
    }
    @org.junit.Test
    public void  create2(){
        Hungry.getHungry().setName("zmh");
        Hungry.getHungry().setAge(1);
        logger.log(Level.INFO,Hungry.getHungry().getName());
        logger.log(Level.INFO,String.valueOf(Hungry.getHungry().getAge()));
    }
    @org.junit.Test
    public void  create3(){
        Hungry.getHungry().setName("zmh2");
        Hungry.getHungry().setAge(2);
        logger.log(Level.INFO,Hungry.getHungry().getName());
        logger.log(Level.INFO,String.valueOf(Hungry.getHungry().getAge()));
    }
    @org.junit.Test
    public void branch1(){
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println(7);
    }
    @org.junit.Test
    public void masterBranch1(){
        System.out.println("master branch update 1");
    }
}
