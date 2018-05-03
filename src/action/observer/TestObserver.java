package action.observer;

import org.junit.Test;

/**
 * Created by Administrator on 2017/10/16.
 */
public class TestObserver {
    @Test
    public void observer() {

        Teacher teacher=new Teacher();
        Student zhangSan=new Student("张三", teacher);
        Student LiSi=new Student("李四", teacher);
        Student WangWu=new Student("王五", teacher);

        teacher.setHomework("第二页第六题");
        teacher.setHomework("第三页第七题");
        teacher.setHomework("第五页第八题");
    }
}