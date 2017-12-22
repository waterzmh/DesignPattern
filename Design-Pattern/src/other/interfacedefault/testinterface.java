package other.interfacedefault;

/**
 * Created by Administrator on 2017/9/16.
 */
public interface testinterface {
    void pp(int i );

    default void ppp(int i) {
        System.out.println("wtf???");
    }
}
