package action.templatemethod;

/**
 * Created by Administrator on 2017/12/22.
 */
public class TemplateAchieve1 extends Template {
    @Override
    protected void method2(){
        System.out.println("修改了模板类中的方法");
    }
    @Override
    void method3() {
        System.out.println("方法3的第一种实现");
    }

    @Override
    void method4() {
        System.out.println("方法3的第一种实现");
    }
}
