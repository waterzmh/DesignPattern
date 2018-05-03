package other.Extend;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Administrator on 2017/9/4.
 */
public class sanliebiao {
    public static void main(String[] args){
        String s="aaa";
        String b=new String("aaa");
        StringBuilder ss=new StringBuilder("aaa");
        StringBuilder bb=new StringBuilder("aaa");
        System.out.println("s的散列码："+s.hashCode()+"   b的散列码："+b.hashCode());
        System.out.println("ss的散列码："+ss.hashCode()+"   bb的散列码："+bb.hashCode());
        System.out.println(s==b);
        Logger.getGlobal().log(Level.INFO,"hh");
        Logger.getLogger("yamiedie").log(Level.WARNING,"ssshh");
        Logger.getLogger("pppp").log(Level.WARNING,"mmmm");
    }
}
