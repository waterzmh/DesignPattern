package action.chainofresponsibility;

/**
 * Created by Administrator on 2017/11/30.
 */
public class ConcreteHandler2 extends Handler{
    @Override
    void HandleRequest(int request) {
        if(request>10 && request<=20){
            System.out.println("命令实现者2实现了命令");
        }
        else if(successor!=null){
            successor.HandleRequest(request);
        }
    }
}
