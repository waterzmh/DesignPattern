package action.mediator;

/**
 * Created by Administrator on 2017/12/22.
 */
public class Test {
    @org.junit.Test
    public void mediatortest(){
        Mediator president=new President();

        Development devp=new Development(president);
        Finacial fin=new Finacial(president);
        Market mar=new Market(president);

        devp.ownWork();
        devp.outWork();
    }
}
