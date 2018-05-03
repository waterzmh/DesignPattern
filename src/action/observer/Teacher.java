package action.observer;

import java.util.Observable;

/**
 * Created by Administrator on 2017/10/16.
 */
public class Teacher extends Observable {
    //布置作业的状态信息字符串
    private String info;
    public void setHomework(String info) {

        this.info=info;
        System.out.println("布置的作业是"+info);

        setChanged();
        notifyObservers();
    }
    public String getInfo() {
        return info;
    }
}