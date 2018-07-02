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
        Badmash.getBadmash().setName("zmh");
        Badmash.getBadmash().setAge(1);
        logger.log(Level.INFO,Badmash.getBadmash().getName());
        logger.log(Level.INFO,String.valueOf(Badmash.getBadmash().getAge()));
    }
    @org.junit.Test
    public void  create3(){
        Badmash.getBadmash().setName("zmh2");
        Badmash.getBadmash().setAge(2);
        logger.log(Level.INFO,Badmash.getBadmash().getName());
        logger.log(Level.INFO,String.valueOf(Badmash.getBadmash().getAge()));
    }
}
