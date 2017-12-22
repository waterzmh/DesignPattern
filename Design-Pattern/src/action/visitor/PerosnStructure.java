package action.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/11/30.
 */
public class PerosnStructure {
    private List<Person> list=new ArrayList<>();
    public void add(Person person){
        list.add(person);
    }
    public void remove(Person person){
        list.remove(person);
    }
    public void Display(Action visitor){
        if(list.size()>0) {
            for (Person person : list) {
                person.Accept(visitor);
            }
        }
    }
}
