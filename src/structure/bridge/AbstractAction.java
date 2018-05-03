package structure.bridge;

/**
 * Created by Administrator on 2017/12/21.
 */
public abstract class AbstractAction  {
    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    protected void dance() {
        this.getPerson().dance();
    }
}
