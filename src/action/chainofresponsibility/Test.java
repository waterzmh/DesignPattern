package action.chainofresponsibility;

/**
 * Created by Administrator on 2017/11/30.
 */
public class Test {
    @org.junit.Test
    public void chainofresponsibilitytest(){
        Handler handler1=new ConcreteHandler1();
        Handler handler2=new ConcreteHandler2();
        Handler handler3=new ConcreteHandler3();
        handler1.setSuccessor(handler2);
        handler2.setSuccessor(handler3);
        int[] requests={1,4,565,6,7,23,2,12,3,14};
        for(int request:requests){
            handler1.HandleRequest(request);
        }

    }
}
