package action.visitor;

/**
 * Created by Administrator on 2017/11/30.
 */
public abstract class Person {
    public abstract void Accept(Action visitor);
}
