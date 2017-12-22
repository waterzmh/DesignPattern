package create.factory.commonfactory;

import java.util.Map;

/**
 * Created by Administrator on 2017/10/15.
 */
public class PersonFactory {

    public Person getPerson(String name){
        try {
            Map<String,String> map=new PropertiesReader().getProperties();
            Person person= (Person) Class.forName(map.get(name)).newInstance();
            return person;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
