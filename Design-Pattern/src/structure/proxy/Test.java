package structure.proxy;

/**
 * Created by Administrator on 2017/10/16.
 */
public class Test {
        @org.junit.Test
        public void proxytest() {
        // 目标对象
        IUserDao target = new UserDao();

        System.out.println(target.getClass());

        // 给目标对象，创建代理对象
        IUserDao proxy = (IUserDao) new ProxyFactory(target).getProxyInstance();

        System.out.println(proxy.getClass());

        // 执行方法   【代理对象】
        proxy.save();
    }
}
