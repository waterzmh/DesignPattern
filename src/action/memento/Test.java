package action.memento;

/**
 * Created by Administrator on 2017/12/22.
 */
public class Test {
    @org.junit.Test
    public void mementotest(){
        CareTaker taker=new CareTaker();

        Emp emp=new Emp("张1",18,2000);
        //第一次备忘
        taker.setMemento(emp.memento());
        System.out.println("第1次打印对象："+taker.getMemento().getName()+
                "----"+taker.getMemento().getAge()+"---"+taker.getMemento().getSalary());

        emp.setName("张2");
        emp.setAge(18);
        emp.setSalary(2000);
        taker.setMemento(emp.memento());
        System.out.println("第2次打印对象："+taker.getMemento().getName()+
                "----"+taker.getMemento().getAge()+"---"+taker.getMemento().getSalary());

        emp.setName("张3");
        emp.setAge(18);
        emp.setSalary(2000);
        taker.setMemento(emp.memento());
        System.out.println("第3次打印对象："+taker.getMemento().getName()+
                "----"+taker.getMemento().getAge()+"---"+taker.getMemento().getSalary());

        emp.setName("张4");
        emp.setAge(18);
        emp.setSalary(2000);
        taker.setMemento(emp.memento());
        System.out.println("第4次打印对象："+taker.getMemento().getName()+
                "----"+taker.getMemento().getAge()+"---"+taker.getMemento().getSalary());

        taker.revokeOneStep();
        System.out.println("第5次打印对象："+taker.getMemento().getName()+
                "----"+taker.getMemento().getAge()+"---"+taker.getMemento().getSalary());

        taker.revokeOneStep();
        System.out.println("第6次打印对象："+taker.getMemento().getName()+
                "----"+taker.getMemento().getAge()+"---"+taker.getMemento().getSalary());

        taker.cancelRevokeOneStep();
        System.out.println("第7次打印对象："+taker.getMemento().getName()+
                "----"+taker.getMemento().getAge()+"---"+taker.getMemento().getSalary());


    }
}
