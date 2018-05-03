package create.factory.commonfactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Created by Administrator on 2017/10/15.
 */
//读取properties文件
public class PropertiesReader {
    public Map<String,String>  getProperties(){
        Properties props=new Properties();
        Map<String,String> map=new HashMap<>();
        InputStream in=getClass().getResourceAsStream("Personname.properties");
        try {
            props.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Enumeration en=props.propertyNames();
        while (en.hasMoreElements()){
            String key= (String) en.nextElement();
            String property=props.getProperty(key);
            map.put(key,property);

        }
        return map;
    }
}
