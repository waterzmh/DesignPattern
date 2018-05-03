package action.command;

/**
 * Created by Administrator on 2017/12/22.
 */
public class Test {
    @org.junit.Test
    public void commandtest(){
        CommandReceiver commandReceiver =new CommandReceiver();
        Command danceCommand =new DanceCommand(commandReceiver);
        Command jumpCommand =new JumpCommand(commandReceiver);
        Command sitDownCommand =new SitDownCommand(commandReceiver);

        CommandController commandController=new CommandControllerImpl();
        commandController.add(danceCommand);
        commandController.add(jumpCommand);
        commandController.add(sitDownCommand);
        commandController.add(sitDownCommand);
        commandController.add(sitDownCommand);

        commandController.execute();
    }
}
