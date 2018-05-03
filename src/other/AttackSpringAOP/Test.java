package other.AttackSpringAOP;



/**
 * Created by Administrator on 2017/12/7.
 */
public class Test {
    @org.junit.Test
    public void simulateAOP(){
        ProxClass proxClass=new ProxClass(new Target1());
        proxClass.operation();

    }
}
