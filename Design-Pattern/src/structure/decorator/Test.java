package structure.decorator;

/**
 *
 * @author Administrator
 * @date 2017/10/29
 */

public class Test{
    @org.junit.Test
    public void decoratortest(){
        Man man=new Man();
        ManDecoratorA manDecoratorA=new ManDecoratorA();
        ManDecoratorB manDecoratorB=new ManDecoratorB();

        manDecoratorA.setPerson(man);
        manDecoratorB.setPerson(manDecoratorA);
        manDecoratorB.eat();
        System.out.println();
        manDecoratorB.setPerson(man);
        manDecoratorB.eat();

    }
}
