package action.command;

/**
 * Created by Administrator on 2017/12/22.
 */
public class JumpCommand implements Command {
    private CommandReceiver commandReceiver;
    public JumpCommand(CommandReceiver commandReceiver){
        this.commandReceiver = commandReceiver;
    }
    @Override
    public void execute() {
        commandReceiver.jump();
    }
}
