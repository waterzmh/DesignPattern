package create.builder;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Created by Administrator on 2017/12/4.
 */
public class Test{
    private final static Logger logger = Logger.getLogger("BuilderObj");
    @org.junit.Test
    public void create(){
        BuilderObj builderObj=new BuilderObj.Builder("zmh",22).setLovebook("ooo").build();
        logger.log(Level.INFO,builderObj.getLovebook());
        builderObj.setLovenum(12321);
        logger.log(Level.INFO, String.valueOf(builderObj.getLovenum()));

    }
}
