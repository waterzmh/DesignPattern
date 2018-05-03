package action.visitor;

/**
 * Created by Administrator on 2017/11/30.
 */
public class Woman  extends Person {
    @Override
    public void Accept(Action visitor) {
        visitor.GetWomanConclusion(this);
    }
}