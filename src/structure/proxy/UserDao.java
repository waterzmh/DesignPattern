package structure.proxy;

/**
 * Created by Administrator on 2017/10/16.
 */
/**
 * 接口实现
 * 目标对象
 */
public class UserDao implements IUserDao {
    @Override
    public void save() {
        System.out.println("----已经保存数据!----");
    }
}
