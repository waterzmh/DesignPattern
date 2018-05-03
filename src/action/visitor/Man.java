package action.visitor;

/**
 * Created by Administrator on 2017/11/30.
 */
public class Man extends Person {
    @Override
    public void Accept(Action visitor) {
        visitor.GetManConclusion(this);
    }
}
