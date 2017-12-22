package structure.adapter.commonlyadapter;

/**
 * Created by Administrator on 2017/12/22.
 */
public class Test {
    @org.junit.Test
    public void commonlyadaptertest(){
        Target target=new Adapter(new Adaptee());
        target.sampleOperation1();
        target.sampleOperation2();
    }
}
