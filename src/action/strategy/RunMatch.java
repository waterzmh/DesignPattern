package action.strategy;

/**
 * Created by Administrator on 2017/12/22.
 */
public class RunMatch {
    private Run run;
    public RunMatch(Run run){
        this.run=run;
    }
    public void setRun(Run run){
        this.run=run;
    }
    public int runlengthNeed(int length){
        return run.run(length);
    }
}
