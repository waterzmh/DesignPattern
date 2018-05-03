package action.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/12/22.
 */
//中介者：总经理
public class President implements Mediator{

    private Map<String,Department> map=new HashMap<>();

    @Override
    public void register(String name, Department d) {
        map.put(name, d);
    }

    @Override
    public void command(String name) {
        map.get(name).ownWork();
    }
}

