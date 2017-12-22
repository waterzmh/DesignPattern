package action.strategy;

/**
 * Created by Administrator on 2017/12/22.
 */
public class OldRun implements Run {
    @Override
    public int run(int length) {
        return (int) (length*0.8);
    }
}
