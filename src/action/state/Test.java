package action.state;

/**
 * Created by Administrator on 2017/12/8.
 */
public class Test {
    @org.junit.Test
    public void votetest(){
        VoteManager voteManager=new VoteManager();
        for(int i=0;i<12;i++){
            voteManager.vote("zmh","me");
        }
    }
}
