package other.AttackSpringAOP;

/**
 * Created by Administrator on 2017/12/7.
 */
public class Target2 implements sayhelloANDbye {
    @Override
    public void operation() {
        System.out.println("target2 say:");
    }
}
