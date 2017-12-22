package action.visitor;

/**
 * Created by Administrator on 2017/11/30.
 */
public class Success extends Action {
    @Override
    public void GetManConclusion(Man concreteElementA) {
        System.out.println("男人成功");
    }

    @Override
    public void GetWomanConclusion(Woman concreteElementB) {
        System.out.println("女人成功");
    }
}
