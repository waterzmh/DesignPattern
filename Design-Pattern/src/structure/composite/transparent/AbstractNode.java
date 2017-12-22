package structure.composite.transparent;

/**
 * Created by Administrator on 2017/12/21.
 */
public abstract class AbstractNode {
    public abstract void add(AbstractNode node);
    public abstract void remove(AbstractNode node);
    public abstract void getAllNode();
    public abstract void say();
}
