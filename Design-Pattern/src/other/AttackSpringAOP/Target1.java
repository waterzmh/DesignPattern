package other.AttackSpringAOP;

/**
 * Created by Administrator on 2017/12/7.
 */
public class Target1 implements sayhelloANDbye {

    @Override
    public void operation() {
        System.out.println("target1 say:");
    }
}
