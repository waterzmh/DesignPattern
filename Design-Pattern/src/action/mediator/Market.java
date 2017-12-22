package action.mediator;

/**
 * Created by Administrator on 2017/12/22.
 */
/**
 * 市场部
 */
public class Market implements Department{
    private Mediator m;//持有中介者对象引用
    public Market(Mediator m){
        this.m=m;
        m.register("market", this);
    }

    @Override
    public void ownWork() {
        System.out.println("市场部：负责项目承接工作！");
    }

    @Override
    public void outWork() {
        System.out.println("市场部：请求研发部门配合！");
        m.command("development");
    }
}
