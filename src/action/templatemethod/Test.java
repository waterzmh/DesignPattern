package action.templatemethod;

/**
 * Created by Administrator on 2017/12/22.
 */
public class Test {
    @org.junit.Test
    public void templatetest(){
        Template template1=new TemplateAchieve1();
        Template template2=new TemplateAchieve2();
        template1.method1();
        template1.method2();
        template1.method3();
        template1.method4();

        template2.method1();
        template2.method2();
        template2.method3();
        template2.method4();

    }
}
