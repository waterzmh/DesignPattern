package action.chainofresponsibility;

/**
 * Created by Administrator on 2017/11/30.
 */
public class ConcreteHandler1 extends Handler {
//    public static Logger logger = Logger.getLogger("MyLogger");
    @Override
    void HandleRequest(int request) {
        if(request>0 && request<=10){
//            logger.log(Level.INFO,"命令实现者1实现了命令");
            System.out.println("命令实现者1实现了命令");
        }
        else if(successor!=null){
            successor.HandleRequest(request);
        }
    }
}
