package action.iterator.extrinsic;

/**
 * Created by Administrator on 2017/12/22.
 */
public class Test {
    @org.junit.Test
    public void extrinsictest(){
        Object[] objArray = {"One","Two","Three","Four","Five","Six"};
        //创建聚合对象
        Aggregate agg = new ConcreteAggregate(objArray);
        //循环输出聚合对象中的值
        Iterator it = agg.createIterator();
        while(!it.isDone()){
            System.out.println(it.currentItem());
            it.next();
        }
    }

}
