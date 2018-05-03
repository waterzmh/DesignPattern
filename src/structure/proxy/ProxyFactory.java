package structure.proxy;

/**
 * Created by Administrator on 2017/10/16.
 */

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 创建动态代理对象
 * 动态代理不需要实现接口,但是需要指定接口类型
 */
public class ProxyFactory{

    //维护一个目标对象
    private Object target;
    public ProxyFactory(Object target){
        this.target=target;
    }

    //给目标对象生成代理对象
    public Object getProxyInstance(){
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
//                new InvocationHandler() {
//                    @Override
//                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                        System.out.println("开始事务2");
//                        //执行目标对象方法
//                        Object returnValue = method.invoke(target, args);
//                        System.out.println("提交事务2");
//                        return returnValue;
//                    }
//                }
                    //lambda表达式？？？？晦涩难懂啊
                    (Object proxy, Method method, Object[] args)->{
                        System.out.println("开始事务2");
                        //执行目标对象方法
                        Object returnValue = method.invoke(target, args);
                        System.out.println("提交事务2");
                        return returnValue;
                    }

        );
    }

}