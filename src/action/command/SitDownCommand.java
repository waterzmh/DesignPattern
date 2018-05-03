package action.command;

/**
 * Created by Administrator on 2017/12/22.
 */
public class SitDownCommand implements Command {
    private CommandReceiver commandReceiver;
    public SitDownCommand(CommandReceiver commandReceiver){
        this.commandReceiver = commandReceiver;
    }
    @Override
    public void execute() {
        commandReceiver.sitDown();
    }
}
