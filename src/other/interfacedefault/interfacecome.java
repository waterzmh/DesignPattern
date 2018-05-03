package other.interfacedefault;

/**
 * Created by Administrator on 2017/9/16.
 */
public class interfacecome implements suninterface{
    @Override
    public void pp(int i) {

    }
    public  void ppp(int i){
        suninterface.super.ppp(i);
        System.out.println("我可以重写接口中的默认方法");
    }

    @Override
    public void pppp(int i) {

    }
}
