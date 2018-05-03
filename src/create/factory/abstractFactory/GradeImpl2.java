package create.factory.abstractFactory;

/**
 * Created by Administrator on 2017/10/15.
 */
public class GradeImpl2 implements Grade {
    @Override
    public Boy getBoy() {
        return new BoyImpl2();
    }

    @Override
    public Girl getGirl() {
        return new GirlImpl2();
    }
}
