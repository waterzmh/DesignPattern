package action.chainofresponsibility;

/**
 * Created by Administrator on 2017/11/30.
 */
public abstract class Handler {
    protected Handler successor;
    public void setSuccessor(Handler successor){
        this.successor=successor;
    }
    abstract void HandleRequest(int request);
}
