package action.command;

/**
 * Created by Administrator on 2017/12/22.
 */
public class DanceCommand implements Command {
    private CommandReceiver commandReceiver;
    public DanceCommand(CommandReceiver commandReceiver){
        this.commandReceiver = commandReceiver;
    }
    @Override
    public void execute() {
        commandReceiver.dance();
    }
}
