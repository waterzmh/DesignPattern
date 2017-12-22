package action.state;

/**
 * Created by Administrator on 2017/12/8.
 */
public class BlackVoteState implements VoteState{
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        System.out.println("恭喜你，你被拉入黑名单了！");
    }
}
