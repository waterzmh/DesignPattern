package structure.composite.safe;

/**
 * Created by Administrator on 2017/12/21.
 */
public class Test {
    @org.junit.Test
    public void safetest(){
        Branch branch1=new Branch();
        Branch branch2=new Branch();
        Branch branch3=new Branch();
        AbstractNode leaf1=new Leaf();
        AbstractNode leaf2=new Leaf();
        AbstractNode leaf3=new Leaf();
        AbstractNode leaf4=new Leaf();
        AbstractNode leaf5=new Leaf();

        branch1.add(branch2);
        branch1.add(branch3);
        branch1.add(leaf1);
        branch1.add(leaf2);
        branch2.add(leaf3);
        branch2.add(leaf4);
        branch3.add(leaf5);

        branch1.getAllNode();
        branch1.say();

    }
}
