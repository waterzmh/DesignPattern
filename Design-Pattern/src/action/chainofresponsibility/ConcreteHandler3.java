package action.chainofresponsibility;

/**
 * Created by Administrator on 2017/11/30.
 */
public class ConcreteHandler3 extends Handler{
    @Override
    void HandleRequest(int request) {
        if(request>20 && request<=30){
            System.out.println("命令实现者3实现了命令");
        }
        else if(successor!=null){
            successor.HandleRequest(request);
        }
    }
}
