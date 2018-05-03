package other.AttackSpringAOP;

/**
 * Created by Administrator on 2017/12/7.
 */
public class ProxClass implements sayhelloANDbye{
    private sayhelloANDbye sayhelloandbye;

    public ProxClass(sayhelloANDbye sayhelloandbye) {
        this.sayhelloandbye = sayhelloandbye;
    }

    @Override
    public void operation() {
        hello();
        sayhelloandbye.operation();
        bye();
    }
}
