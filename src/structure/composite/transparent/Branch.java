package structure.composite.transparent;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/12/21.
 */
public class Branch extends AbstractNode{
    private List<AbstractNode> nodes=new ArrayList<>();
    @Override
    public void add(AbstractNode node) {
        nodes.add(node);
    }

    @Override
    public void remove(AbstractNode node) {
        if(nodes.contains(node)) {
            nodes.remove(node);
        }
    }

    @Override
    public void getAllNode() {
        System.out.println("得到一个树枝节点");
        if(nodes!=null&&nodes.size()>0){
            for(AbstractNode node:nodes){
                node.getAllNode();
            }
        }
    }

    @Override
    public void say() {
        System.out.println("树枝说了。。");
    }
}
