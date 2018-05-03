package create.factory.commonfactory;

/**
 * Created by Administrator on 2017/10/15.
 */
public class PersonImpl implements Person {
    @Override
    public void create(String name) {
        System.out.println("创建了CT这个帅哥");
    }
}
