package structure.adapter.commonlyadapter;

/**
 * Created by Administrator on 2017/12/21.
 */
public interface Target {
    /**
     * 这是源类Adaptee也有的方法
     */
     void sampleOperation1();
    /**
     * 这是源类Adapteee没有的方法
     */
     void sampleOperation2();
}