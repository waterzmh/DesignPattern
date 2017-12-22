package action.mediator;

/**
 * Created by Administrator on 2017/12/22.
 */
public interface Mediator {
    void register(String name,Department d);//记录所有同事类
    void command(String name);//发出命令
}
