package structure.composite.safe;

/**
 * Created by Administrator on 2017/12/21.
 */
public class Leaf extends AbstractNode {
//    @Override
//    public void add(AbstractNode node) {
//        System.out.println("叶子节点不支持");
//    }
//
//    @Override
//    public void remove(AbstractNode node) {
//        System.out.println("叶子节点不支持");
//    }
//
//    @Override
//    public void getAllNode() {
//        System.out.println("得到了一个叶子节点");
//    }

    @Override
    public void say() {
        System.out.println("叶子说了。。");
    }
}
