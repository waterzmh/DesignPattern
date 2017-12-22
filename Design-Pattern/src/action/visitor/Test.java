package action.visitor;
/**
 * Created by Administrator on 2017/11/30.
 */
public class Test {

    @org.junit.Test
    public void test(){
        PerosnStructure perosnStructure=new PerosnStructure();
        perosnStructure.add(new Man());
        perosnStructure.add(new Woman());
        Success success1=new Success();
        perosnStructure.Display(success1);
    }

}
