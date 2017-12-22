package action.state;

/**
 * Created by Administrator on 2017/12/8.
 */
public class RepeatVoteState implements  VoteState{
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        System.out.println("请不要重复投票");
    }
}
