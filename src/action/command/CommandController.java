package action.command;

/**
 * Created by Administrator on 2017/12/22.
 */
public interface CommandController extends Command {
    void add(Command command);
    void remove(Command command);
}
