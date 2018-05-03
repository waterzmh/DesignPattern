package structure.facade;

/**
 * Created by Administrator on 2017/12/21.
 */
public class Facade {
    private Man man;
    private Woman woman;
    private Child child;
    public Facade(){
        man=new Man();
        woman=new Woman();
        child=new Child();
    }
    public void danceStart(){
        man.danceStart();
        woman.danceStart();
        child.danceStart();
    }
    public void danceStop(){
        man.danceStop();
        woman.danceStop();
        child.danceStop();
    }
}
