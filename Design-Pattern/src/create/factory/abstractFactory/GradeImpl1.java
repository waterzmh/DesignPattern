package create.factory.abstractFactory;

/**
 * Created by Administrator on 2017/10/15.
 */
public class GradeImpl1 implements Grade {
    @Override
    public Boy getBoy() {
        return new BoyImpl1();
    }

    @Override
    public Girl getGirl() {
        return new GirlImpl1();
    }
}
