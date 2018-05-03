package action.memento;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Administrator on 2017/12/22.
 */

/**
 * 管理者角色
 */
public class CareTaker {
//    private EmpMemento memento;
//
//    public EmpMemento getMemento() {
//        return memento;
//    }
//
//    public void setMemento(EmpMemento memento) {
//        this.memento = memento;
//    }
    /**
     * @empMementoStack 将每一次操作放入栈
     * @empMementoStack2 empMementoStack出栈后的数据存入该栈中，方便回滚
     */
    private Stack<EmpMemento> empMementoStack=new Stack<>();
    private Stack<EmpMemento> empMementoStack2=new Stack<>();

    public EmpMemento getMemento() {
        return empMementoStack.peek();
    }

    public void setMemento(EmpMemento memento) {
        empMementoStack.push(memento);
    }

    /**
     * 撤销上一步
     */
    public void revokeOneStep(){
        if(!empMementoStack.empty()) {
            empMementoStack.pop();
            empMementoStack2.push(empMementoStack.peek());
        }else {
            System.out.println("备忘录为空");
        }
    }

    /**
     * 取消撤销上一步
     */
    public void cancelRevokeOneStep(){
        if(!empMementoStack2.empty()) {
            empMementoStack2.pop();
            empMementoStack.push(empMementoStack2.peek());
        }else {
            System.out.println("你还没有撤销过");
        }
    }
}
