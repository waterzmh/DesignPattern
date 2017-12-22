package structure.bridge;

/**
 * Created by Administrator on 2017/12/21.
 */
public class Test {
    @org.junit.Test
    public void bridgetest(){
        AbstractAction danceAction=new DanceAction();
        danceAction.setPerson(new Man());
        danceAction.dance();
        danceAction.setPerson(new Woman());
        danceAction.dance();
    }
}
