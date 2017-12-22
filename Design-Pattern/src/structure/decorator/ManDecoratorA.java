package structure.decorator;

/**
 * Created by Administrator on 2017/10/29.
 */
public class ManDecoratorA extends AbstractDecorator {
    @Override
    public void eat(){
        super.eat();
//        reEat();
        System.out.println("ManDecoratorA类");
    }
//    public void reEat(){
//        System.out.println("再吃一顿");
//    }
}
