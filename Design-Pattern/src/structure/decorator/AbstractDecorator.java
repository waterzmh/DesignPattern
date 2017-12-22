package structure.decorator;

/**
 * Created by Administrator on 2017/10/29.
 */
/**
 * @author water
 * @date 2017-12-21
 */
public  abstract class AbstractDecorator implements Person {
    protected Person person;
    public void setPerson(Person person){
        this.person=person;
    }
    @Override
    public void eat(){
        person.eat();
    }
}
