package action.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/12/22.
 */
public class CommandControllerImpl implements CommandController {
    private List<Command> commands =new ArrayList<>();
    @Override
    public void execute() {
        if(commands !=null&& commands.size()>0){
            for(Command command : commands){
                command.execute();
            }
        }

    }

    @Override
    public void add(Command command) {
        commands.add(command);
    }

    @Override
    public void remove(Command command) {
        commands.remove(command);
    }
}
