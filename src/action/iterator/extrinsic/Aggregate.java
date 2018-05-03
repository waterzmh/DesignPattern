package action.iterator.extrinsic;

/**
 * Created by Administrator on 2017/12/22.
 */
public abstract class Aggregate {
    /**
     * 工厂方法，创建相应迭代子对象的接口
     */
    public abstract Iterator createIterator();
}
