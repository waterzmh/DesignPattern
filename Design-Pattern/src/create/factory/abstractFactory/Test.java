package create.factory.abstractFactory;

/**
 * Created by Administrator on 2017/10/15.
 */
public class Test {
    @org.junit.Test
    public void abstractfactorytest(){
        Grade grade1=new GradeImpl1();
        grade1.getBoy().playgame();
        grade1.getGirl().playgame();
        Grade grade2=new GradeImpl2();
        grade2.getBoy().playgame();
        grade2.getGirl().playgame();
    }
}
