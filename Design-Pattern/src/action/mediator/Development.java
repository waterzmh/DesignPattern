package action.mediator;

/**
 * Created by Administrator on 2017/12/22.
 */
/**
 * 研发部
 */
public class Development implements Department{
    private Mediator m;//持有中介者对象引用
    public Development(Mediator m){
        this.m=m;
        m.register("development", this);
    }

    @Override
    public void ownWork() {
        System.out.println("研发部：负责研发工作！");
    }

    @Override
    public void outWork() {
        System.out.println("研发部：请求财务部配合！");
        m.command("finacial");
    }
}
