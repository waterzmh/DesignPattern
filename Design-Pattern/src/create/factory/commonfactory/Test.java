package create.factory.commonfactory;

/**
 * Created by Administrator on 2017/10/15.
 */
public class Test {
    @org.junit.Test
    public void commonfatorytest(){
        PersonFactory personFactory=new PersonFactory();
        Person person=personFactory.getPerson("PersonImpl");
        person.create("");
    }
}
