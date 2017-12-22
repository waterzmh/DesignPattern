package action.strategy;

/**
 * Created by Administrator on 2017/12/22.
 */
public class Test {
    @org.junit.Test
    public void strategytest(){
        Run run=new OldRun();
        Run run1=new ChildRun();
        RunMatch runMatch=new RunMatch(run);
        System.out.println(runMatch.runlengthNeed(1000));
        runMatch.setRun(run1);
        runMatch.runlengthNeed(1000);
        System.out.println(runMatch.runlengthNeed(1000));
    }
}
