package action.mediator;

/**
 * Created by Administrator on 2017/12/22.
 */
/**
 * 财务部
 */
public class Finacial implements Department{
    private Mediator m;//持有中介者对象引用
    public Finacial(Mediator m){
        this.m=m;
        m.register("finacial", this);
    }

    @Override
    public void ownWork() {
        System.out.println("财务部：负责财务工作！");
    }

    @Override
    public void outWork() {
        System.out.println("财务部：请求市场部配合！");
        m.command("market");
    }
}
