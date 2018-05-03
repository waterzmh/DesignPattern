package action.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/12/22.
 */
public class Context {

    private Map<Variable,Boolean> map = new HashMap<Variable,Boolean>();

    public void assign(Variable var , boolean value){
        map.put(var, value);
    }

    public boolean lookup(Variable var) throws IllegalArgumentException{
        Boolean value = map.get(var);
        if(value == null){
            throw new IllegalArgumentException();
        }
        return value;
    }
}
